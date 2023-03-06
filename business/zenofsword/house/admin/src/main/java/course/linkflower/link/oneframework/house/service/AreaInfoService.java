package course.linkflower.link.oneframework.house.service;

import course.linkflower.link.oneframework.common.model.Result;
import course.linkflower.link.oneframework.house.dto.areainfo.AddAreaInfoDto;
import course.linkflower.link.oneframework.house.dto.areainfo.DeleteAreaInfoDto;
import course.linkflower.link.oneframework.house.dto.areainfo.SearchAreaInfoDto;
import course.linkflower.link.oneframework.house.dto.areainfo.UpdateAreaInfoDto;
import course.linkflower.link.oneframework.house.dto.communityInfo.AddCommunityInfo;
import course.linkflower.link.oneframework.house.dto.communityInfo.DeleteCommunityInfo;
import course.linkflower.link.oneframework.house.dto.communityInfo.SearchCommunityInfo;
import course.linkflower.link.oneframework.house.dto.communityInfo.UpdateCommunityInfo;
import course.linkflower.link.oneframework.house.vo.areainfo.AreaInfoVo;
import course.linkflower.link.oneframework.house.vo.communityinfo.CommunityInfoVo;

public interface AreaInfoService {
    Result<AreaInfoVo> addAreaInfo(AddAreaInfoDto addAreaInfoDto);
    Result deleteAreaInfo(DeleteAreaInfoDto deleteAreaInfoDto);
    Result<AreaInfoVo> updateAreaInfo(UpdateAreaInfoDto updateAreaInfoDto);
    Result<AreaInfoVo> getAreaInfoById(SearchAreaInfoDto searchAreaInfoDto);
}
