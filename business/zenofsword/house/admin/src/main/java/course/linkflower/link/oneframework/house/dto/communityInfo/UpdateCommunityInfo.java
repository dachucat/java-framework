package course.linkflower.link.oneframework.house.dto.communityInfo;

import course.linkflower.link.oneframework.house.model.CommunityInfo;
import lombok.Data;

@Data
public class UpdateCommunityInfo {
    private String id;
    private int buildYears;
    private String name;
    private String propertyCompany;
    private String businessArea;

    public CommunityInfo toModel(){
        CommunityInfo communityInfo = new CommunityInfo();
        communityInfo.setId(Long.parseLong(id));
        communityInfo.setBuildYears(buildYears);
        communityInfo.setName(name);
        communityInfo.setPropertyCompany(propertyCompany);
        communityInfo.setBusinessArea(businessArea);
        return  communityInfo;
    }
}
