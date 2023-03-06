package course.linkflower.link.oneframework.house.dto.renthouseinfo;

import course.linkflower.link.oneframework.house.model.RentHouseInfo;
import lombok.Data;
import org.apache.commons.lang3.StringUtils;

@Data
public class AddRentHouseInfoDto {
    private String clientId;
    private String agentId;
    private String communityInfoId;
    private String depositTypeId;
    private String commissionId;
    private String rentHouseTypeId;
    private String decorateTypeId;
    private String orientationId;
    private String storeyId;
    private double propertyPrice;
    private double houseSize;
    private int bedroom;
    private int livingroom;
    private int washroom;
    private int rent;
    private int status;
    private int level;
    private String houseDescription;
    private String picture;
    private String video;
    private String title;
    private String address;

    public RentHouseInfo toModel(){
        RentHouseInfo r = new RentHouseInfo();
        if (!StringUtils.isEmpty(clientId)) {
            r.setClientId(Long.parseLong(clientId));
        }
        if (!StringUtils.isEmpty(agentId)) {
            r.setAgentId(Long.parseLong(agentId));
        }
        if (!StringUtils.isEmpty(communityInfoId)) {
            r.setCommunityInfoId(Long.parseLong(communityInfoId));
        }
        if (!StringUtils.isEmpty(depositTypeId)) {
            r.setDepositTypeId(Long.parseLong(depositTypeId));
        }
        if (!StringUtils.isEmpty(commissionId)) {
            r.setCommissionId(Long.parseLong(commissionId));
        }
        if (!StringUtils.isEmpty(rentHouseTypeId)) {
            r.setRentHouseTypeId(Long.parseLong(rentHouseTypeId));
        }
        if (!StringUtils.isEmpty(decorateTypeId)) {
            r.setDecorateTypeId(Long.parseLong(decorateTypeId));
        }
        if (!StringUtils.isEmpty(orientationId)) {
            r.setOrientationId(Long.parseLong(orientationId));
        }
        if (!StringUtils.isEmpty(storeyId)) {
            r.setStoreyId(Long.parseLong(storeyId));
        }
        r.setPropertyPrice(propertyPrice);
        r.setHouseSize(houseSize);
        r.setBedroom(bedroom);
        r.setLivingroom(livingroom);
        r.setWashroom(washroom);
        r.setRent(rent);
        r.setStatus(status);
        r.setLevel(level);
        r.setHouseDescription(houseDescription);
        r.setPicture(picture);
        r.setVideo(video);
        r.setTitle(title);
        r.setAddress(address);
        return r;
    }
}
