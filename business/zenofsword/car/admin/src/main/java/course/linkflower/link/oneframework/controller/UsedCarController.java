package course.linkflower.link.oneframework.controller;

import course.linkflower.link.oneframework.common.dto.base.IdDto;
import course.linkflower.link.oneframework.common.model.Result;
import course.linkflower.link.oneframework.dto.usedcar.PostDateDto;
import course.linkflower.link.oneframework.dto.usedcar.UsedCarDto;
import course.linkflower.link.oneframework.dto.usedcar.UsedCarNoIdDto;
import course.linkflower.link.oneframework.service.UsedCarService;
import course.linkflower.link.oneframework.vo.usedcar.UsedCarVo;
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
@RequestMapping("/UsedCar")
@RefreshScope
public class UsedCarController {
    @Autowired
    private UsedCarService usedCarService;
    @PostMapping("add")
    public Result<UsedCarVo> add(@RequestBody UsedCarNoIdDto usedCarNoIdDto){
        return usedCarService.add(usedCarNoIdDto);
    }

    @PostMapping("deleteById")
    public Result deleteById(@RequestBody IdDto idDto){
        return usedCarService.deleteById(idDto);
    }

    @PostMapping("updateById")
    public Result<UsedCarVo> updateById(@RequestBody UsedCarDto usedCarDto){
        return usedCarService.updateById(usedCarDto);
    }

    @PostMapping("getUsedCarById")
    public Result<UsedCarVo> getUsedCarById(@RequestBody IdDto idDto){
        return usedCarService.getUsedCarById(idDto);
    }

    @PostMapping("listUsedCarByPostDate")
    public Result<List<UsedCarVo>> listUsedCarByPostDate(@RequestBody PostDateDto postDateDto){
        return usedCarService.listUsedCarByPostDate(postDateDto);
    }
}