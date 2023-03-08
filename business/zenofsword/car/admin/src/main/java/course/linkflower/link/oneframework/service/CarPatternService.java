package course.linkflower.link.oneframework.service;

import course.linkflower.link.oneframework.common.dto.base.IdDto;
import course.linkflower.link.oneframework.common.model.Result;
import course.linkflower.link.oneframework.dto.carpattern.CarPatternDto;
import course.linkflower.link.oneframework.dto.carpattern.CarPatternNoIdDto;
import course.linkflower.link.oneframework.vo.carpattern.CarPatternVo;

import java.util.List;

public interface CarPatternService {

    Result<CarPatternVo> add(CarPatternNoIdDto carPatternNoIdDto);

    Result deleteById(IdDto idDto);

    Result<CarPatternVo> updateById(CarPatternDto carPatternDto);

    Result<List<CarPatternVo>> listCarPatternByCarBrandId(IdDto idDto);

    Result<CarPatternVo> getCarPatternById(IdDto idDto);
}
