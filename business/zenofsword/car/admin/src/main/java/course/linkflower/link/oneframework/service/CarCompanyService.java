package course.linkflower.link.oneframework.service;

import course.linkflower.link.oneframework.common.dto.base.IdDto;
import course.linkflower.link.oneframework.common.model.Result;
import course.linkflower.link.oneframework.dto.carcompany.CarCompanyDto;
import course.linkflower.link.oneframework.dto.carcompany.CarCompanyNoIdDto;
import course.linkflower.link.oneframework.vo.carcompany.CarCompanyVo;

public interface CarCompanyService {

    Result<CarCompanyVo> add(CarCompanyNoIdDto carCompanyNoIdDto);

    Result<CarCompanyVo> update(CarCompanyDto carCompanyDto);

    Result deleteById(IdDto idDto);

    Result<CarCompanyVo> getCarCompanyById(IdDto idDto);
}
