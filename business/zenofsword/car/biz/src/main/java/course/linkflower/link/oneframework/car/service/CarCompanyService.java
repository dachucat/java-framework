package course.linkflower.link.oneframework.car.service;

import course.linkflower.link.oneframework.common.dto.base.IdDto;
import course.linkflower.link.oneframework.common.model.Result;
import course.linkflower.link.oneframework.car.dto.carcompany.CarCompanyDto;
import course.linkflower.link.oneframework.car.dto.carcompany.CarCompanyNoIdDto;
import course.linkflower.link.oneframework.car.model.CarCompany;
import course.linkflower.link.oneframework.car.vo.carcompany.CarCompanyNoIdVo;

public interface CarCompanyService {

    Result<CarCompanyNoIdVo> add(CarCompanyNoIdDto carCompanyNoIdDto);

    Result<CarCompanyNoIdVo> update(CarCompanyDto carCompanyDto);

    Result deleteById(IdDto idDto);
}
