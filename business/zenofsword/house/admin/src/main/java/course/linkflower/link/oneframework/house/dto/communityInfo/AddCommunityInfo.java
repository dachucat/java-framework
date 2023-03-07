package course.linkflower.link.oneframework.house.dto.communityInfo;

import course.linkflower.link.oneframework.house.model.CommunityInfo;
import lombok.Data;

@Data
public class AddCommunityInfo {
    private int buildYears;
    private String name;
    private String propertyCompany;
    private String businessArea;

    public CommunityInfo toModel(){
        CommunityInfo communityInfo = new CommunityInfo();
        communityInfo.setBuildYears(buildYears);
        communityInfo.setName(name);
        communityInfo.setPropertyCompany(propertyCompany);
        communityInfo.setBusinessArea(businessArea);
        return  communityInfo;
    }
}
