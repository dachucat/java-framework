package course.linkflower.link.oneframeworkweb.house.vo;

import course.linkflower.link.oneframework.house.model.Commission;
import course.linkflower.link.oneframework.house.model.HouseHightlightInfo;
import course.linkflower.link.oneframework.house.model.RentHouseInfo;
import course.linkflower.link.oneframework.house.vo.areainfo.AreaInfoVo;
import course.linkflower.link.oneframework.house.vo.commission.CommissionVo;
import course.linkflower.link.oneframework.house.vo.communityinfo.CommunityInfoVo;
import course.linkflower.link.oneframework.house.vo.housedevicetype.HouseDeviceTypeVo;
import course.linkflower.link.oneframework.house.vo.housedictionary.HouseDictionaryVo;
import course.linkflower.link.oneframework.house.vo.househighlight.HouseHighlightVo;
import course.linkflower.link.oneframework.house.vo.househightlightinfo.HouseHightlightInfoVo;
import course.linkflower.link.oneframework.house.vo.renthouserequestinfo.RentHouseRequestInfoVo;
import lombok.Data;

import java.util.List;

@Data
public class RentHouseWholeInfoVo {
    private String id;
    private String title;
    private int rent;
    private String clientId;
    private String agentId;
    private String picture;
    private String video;
    private String address;
    private CommissionVo commissionVo;
    private List<HouseDictionaryVo> houseDictionaryVos;
    private List<AreaInfoVo> houseAreaInfoVos;
    private List<HouseDeviceTypeVo> houseDeviceTypeVos;
    private List<HouseHightlightInfoVo> houseHightlightInfoVos;
    private List<RentHouseRequestInfoVo> rentHouseRequestInfoVos;
    private CommunityInfoVo communityInfoVo;
    private double propertyPrice;
    private double houseSize;
    private int bedroom;
    private int livingroom;
    private int washroom;
    private int status;
    private int level;
    private String houseDescription;


    public RentHouseWholeInfoVo loadFrom(RentHouseInfo r){
        if (r!=null){
            id = String.valueOf(r.getId());
            clientId = String.valueOf(r.getClientId());
            agentId = String.valueOf(r.getAgentId());
            propertyPrice = r.getPropertyPrice();
            houseSize = r.getHouseSize();
            bedroom = r.getBedroom();
            livingroom = r.getLivingroom();
            washroom = r.getWashroom();
            rent = r.getRent();
            status = r.getStatus();
            level = r.getLevel();
            houseDescription = r.getHouseDescription();
            picture = r.getPicture();
            video = r.getVideo();
            title = r.getTitle();
            address = r.getAddress();
        }
        return this;
    }

    public RentHouseWholeInfoVo listAllData(){

        return this;
    }
}
