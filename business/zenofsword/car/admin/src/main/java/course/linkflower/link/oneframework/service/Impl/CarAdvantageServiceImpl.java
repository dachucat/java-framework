package course.linkflower.link.oneframework.service.Impl;

import course.linkflower.link.oneframework.common.constant.BaseErrorContst;
import course.linkflower.link.oneframework.common.dto.base.IdDto;
import course.linkflower.link.oneframework.common.model.Result;
import course.linkflower.link.oneframework.dao.CarAdvantageMapper;
import course.linkflower.link.oneframework.dto.caradvantage.CarAdvantageDto;
import course.linkflower.link.oneframework.dto.caradvantage.CarAdvantageNoIdDto;
import course.linkflower.link.oneframework.model.CarAdvantage;
import course.linkflower.link.oneframework.service.CarAdvantageService;
import course.linkflower.link.oneframework.vo.caradvantage.CarAdvantageVo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CarAdvantageServiceImpl implements CarAdvantageService {
    @Autowired
    private CarAdvantageMapper carAdvantageMapper;

    @Override
    public Result<CarAdvantageVo> add(CarAdvantageNoIdDto carAdvantageNoIdDto) {
        if (carAdvantageMapper.countAttribKey(carAdvantageNoIdDto.getAttribKey())!=0){
            return Result.of(null, BaseErrorContst.BaseErrorTimeParamDuplicateError,
                    String.format(BaseErrorContst.BaseMsgTimeParamsDuplicateError,"attribKey建立了唯一索引"));
        }
        CarAdvantage carAdvantage=carAdvantageNoIdDto.toModel(carAdvantageNoIdDto);
        carAdvantageMapper.add(carAdvantage);
        return Result.succeed(getCarAdvantageById(carAdvantage.getId()));
    }

    @Override
    public Result<CarAdvantageVo> getCarAdvantageById(IdDto idDto) {
        return Result.succeed(getCarAdvantageById(Long.parseLong(idDto.getId())));
    }

    @Override
    public Result<CarAdvantageVo> updateById(CarAdvantageDto carAdvantageDto) {
        if (carAdvantageMapper.countAttribKeyDiffId(carAdvantageDto.getAttribKey(),Long.parseLong(carAdvantageDto.getId()))!=0){
            return Result.of(null, BaseErrorContst.BaseErrorTimeParamDuplicateError,
                    String.format(BaseErrorContst.BaseMsgTimeParamsDuplicateError,"type_key"));
        }
        carAdvantageMapper.updateById(carAdvantageDto);
        return Result.succeed(getCarAdvantageById(Long.parseLong(carAdvantageDto.getId())));
    }

    @Override
    public Result deleteById(IdDto idDto) {
        carAdvantageMapper.deleteById(Long.parseLong(idDto.getId()));
        return Result.succeed();
    }

    @Override
    public CarAdvantageVo getCarAdvantageById(Long aLong) {
        return carAdvantageMapper.getCarAdvantageById(aLong);
    }
}
