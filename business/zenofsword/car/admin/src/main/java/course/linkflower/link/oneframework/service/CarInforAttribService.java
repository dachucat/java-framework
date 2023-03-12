package course.linkflower.link.oneframework.service;

import course.linkflower.link.oneframework.common.dto.PageDto;
import course.linkflower.link.oneframework.common.dto.base.IdDto;
import course.linkflower.link.oneframework.common.model.PageResult;
import course.linkflower.link.oneframework.common.model.Result;
import course.linkflower.link.oneframework.dto.carinforattrib.CarInforAttribDto;
import course.linkflower.link.oneframework.dto.carinforattrib.CarInforAttribNoIdDto;
import course.linkflower.link.oneframework.vo.carinforattrib.CarInforAttribShowVo;
import course.linkflower.link.oneframework.vo.carinforattrib.CarInforAttribVo;
import io.micrometer.core.instrument.Meter;

import java.util.List;

public interface CarInforAttribService {

    Result<CarInforAttribVo> add(CarInforAttribNoIdDto carInforAttribNoIdDto);

    Result deleteById(IdDto idDto);

    Result<CarInforAttribVo> updateById(CarInforAttribDto carInforAttribDto);

    Result<CarInforAttribVo> getCarInforAttribById(IdDto idDto);

    Result<List<CarInforAttribVo>> listCarInforAttribByCarInforId(IdDto idDto);

    PageResult<CarInforAttribShowVo> search(PageDto pageDto);
}
