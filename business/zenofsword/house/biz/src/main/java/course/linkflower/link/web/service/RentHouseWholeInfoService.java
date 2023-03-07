package course.linkflower.link.web.service;

import course.linkflower.link.oneframework.common.model.Result;
import course.linkflower.link.web.vo.RentHouseWholeInfoVo;

public interface RentHouseWholeInfoService {
    Result<RentHouseWholeInfoVo> loadInfo(Long id);

}
