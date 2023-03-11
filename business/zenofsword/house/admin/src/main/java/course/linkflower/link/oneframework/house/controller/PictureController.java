package course.linkflower.link.oneframework.house.controller;

import course.linkflower.link.oneframework.common.model.Result;
import course.linkflower.link.oneframework.house.dto.picture.AddPictureDto;
import course.linkflower.link.oneframework.house.dto.picture.DeletePictureDto;
import course.linkflower.link.oneframework.house.dto.picture.SearchPictureDto;
import course.linkflower.link.oneframework.house.dto.picture.UpdatePictureDto;
import course.linkflower.link.oneframework.house.service.PictureService;
import course.linkflower.link.oneframework.house.vo.picture.PictureVo;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@Slf4j
@RequestMapping("/picture")
@RefreshScope
public class    PictureController {
    @Autowired
    PictureService pictureService;
    @PostMapping("/add")
    public Result<PictureVo> add(@RequestBody AddPictureDto addPictureDto) {
        return pictureService.addPicture(addPictureDto);
    }

    @PostMapping("/delete")
    public Result delete(@RequestBody DeletePictureDto deletePictureDto) {
        return pictureService.deletePicture(deletePictureDto);
    }

    @PostMapping("/update")
    public Result<PictureVo> update(@RequestBody UpdatePictureDto updatePictureDto) {
        return pictureService.updatePicture(updatePictureDto);
    }

    @PostMapping("/search")
    public Result<PictureVo> search(@RequestBody SearchPictureDto searchPictureDto) {
        return pictureService.getPictureById(searchPictureDto);
    }
}
