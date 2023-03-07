package course.linkflower.link.oneframework.house.service;

import course.linkflower.link.oneframework.common.model.Result;
import course.linkflower.link.oneframework.house.dto.househightlight.AddHouseHighlightDto;
import course.linkflower.link.oneframework.house.dto.househightlight.DeleteHouseHighlightDto;
import course.linkflower.link.oneframework.house.dto.househightlight.SearchHouseHighlightDto;
import course.linkflower.link.oneframework.house.dto.househightlight.UpdateHouseHighlightDto;
import course.linkflower.link.oneframework.house.vo.househighlight.HouseHighlightVo;

public interface HouseHighlightService {
    Result<HouseHighlightVo> addHouseHighlight(AddHouseHighlightDto addHouseHighlightDto);
    Result deleteHouseHighlight(DeleteHouseHighlightDto deleteHouseHighlightDto);
    Result<HouseHighlightVo> updateHouseHighlight(UpdateHouseHighlightDto updateHouseHighlightDto);
    Result<HouseHighlightVo> getHouseHighlight(SearchHouseHighlightDto searchHouseHighlightDto);
}
