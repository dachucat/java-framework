package course.linkflower.link.oneframework.house.service;

import course.linkflower.link.oneframework.common.model.Result;
import course.linkflower.link.oneframework.house.dto.househighlightinfo.AddHouseHightlightInfoDto;
import course.linkflower.link.oneframework.house.dto.househighlightinfo.DeleteHouseHightlightInfoDto;
import course.linkflower.link.oneframework.house.dto.househighlightinfo.SearchHouseHightlightInfoDto;
import course.linkflower.link.oneframework.house.dto.househighlightinfo.UpdateHouseHightlightInfoDto;
import course.linkflower.link.oneframework.house.vo.househightlightinfo.HouseHightlightInfoVo;

public interface HouseHightlightInfoService {
    Result<HouseHightlightInfoVo> addHouseHightlightInfo(AddHouseHightlightInfoDto addHouseHightlightInfoDto);
    Result deleteHouseHightlightInfo(DeleteHouseHightlightInfoDto deleteHouseHightlightInfoDto);
    Result<HouseHightlightInfoVo> updateHouseHightlightInfo(UpdateHouseHightlightInfoDto updateHouseHightlightInfoDto);
    Result<HouseHightlightInfoVo> getHouseHightlightInfoById(SearchHouseHightlightInfoDto searchHouseHightlightInfoDto);
}
