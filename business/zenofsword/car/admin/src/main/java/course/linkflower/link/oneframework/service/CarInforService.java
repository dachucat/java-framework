package course.linkflower.link.oneframework.service;

import course.linkflower.link.oneframework.common.dto.base.IdDto;
import course.linkflower.link.oneframework.common.model.Result;
import course.linkflower.link.oneframework.dto.CarInfor.CarInforDto;
import course.linkflower.link.oneframework.dto.CarInfor.CarInforNoIdDto;
import course.linkflower.link.oneframework.vo.carinfor.CarInforVo;

public interface CarInforService {
    Result<CarInforVo> add(CarInforNoIdDto carInforNoIdDto);

    Result deleteById(IdDto idDto);

    Result<CarInforVo> updateById(CarInforDto carInforDto);

    Result<CarInforVo> getCarInforById(IdDto idDto);
}
