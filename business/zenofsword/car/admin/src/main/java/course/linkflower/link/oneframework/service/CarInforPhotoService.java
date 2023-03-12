package course.linkflower.link.oneframework.service;

import course.linkflower.link.oneframework.common.dto.PageDto;
import course.linkflower.link.oneframework.common.dto.base.IdDto;
import course.linkflower.link.oneframework.common.model.PageResult;
import course.linkflower.link.oneframework.common.model.Result;
import course.linkflower.link.oneframework.dto.carinforphoto.CarInforPhotoDto;
import course.linkflower.link.oneframework.dto.carinforphoto.CarInforPhotoNoIdDto;
import course.linkflower.link.oneframework.vo.carinforphoto.CarInforPhotoShowVo;
import course.linkflower.link.oneframework.vo.carinforphoto.CarInforPhotoVo;

import java.util.List;

public interface CarInforPhotoService {

    Result<CarInforPhotoVo> add(CarInforPhotoNoIdDto carInforPhotoNoIdDto);

    Result deleteById(IdDto idDto);

    Result<CarInforPhotoVo> updateById(CarInforPhotoDto carInforPhotoDto);

    Result<List<CarInforPhotoVo>> listPhotoByCarInforId(IdDto idDto);

    PageResult<CarInforPhotoShowVo> search(PageDto pageDto);
}
