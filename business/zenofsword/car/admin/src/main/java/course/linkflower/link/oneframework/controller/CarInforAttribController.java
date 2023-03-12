package course.linkflower.link.oneframework.controller;

import cn.hutool.db.Page;
import course.linkflower.link.oneframework.common.constant.ApisConstant;
import course.linkflower.link.oneframework.common.dto.PageDto;
import course.linkflower.link.oneframework.common.dto.base.IdDto;
import course.linkflower.link.oneframework.common.model.PageResult;
import course.linkflower.link.oneframework.common.model.Result;
import course.linkflower.link.oneframework.dto.carinforattrib.CarInforAttribDto;
import course.linkflower.link.oneframework.dto.carinforattrib.CarInforAttribNoIdDto;
import course.linkflower.link.oneframework.service.CarInforAttribService;
import course.linkflower.link.oneframework.vo.carinforattrib.CarInforAttribShowVo;
import course.linkflower.link.oneframework.vo.carinforattrib.CarInforAttribVo;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.security.core.parameters.P;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@Slf4j
@RequestMapping(ApisConstant.ApiV1+"/carinforattrib")
@RefreshScope
public class CarInforAttribController {
    @Autowired
    private CarInforAttribService carInforAttribService;
    @PostMapping("/add")
    public Result<CarInforAttribVo> add(@RequestBody CarInforAttribNoIdDto carInforAttribNoIdDto){
        return carInforAttribService.add(carInforAttribNoIdDto);
    }

    @PostMapping("/deletebyid")
    public Result deleteById(@RequestBody IdDto idDto){
        return carInforAttribService.deleteById(idDto);
    }

    @PostMapping("/updatebyid")
    public Result<CarInforAttribVo> updateById(@RequestBody CarInforAttribDto carInforAttribDto){
        return carInforAttribService.updateById(carInforAttribDto);
    }

    @PostMapping("/getcarinforattribbyid")
    public Result<CarInforAttribVo> getCarInforAttribById(@RequestBody IdDto idDto){
        return carInforAttribService.getCarInforAttribById(idDto);
    }

    @PostMapping("/listcarinforattribbycarinforid")
    public Result<List<CarInforAttribVo>> listCarInforAttribByCarInforId(@RequestBody IdDto idDto){
        return carInforAttribService.listCarInforAttribByCarInforId(idDto);
    }

    @PostMapping("/search")
    public PageResult<CarInforAttribShowVo> search(PageDto pageDto){
        return carInforAttribService.search(pageDto);
    }
}
