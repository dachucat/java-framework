package course.linkflower.link.oneframework.controller;

import course.linkflower.link.oneframework.common.constant.ApisConstant;
import course.linkflower.link.oneframework.common.dto.base.IdDto;
import course.linkflower.link.oneframework.common.model.Result;
import course.linkflower.link.oneframework.dto.carbrand.CarBrandDto;
import course.linkflower.link.oneframework.dto.carbrand.CarBrandNoIdDto;
import course.linkflower.link.oneframework.service.CarBrandService;
import course.linkflower.link.oneframework.vo.carbrand.CarBrandVo;
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
@RequestMapping(ApisConstant.ApiV1 + "/carBrand")
@RefreshScope
public class CarBrandController {

    @Autowired
    private CarBrandService carBrandService;

    @PostMapping("/add")
    public Result<CarBrandVo> add(@RequestBody CarBrandNoIdDto carBrandNoIdDto){
        return carBrandService.add(carBrandNoIdDto);
    }

    @PostMapping("/deleteById")
    public Result deleteById(@RequestBody IdDto idDto){
        return carBrandService.deleteById(idDto);
    }

    @PostMapping("/update")
    public Result<CarBrandVo> update(@RequestBody CarBrandDto carBrandDto){
        return carBrandService.update(carBrandDto);
    }

    @PostMapping("/getCarBrandById")
    public Result<CarBrandVo> getCarBrandById(@RequestBody IdDto idDto){
        return carBrandService.getCarBrandById(idDto);
    }

    @PostMapping("/listNameByCarCompanyId")
    public Result<List<CarBrandVo>> listNameByCarCompanyId(@RequestBody IdDto idDto){
        return carBrandService.listNameByCarCompanyId(idDto);
    }
}
