package course.linkflower.link.oneframework.service.Impl;

import course.linkflower.link.oneframework.common.constant.BaseErrorContst;
import course.linkflower.link.oneframework.common.constant.DbConstant;
import course.linkflower.link.oneframework.common.dto.PageDto;
import course.linkflower.link.oneframework.common.dto.base.IdDto;
import course.linkflower.link.oneframework.common.model.PageResult;
import course.linkflower.link.oneframework.common.model.Result;
import course.linkflower.link.oneframework.dao.CarInforAttribMapper;
import course.linkflower.link.oneframework.dto.carinforattrib.CarInforAttribDto;
import course.linkflower.link.oneframework.dto.carinforattrib.CarInforAttribNoIdDto;
import course.linkflower.link.oneframework.model.CarInforAttrib;
import course.linkflower.link.oneframework.service.CarInforAttribService;
import course.linkflower.link.oneframework.vo.carinforattrib.CarInforAttribShowVo;
import course.linkflower.link.oneframework.vo.carinforattrib.CarInforAttribVo;
import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CarInforAttribServiceImpl implements CarInforAttribService {
    @Autowired
    private CarInforAttribMapper carInforAttribMapper;

    @Override
    public Result<List<CarInforAttribVo>> listCarInforAttribByCarInforId(IdDto idDto) {
        return Result.succeed(carInforAttribMapper.listCarInforAttribByCarInforId(Long.parseLong(idDto.getId()),
                DbConstant.DefaultMaxCountLimit));
    }

    @Override
    public PageResult<CarInforAttribShowVo> search(PageDto pageDto) {
        List<CarInforAttribVo> carInforAttribVos=carInforAttribMapper.search(pageDto.getPageSize()*(pageDto.getPage()-1),
                pageDto.getPageSize());
        PageResult pageResult=new PageResult<>();
        pageResult.setData(carInforAttribVos);
        pageResult.setCount(carInforAttribMapper.countAll());
        return pageResult;
    }

    @Override
    public Result<CarInforAttribVo> updateById(CarInforAttribDto carInforAttribDto) {
        if (carInforAttribMapper.countCarInforIdAttribKeyValueDiffId(Long.parseLong(carInforAttribDto.getCarInforId()),
                carInforAttribDto.getAttribKey(),Long.parseLong(carInforAttribDto.getValue()),Long.parseLong(carInforAttribDto.getId()))!=0){
            return Result.of(null, BaseErrorContst.BaseErrorTimeParamDuplicateError,
                    String.format(BaseErrorContst.BaseMsgTimeParamsDuplicateError,
                            "carInforId与attribKey与value建立了唯一索引，该索引的参数重复"));
        }
        CarInforAttrib carInforAttrib=carInforAttribDto.toModel();
        carInforAttribMapper.updateById(carInforAttrib);
        return Result.succeed(carInforAttribMapper.getCarInforAttribById(Long.parseLong(carInforAttribDto.getId())));
    }

    @Override
    public Result deleteById(IdDto idDto) {
        carInforAttribMapper.deleteById(Long.valueOf(idDto.getId()));
        return Result.succeed();
    }

    @Override
    public Result<CarInforAttribVo> getCarInforAttribById(IdDto idDto) {
        return Result.succeed(carInforAttribMapper.getCarInforAttribById(Long.parseLong(idDto.getId())));
    }

    @Override
    public Result<CarInforAttribVo> add(CarInforAttribNoIdDto carInforAttribNoIdDto) {
        if (StringUtils.isNotEmpty(carInforAttribNoIdDto.getValue())) {
            if (carInforAttribMapper.countCarInforIdAttribKeyValue(Long.parseLong(carInforAttribNoIdDto.getCarInforId()),
                    carInforAttribNoIdDto.getAttribKey(), Long.parseLong(carInforAttribNoIdDto.getValue())) != 0) {
                return Result.of(null, BaseErrorContst.BaseErrorTimeParamDuplicateError,
                        String.format(BaseErrorContst.BaseMsgTimeParamsDuplicateError,
                                "carInforId与attribKey与value建立了唯一索引，该索引的参数重复"));
            }
        }else {
            if(carInforAttribMapper.countCarInforIdAttribKey(Long.parseLong(carInforAttribNoIdDto.getCarInforId()),
                    carInforAttribNoIdDto.getAttribKey())!=0){
                return Result.of(null, BaseErrorContst.BaseErrorTimeParamDuplicateError,
                        String.format(BaseErrorContst.BaseMsgTimeParamsDuplicateError,
                                "carInforId与attribKey与value建立了唯一索引，该索引的参数重复"));
            }
        }
        CarInforAttrib carInforAttrib=carInforAttribNoIdDto.toModel();
        carInforAttribMapper.add(carInforAttrib);
        return Result.succeed(new CarInforAttribVo().loadFrom(carInforAttrib));
    }

}
