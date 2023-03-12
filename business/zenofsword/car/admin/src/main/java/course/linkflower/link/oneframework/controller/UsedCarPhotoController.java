package course.linkflower.link.oneframework.controller;

import course.linkflower.link.oneframework.common.constant.ApisConstant;
import course.linkflower.link.oneframework.common.dto.base.IdDto;
import course.linkflower.link.oneframework.common.model.Result;
import course.linkflower.link.oneframework.dto.usedcarphoto.UsedCarPhotoDto;
import course.linkflower.link.oneframework.dto.usedcarphoto.UsedCarPhotoNoIdDto;
import course.linkflower.link.oneframework.service.UsedCarPhotoService;
import course.linkflower.link.oneframework.vo.usedcarphoto.UsedCarPhotoVo;
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
@RequestMapping(ApisConstant.ApiV1+"/usedcarphoto")
@RefreshScope
public class UsedCarPhotoController {
    @Autowired
    private UsedCarPhotoService usedCarPhotoService;
    @PostMapping("/add")
    public Result<UsedCarPhotoVo> add(@RequestBody UsedCarPhotoNoIdDto usedCarPhotoNoIdDto){
        return usedCarPhotoService.add(usedCarPhotoNoIdDto);
    }

    @PostMapping("/deletebyid")
    public Result deleteById(@RequestBody IdDto idDto){
        return usedCarPhotoService.deleteById(idDto);
    }

    @PostMapping("/updatebyid")
    public Result<UsedCarPhotoVo> updateById(@RequestBody UsedCarPhotoDto usedCarPhotoDto){
        return usedCarPhotoService.updateById(usedCarPhotoDto);
    }

    @PostMapping("/listphotobyusedcarid")
    public Result<List<UsedCarPhotoVo>> listPhotoByUsedCarId(@RequestBody IdDto idDto){
        return usedCarPhotoService.listPhotoByUsedCarId(idDto);
    }
}
