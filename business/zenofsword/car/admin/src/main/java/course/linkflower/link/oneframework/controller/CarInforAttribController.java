package course.linkflower.link.oneframework.controller;

import course.linkflower.link.oneframework.common.dto.base.IdDto;
import course.linkflower.link.oneframework.common.model.Result;
import course.linkflower.link.oneframework.dto.carinforattrib.CarInforAttribDto;
import course.linkflower.link.oneframework.dto.carinforattrib.CarInforAttribNoIdDto;
import course.linkflower.link.oneframework.service.CarInforAttribService;
import course.linkflower.link.oneframework.vo.carinforattrib.CarInforAttribVo;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@Slf4j
@RequestMapping("/carInforAttribController")
@RefreshScope
public class CarInforAttribController {
    @Autowired
    private CarInforAttribService carInforAttribService;
    @PostMapping("/add")
    public Result<CarInforAttribVo> add(CarInforAttribNoIdDto carInforAttribNoIdDto){
        return carInforAttribService.add(carInforAttribNoIdDto);
    }

    @PostMapping("/deleteById")
    public Result deleteById(IdDto idDto){
        return carInforAttribService.deleteById(idDto);
    }

    @PostMapping("/updateById")
    public Result<CarInforAttribVo> updateById(CarInforAttribDto carInforAttribDto){
        return carInforAttribService.updateById(carInforAttribDto);
    }

    @PostMapping("/getCarInforAttribById")
    public Result<CarInforAttribVo> getCarInforAttribById(IdDto idDto){
        return carInforAttribService.getCarInforAttribById(idDto);
    }
}
