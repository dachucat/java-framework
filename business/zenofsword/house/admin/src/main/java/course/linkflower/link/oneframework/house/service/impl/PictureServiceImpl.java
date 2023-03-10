package course.linkflower.link.oneframework.house.service.impl;

import course.linkflower.link.oneframework.common.model.Result;
import course.linkflower.link.oneframework.house.dao.PictureMapper;
import course.linkflower.link.oneframework.house.dto.picture.AddPictureDto;
import course.linkflower.link.oneframework.house.dto.picture.DeletePictureDto;
import course.linkflower.link.oneframework.house.dto.picture.SearchPictureDto;
import course.linkflower.link.oneframework.house.dto.picture.UpdatePictureDto;
import course.linkflower.link.oneframework.house.model.Picture;
import course.linkflower.link.oneframework.house.service.PictureService;
import course.linkflower.link.oneframework.house.vo.picture.PictureVo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PictureServiceImpl implements PictureService {
    @Autowired
    PictureMapper pictureMapper;

    @Override
    public Result<PictureVo> addPicture(AddPictureDto addPictureDto) {
        Picture picture = addPictureDto.toModel();
        pictureMapper.save(picture);
        return Result.succeed(new PictureVo().loadFrom(picture));
    }

    @Override
    public Result deletePicture(DeletePictureDto deletePictureDto) {
        pictureMapper.delete(Long.parseLong(deletePictureDto.getId()));
        return Result.succeed();
    }

    @Override
    public Result<PictureVo> updatePicture(UpdatePictureDto updatePictureDto) {
        Picture picture = updatePictureDto.toModel();
        pictureMapper.update(picture);
        return Result.succeed(new PictureVo().loadFrom(picture));
    }

    @Override
    public Result<PictureVo> getPictureById(SearchPictureDto searchPictureDto) {
        return Result.succeed(new PictureVo().loadFrom(pictureMapper.getPictureById(Long.parseLong(searchPictureDto.getId()))));
    }
}
