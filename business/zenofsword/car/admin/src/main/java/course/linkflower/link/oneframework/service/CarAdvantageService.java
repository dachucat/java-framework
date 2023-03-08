package course.linkflower.link.oneframework.service;

import course.linkflower.link.oneframework.common.dto.base.IdDto;
import course.linkflower.link.oneframework.common.model.Result;
import course.linkflower.link.oneframework.dto.caradvantage.CarAdvantageDto;
import course.linkflower.link.oneframework.dto.caradvantage.CarAdvantageNoIdDto;
import course.linkflower.link.oneframework.vo.caradvantage.CarAdvantageVo;

public interface CarAdvantageService {

    Result<CarAdvantageVo> add(CarAdvantageNoIdDto carAdvantageNoIdDto);

    Result<CarAdvantageVo> getCarAdvantageById(IdDto idDto);

    CarAdvantageVo getCarAdvantageById(Long aLong);

    Result deleteById(IdDto idDto);

    Result<CarAdvantageVo> updateById(CarAdvantageDto carAdvantageDto);
}
