package course.linkflower.link.oneframeworkweb.house.service;

import course.linkflower.link.oneframework.common.model.Result;
import course.linkflower.link.oneframeworkweb.house.dto.AddID;
import course.linkflower.link.oneframeworkweb.house.vo.RentHouseWholeInfoVo;

public interface RentHouseWholeInfoService {
    Result<RentHouseWholeInfoVo> loadInfo(AddID addID);

}
