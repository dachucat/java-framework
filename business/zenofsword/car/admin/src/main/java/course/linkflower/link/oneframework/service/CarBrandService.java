package course.linkflower.link.oneframework.service;

import course.linkflower.link.oneframework.common.dto.PageDto;
import course.linkflower.link.oneframework.common.dto.base.IdDto;
import course.linkflower.link.oneframework.common.model.PageResult;
import course.linkflower.link.oneframework.common.model.Result;
import course.linkflower.link.oneframework.dto.carbrand.CarBrandDto;
import course.linkflower.link.oneframework.dto.carbrand.CarBrandNoIdDto;
import course.linkflower.link.oneframework.vo.carbrand.CarBrandShowVo;
import course.linkflower.link.oneframework.vo.carbrand.CarBrandVo;

import java.util.List;

public interface CarBrandService {
    Result<CarBrandVo> add(CarBrandNoIdDto carBrandNoIdDto);

    Result deleteById(IdDto idDto);

    Result<CarBrandVo> update(CarBrandDto carBrandDto);

    Result<CarBrandVo> getCarBrandById(IdDto idDto);

    Result<List<CarBrandVo>> listNameByCarCompanyId(IdDto idDto);

    Result<PageResult<CarBrandShowVo>> search(PageDto pageDto);
}
