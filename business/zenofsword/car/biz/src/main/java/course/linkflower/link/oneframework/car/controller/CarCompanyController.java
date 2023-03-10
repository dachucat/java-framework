package course.linkflower.link.oneframework.car.controller;

import course.linkflower.link.oneframework.common.dto.base.IdDto;
import course.linkflower.link.oneframework.common.model.Result;
import course.linkflower.link.oneframework.car.dto.carcompany.CarCompanyDto;
import course.linkflower.link.oneframework.car.dto.carcompany.CarCompanyNoIdDto;
import course.linkflower.link.oneframework.car.model.CarCompany;
import course.linkflower.link.oneframework.car.service.CarCompanyService;
import course.linkflower.link.oneframework.car.vo.carcompany.CarCompanyNoIdVo;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@Slf4j
@RequestMapping("carCompany")
@RefreshScope
public class CarCompanyController {
    @Autowired
    private CarCompanyService carCompanyService;

    @PostMapping("/add")
    public Result<CarCompanyNoIdVo> add(@RequestBody CarCompanyNoIdDto carCompanyNoIdDto){
        return carCompanyService.add(carCompanyNoIdDto);
    }

    @PostMapping("/update")
    public Result<CarCompanyNoIdVo> update(@RequestBody CarCompanyDto carCompanyDto){
        return carCompanyService.update(carCompanyDto);
    }

    @PostMapping("/deleteById")
    public Result deleteById(@RequestBody IdDto idDto){
        return carCompanyService.deleteById(idDto);
    }
}
