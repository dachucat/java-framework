package course.linkflower.link.oneframework.controller;

import course.linkflower.link.oneframework.common.dto.base.IdDto;
import course.linkflower.link.oneframework.common.model.Result;
import course.linkflower.link.oneframework.dto.CarInfor.CarInforDto;
import course.linkflower.link.oneframework.dto.CarInfor.CarInforNoIdDto;
import course.linkflower.link.oneframework.service.CarInforService;
import course.linkflower.link.oneframework.vo.carinfor.CarInforVo;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@Slf4j
@RequestMapping("/carInfor")
@RefreshScope
public class CarInforController {
    @Autowired
    private CarInforService carInforService;
    @PostMapping("/add")
    public Result<CarInforVo> add(@RequestBody CarInforNoIdDto carInforNoIdDto){
        return carInforService.add(carInforNoIdDto);
    }

    @PostMapping("/deleteById")
    public Result deleteById(@RequestBody IdDto idDto){
        return carInforService.deleteById(idDto);
    }

    @PostMapping("/updateById")
    public Result<CarInforVo> updateById(@RequestBody CarInforDto carInforDto){
        return carInforService.updateById(carInforDto);
    }

    @PostMapping("/getCarInforById")
    public Result<CarInforVo> getCarInforById(@RequestBody IdDto idDto){
        return carInforService.getCarInforById(idDto);
    }
}
