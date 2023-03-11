package course.linkflower.link.oneframework.controller;

import course.linkflower.link.oneframework.common.dto.base.IdDto;
import course.linkflower.link.oneframework.common.model.Result;
import course.linkflower.link.oneframework.dto.carpattern.CarPatternDto;
import course.linkflower.link.oneframework.dto.carpattern.CarPatternNoIdDto;
import course.linkflower.link.oneframework.service.CarPatternService;
import course.linkflower.link.oneframework.vo.carpattern.CarPatternVo;
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
@RequestMapping("/carPattern")
@RefreshScope
public class CarPatternController {
    @Autowired
    private CarPatternService carPatternService;
        @PostMapping("/add")
    public Result<CarPatternVo> add(@RequestBody CarPatternNoIdDto carPatternNoIdDto){
        return carPatternService.add(carPatternNoIdDto);
    }

    @PostMapping("/deleteById")
    public Result deleteById(@RequestBody IdDto idDto){
        return carPatternService.deleteById(idDto);
    }

    @PostMapping("/updateById")
    public Result<CarPatternVo> updateById(@RequestBody CarPatternDto carPatternDto){
        return carPatternService.updateById(carPatternDto);
    }

    @PostMapping("/listCarPatternByCarBrandId")
    public Result<List<CarPatternVo>> listCarPatternByCarBrandId(@RequestBody IdDto idDto){
        return carPatternService.listCarPatternByCarBrandId(idDto);
    }

    @PostMapping("/getCarPatternById")
    public Result<CarPatternVo> getCarPatternById(@RequestBody IdDto idDto){
        return carPatternService.getCarPatternById(idDto);
    }
}
