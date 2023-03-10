package course.linkflower.link.oneframework.house.service;

import course.linkflower.link.oneframework.common.model.Result;
import course.linkflower.link.oneframework.house.dto.commission.AddCommissionDto;
import course.linkflower.link.oneframework.house.dto.commission.DeleteCommissionDto;
import course.linkflower.link.oneframework.house.dto.commission.SearchCommissionDto;
import course.linkflower.link.oneframework.house.dto.commission.UpdateCommissionDto;
import course.linkflower.link.oneframework.house.dto.communityInfo.AddCommunityInfo;
import course.linkflower.link.oneframework.house.dto.communityInfo.DeleteCommunityInfo;
import course.linkflower.link.oneframework.house.dto.communityInfo.SearchCommunityInfo;
import course.linkflower.link.oneframework.house.dto.communityInfo.UpdateCommunityInfo;
import course.linkflower.link.oneframework.house.vo.commission.CommissionVo;
import course.linkflower.link.oneframework.house.vo.communityinfo.CommunityInfoVo;

public interface CommunityService {
    Result<CommunityInfoVo> addCommunityInfo(AddCommunityInfo addCommunityInfo);
    Result deleteCommunityInfo(DeleteCommunityInfo deleteCommunityInfo);
    Result<CommunityInfoVo> updateCommunityInfo(UpdateCommunityInfo updateCommunityInfo);
    Result<CommunityInfoVo> getCommunityInfoById(SearchCommunityInfo searchCommunityInfo);
}
