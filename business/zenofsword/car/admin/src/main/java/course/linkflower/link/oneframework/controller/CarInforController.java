package course.linkflower.link.oneframework.controller;

import course.linkflower.link.oneframework.common.model.Result;
import course.linkflower.link.oneframework.dto.CarInfor.CarInforNoIdDto;
import course.linkflower.link.oneframework.service.CarInforService;
import course.linkflower.link.oneframework.vo.carinfor.CarInforVo;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@Slf4j
@RequestMapping("/CarInfor")
@RefreshScope
public class CarInforController {
    @Autowired
    private CarInforService carInforService;
    @PostMapping("/add")
    public Result<CarInforVo> add(CarInforNoIdDto carInforNoIdDto){
        return carInforService.add(carInforNoIdDto);
    }
}
