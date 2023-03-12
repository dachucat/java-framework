package course.linkflower.link.oneframework.service.Impl;

import course.linkflower.link.oneframework.common.constant.BaseErrorContst;
import course.linkflower.link.oneframework.common.constant.DbConstant;
import course.linkflower.link.oneframework.common.dto.PageDto;
import course.linkflower.link.oneframework.common.dto.base.IdDto;
import course.linkflower.link.oneframework.common.dto.base.TypeDto;
import course.linkflower.link.oneframework.common.model.PageResult;
import course.linkflower.link.oneframework.common.model.Result;
import course.linkflower.link.oneframework.dao.CarDictionaryMapper;
import course.linkflower.link.oneframework.dto.cardictionary.CarDictionaryDto;
import course.linkflower.link.oneframework.dto.cardictionary.CarDictionaryNoIdDto;
import course.linkflower.link.oneframework.model.CarDictionary;
import course.linkflower.link.oneframework.service.CarDictionaryService;
import course.linkflower.link.oneframework.vo.CarDictionary.CarDictionaryShowVo;
import course.linkflower.link.oneframework.vo.CarDictionary.CarDictionaryVo;
import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CarDictionaryServiceImpl implements CarDictionaryService {
    @Autowired
    private CarDictionaryMapper carDictionaryMapper;
    @Override
    public Result<CarDictionaryVo> add(CarDictionaryNoIdDto carDictionaryNoIdDto) {
        if (carDictionaryMapper.countTypeValue(carDictionaryNoIdDto.getType(), carDictionaryNoIdDto.getValue()) != 0) {
            return Result.of(null, BaseErrorContst.BaseErrorTimeParamDuplicateError,
                    String.format(BaseErrorContst.BaseMsgTimeParamsDuplicateError, "type与value建立了唯一索引"));
        }
        if (StringUtils.isEmpty(carDictionaryNoIdDto.getOrdering())) {
            Integer integer=carDictionaryMapper.lastOrderingByType(carDictionaryNoIdDto.getType());
            if (integer == null){
                integer=0;
            }
                carDictionaryNoIdDto.setOrdering(String.valueOf(integer+1));
        }
        CarDictionary carDictionary = carDictionaryNoIdDto.toModel(carDictionaryNoIdDto);
        carDictionaryMapper.add(carDictionary);
        return Result.succeed(carDictionaryMapper.getCarDictById(carDictionary.getId()));
    }

    @Override
    public Result deleteById(IdDto idDto) {
        carDictionaryMapper.deleteById(Long.parseLong(idDto.getId()));
        return Result.succeed();
    }

    @Override
    public Result<CarDictionaryVo> update(CarDictionaryDto carDictionaryDto) {
        if (carDictionaryMapper.countTypeValuediffId(carDictionaryDto.getType(), carDictionaryDto.getValue(), Long.parseLong(carDictionaryDto.getId())) != 0) {
            return Result.of(null, BaseErrorContst.BaseErrorTimeParamDuplicateError,
                    String.format(BaseErrorContst.BaseMsgTimeParamsDuplicateError, "type与value建立了唯一索引"));
        }
        if (StringUtils.isEmpty(carDictionaryDto.getOrdering())) {
            Integer integer = carDictionaryMapper.lastOrderingByType(carDictionaryDto.getType());
            if (integer == null) {
                integer = 0;
            }
            carDictionaryDto.setOrdering(String.valueOf(integer + 1));
        }
        carDictionaryMapper.update(carDictionaryDto.toModel(carDictionaryDto));
        return Result.succeed(carDictionaryMapper.getCarDictById(Long.parseLong(carDictionaryDto.getId())));
    }

    @Override
    public Result<List<CarDictionaryVo>> listCarDictionaryByType(TypeDto typeDto) {
        return Result.succeed(carDictionaryMapper.listCarDictionaryByType(typeDto.getType(), DbConstant.DefaultMaxCountLimit));
    }

    @Override
    public PageResult<CarDictionaryShowVo> search(PageDto pageDto) {
        List<CarDictionaryShowVo> list=carDictionaryMapper.search(pageDto.getPage()* pageDto.getPageSize(),pageDto.getPageSize());
        PageResult pageResult=new PageResult<>();
        pageResult.setData(list);
        pageResult.setCount(carDictionaryMapper.countAll());
        return pageResult;
    }
}
