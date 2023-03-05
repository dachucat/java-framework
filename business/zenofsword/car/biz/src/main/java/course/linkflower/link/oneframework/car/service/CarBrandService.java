package course.linkflower.link.oneframework.car.service;

import course.linkflower.link.oneframework.common.dto.base.IdDto;
import course.linkflower.link.oneframework.common.model.Result;
import course.linkflower.link.oneframework.car.dto.carbrand.CarBrandDto;
import course.linkflower.link.oneframework.car.dto.carbrand.CarBrandNoIdDto;
import course.linkflower.link.oneframework.car.vo.carbrand.CarBrandNoIdVo;

import java.util.List;

public interface CarBrandService {
    Result<CarBrandNoIdVo> add(CarBrandNoIdDto carBrandNoIdDto);

    Result deleteById(IdDto idDto);

    Result<CarBrandNoIdVo> update(CarBrandDto carBrandDto);

    Result<CarBrandNoIdVo> getCarBrandById(IdDto idDto);

    Result<List<CarBrandNoIdVo>> listNameByCarCompanyId(IdDto idDto);
}
