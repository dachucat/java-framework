package course.linkflower.link.oneframework.service;

import course.linkflower.link.oneframework.common.dto.base.IdDto;
import course.linkflower.link.oneframework.common.model.Result;
import course.linkflower.link.oneframework.dto.carcompany.CarCompanyDto;
import course.linkflower.link.oneframework.dto.carcompany.CarCompanyNoIdDto;
import course.linkflower.link.oneframework.vo.carcompany.CarCompanyNoIdVo;

public interface CarCompanyService {

    Result<CarCompanyNoIdVo> add(CarCompanyNoIdDto carCompanyNoIdDto);

    Result<CarCompanyNoIdVo> update(CarCompanyDto carCompanyDto);

    Result deleteById(IdDto idDto);
}
