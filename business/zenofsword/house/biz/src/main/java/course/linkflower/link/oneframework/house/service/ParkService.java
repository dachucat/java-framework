package course.linkflower.link.oneframework.house.service;

import course.linkflower.link.oneframework.common.dto.CodeDto;
import course.linkflower.link.oneframework.house.vo.park.ParkTreeVo;

public interface ParkService {

    ParkTreeVo ListParkTreeByCodeVo(CodeDto codeDto);
}
