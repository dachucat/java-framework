package course.linkflower.link.oneframework.service;

import course.linkflower.link.oneframework.common.dto.base.IdDto;
import course.linkflower.link.oneframework.common.model.Result;
import course.linkflower.link.oneframework.dto.usedcarphoto.UsedCarPhotoDto;
import course.linkflower.link.oneframework.dto.usedcarphoto.UsedCarPhotoNoIdDto;
import course.linkflower.link.oneframework.vo.usedcarphoto.UsedCarPhotoVo;

import java.util.List;

public interface UsedCarPhotoService {

    Result<UsedCarPhotoVo> add(UsedCarPhotoNoIdDto usedCarPhotoNoIdDto);

    Result deleteById(IdDto idDto);

    Result<UsedCarPhotoVo> updateById(UsedCarPhotoDto usedCarPhotoDto);

    Result<List<UsedCarPhotoVo>> listPhotoById(IdDto idDto);
}
