package course.linkflower.link.oneframework.service;

import course.linkflower.link.oneframework.common.dto.PageDto;
import course.linkflower.link.oneframework.common.dto.base.IdDto;
import course.linkflower.link.oneframework.common.model.PageResult;
import course.linkflower.link.oneframework.common.model.Result;
import course.linkflower.link.oneframework.dto.usedcarphoto.UsedCarPhotoDto;
import course.linkflower.link.oneframework.dto.usedcarphoto.UsedCarPhotoNoIdDto;
import course.linkflower.link.oneframework.vo.usedcarphoto.UsedCarPhotoShowVo;
import course.linkflower.link.oneframework.vo.usedcarphoto.UsedCarPhotoVo;

import java.util.List;

public interface UsedCarPhotoService {

    Result<UsedCarPhotoVo> add(UsedCarPhotoNoIdDto usedCarPhotoNoIdDto);

    Result deleteById(IdDto idDto);

    Result<UsedCarPhotoVo> updateById(UsedCarPhotoDto usedCarPhotoDto);

    Result<List<UsedCarPhotoVo>> listPhotoByUsedCarId(IdDto idDto);

    PageResult<UsedCarPhotoShowVo> search(PageDto pageDto);
}
