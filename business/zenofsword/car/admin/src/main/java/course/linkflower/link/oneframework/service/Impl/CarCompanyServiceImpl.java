package course.linkflower.link.oneframework.service.Impl;

import course.linkflower.link.oneframework.dao.CarCompanyMapper;
import course.linkflower.link.oneframework.service.CarCompanyService;
import course.linkflower.link.oneframework.common.dto.base.IdDto;
import course.linkflower.link.oneframework.common.model.Result;
import course.linkflower.link.oneframework.dto.carcompany.CarCompanyDto;
import course.linkflower.link.oneframework.dto.carcompany.CarCompanyNoIdDto;
import course.linkflower.link.oneframework.model.CarCompany;
import course.linkflower.link.oneframework.vo.carcompany.CarCompanyNoIdVo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CarCompanyServiceImpl implements CarCompanyService {
    @Autowired
    private CarCompanyMapper carCompanyMapper;

    @Override
    public Result deleteById(IdDto idDto) {
        carCompanyMapper.deleteById(Long.parseLong(idDto.getId()));
        return Result.succeed();
    }

    @Override
    public Result<CarCompanyNoIdVo> update(CarCompanyDto carCompanyDto) {
        CarCompany carCompany = carCompanyDto.toModel(carCompanyDto);
        carCompanyMapper.update(carCompany);
        return Result.succeed(carCompanyMapper.getCarCompanyById(Long.parseLong(carCompanyDto.getId())));
    }

    @Override
    public Result<CarCompanyNoIdVo> add(CarCompanyNoIdDto carCompanyNoIdDto) {
        CarCompany carCompany=carCompanyNoIdDto.toModel(carCompanyNoIdDto);
        carCompanyMapper.add(carCompany);
        return Result.succeed(new CarCompanyNoIdVo().loadFrom(carCompany));
    }
}
