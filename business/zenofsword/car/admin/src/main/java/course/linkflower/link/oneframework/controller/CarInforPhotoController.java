package course.linkflower.link.oneframework.controller;

import course.linkflower.link.oneframework.common.constant.ApisConstant;
import course.linkflower.link.oneframework.common.dto.PageDto;
import course.linkflower.link.oneframework.common.dto.base.IdDto;
import course.linkflower.link.oneframework.common.model.PageResult;
import course.linkflower.link.oneframework.common.model.Result;
import course.linkflower.link.oneframework.dto.carinforphoto.CarInforPhotoDto;
import course.linkflower.link.oneframework.dto.carinforphoto.CarInforPhotoNoIdDto;
import course.linkflower.link.oneframework.service.CarInforPhotoService;
import course.linkflower.link.oneframework.vo.carinforphoto.CarInforPhotoShowVo;
import course.linkflower.link.oneframework.vo.carinforphoto.CarInforPhotoVo;
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
@RequestMapping(ApisConstant.ApiV1+"/carinforphoto")
@RefreshScope
public class CarInforPhotoController {
    @Autowired
    private CarInforPhotoService carInforPhotoService;
    @PostMapping("/add")
    public Result<CarInforPhotoVo> add(@RequestBody CarInforPhotoNoIdDto carInforPhotoNoIdDto){
        return carInforPhotoService.add(carInforPhotoNoIdDto);
    }

    @PostMapping("/deletebyid")
    public Result deleteById(@RequestBody IdDto idDto){
        return carInforPhotoService.deleteById(idDto);
    }

    @PostMapping("/updatebyid")
    public Result<CarInforPhotoVo> updateById(@RequestBody CarInforPhotoDto carInforPhotoDto){
        return carInforPhotoService.updateById(carInforPhotoDto);
    }

    @PostMapping("/listphotobycarinforid")
    public Result<List<CarInforPhotoVo>> listPhotoByCarInforId(@RequestBody IdDto idDto){
        return carInforPhotoService.listPhotoByCarInforId(idDto);
    }

    @PostMapping("/search")
    public PageResult<CarInforPhotoShowVo> search(PageDto pageDto){
        return carInforPhotoService.search(pageDto);
    }
}
