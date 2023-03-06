package course.linkflower.link.oneframework.house.service.impl;

import course.linkflower.link.oneframework.common.model.Result;
import course.linkflower.link.oneframework.house.dao.CommunityInfoMapper;
import course.linkflower.link.oneframework.house.dto.communityInfo.AddCommunityInfo;
import course.linkflower.link.oneframework.house.dto.communityInfo.DeleteCommunityInfo;
import course.linkflower.link.oneframework.house.dto.communityInfo.SearchCommunityInfo;
import course.linkflower.link.oneframework.house.dto.communityInfo.UpdateCommunityInfo;
import course.linkflower.link.oneframework.house.model.CommunityInfo;
import course.linkflower.link.oneframework.house.service.CommunityService;
import course.linkflower.link.oneframework.house.vo.communityinfo.CommunityInfoVo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CommunityServiceImpl implements CommunityService {
    @Autowired
    CommunityInfoMapper communityInfoMapper;

    @Override
    public Result<CommunityInfoVo> addCommunityInfo(AddCommunityInfo addCommunityInfo) {
        CommunityInfo communityInfo = addCommunityInfo.toModel();
        communityInfoMapper.save(communityInfo);
        return Result.succeed(new CommunityInfoVo().loadFrom(communityInfo));
    }

    @Override
    public Result deleteCommunityInfo(DeleteCommunityInfo deleteCommunityInfo) {
        communityInfoMapper.delete(Long.parseLong(deleteCommunityInfo.getId()));
        return Result.succeed();
    }

    @Override
    public Result<CommunityInfoVo> updateCommunityInfo(UpdateCommunityInfo updateCommunityInfo) {
        CommunityInfo communityInfo = updateCommunityInfo.toModel();
        communityInfoMapper.update(communityInfo);
        return Result.succeed(new CommunityInfoVo().loadFrom(communityInfo));
    }

    @Override
    public Result<CommunityInfoVo> getCommunityInfoById(SearchCommunityInfo searchCommunityInfo) {
        return Result.succeed(new CommunityInfoVo().loadFrom(communityInfoMapper.getCommunityInfoById(Long.parseLong(searchCommunityInfo.getId()))));
    }
}
