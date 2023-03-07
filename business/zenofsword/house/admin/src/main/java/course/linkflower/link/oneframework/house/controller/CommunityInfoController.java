package course.linkflower.link.oneframework.house.controller;

import course.linkflower.link.oneframework.common.model.Result;
import course.linkflower.link.oneframework.house.dto.communityInfo.AddCommunityInfo;
import course.linkflower.link.oneframework.house.dto.communityInfo.DeleteCommunityInfo;
import course.linkflower.link.oneframework.house.dto.communityInfo.SearchCommunityInfo;
import course.linkflower.link.oneframework.house.dto.communityInfo.UpdateCommunityInfo;
import course.linkflower.link.oneframework.house.service.CommunityService;
import course.linkflower.link.oneframework.house.vo.communityinfo.CommunityInfoVo;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@Slf4j
@RequestMapping("/communityinfo")
@RefreshScope
public class CommunityInfoController {
    @Autowired
    CommunityService communityService;
    @PostMapping("/add")
    public Result<CommunityInfoVo> add(@RequestBody AddCommunityInfo addCommunityInfo) {
        return communityService.addCommunityInfo(addCommunityInfo);
    }

    @PostMapping("/delete")
    public Result delete(@RequestBody DeleteCommunityInfo deleteCommunityInfo) {
        return communityService.deleteCommunityInfo(deleteCommunityInfo);
    }

    @PostMapping("/update")
    public Result<CommunityInfoVo> update(@RequestBody UpdateCommunityInfo updateCommunityInfo) {
        return communityService.updateCommunityInfo(updateCommunityInfo);
    }

    @PostMapping("/search")
    public Result<CommunityInfoVo> search(@RequestBody SearchCommunityInfo searchCommunityInfo) {
        return communityService.getCommunityInfoById(searchCommunityInfo);
    }
}
