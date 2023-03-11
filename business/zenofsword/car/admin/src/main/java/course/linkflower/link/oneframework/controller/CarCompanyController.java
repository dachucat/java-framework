package course.linkflower.link.oneframework.controller;

import course.linkflower.link.oneframework.common.constant.ApisConstant;
import course.linkflower.link.oneframework.common.dto.PageDto;
import course.linkflower.link.oneframework.common.dto.base.IdDto;
import course.linkflower.link.oneframework.common.model.PageResult;
import course.linkflower.link.oneframework.common.model.Result;
import course.linkflower.link.oneframework.dto.carcompany.CarCompanyDto;
import course.linkflower.link.oneframework.dto.carcompany.CarCompanyNoIdDto;
import course.linkflower.link.oneframework.service.CarCompanyService;
import course.linkflower.link.oneframework.vo.carcompany.CarCompanyShowVo;
import course.linkflower.link.oneframework.vo.carcompany.CarCompanyVo;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@Slf4j
@RequestMapping(ApisConstant.ApiV1+ "/carcompany")
@RefreshScope
public class CarCompanyController {
    @Autowired
    private CarCompanyService carCompanyService;

    @PostMapping("/add")
    public Result<CarCompanyVo> add(@RequestBody CarCompanyNoIdDto carCompanyNoIdDto){
        return carCompanyService.add(carCompanyNoIdDto);
    }

    @PostMapping("/update")
    public Result<CarCompanyVo> update(@RequestBody CarCompanyDto carCompanyDto){
        return carCompanyService.update(carCompanyDto);
    }

    @PostMapping("/deletebyid")
    public Result deleteById(@RequestBody IdDto idDto){
        return carCompanyService.deleteById(idDto);
    }

    @PostMapping("/getcarcompanybyid")
    public Result<CarCompanyVo> getCarCompanyById(@RequestBody IdDto idDto){
        return carCompanyService.getCarCompanyById(idDto);
    }

    @PostMapping("/search")
    public PageResult<CarCompanyShowVo> search(@RequestBody PageDto pageDto){
        return carCompanyService.search(pageDto);
    }
}
