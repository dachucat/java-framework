package course.linkflower.link.web.vo;

import course.linkflower.link.oneframework.house.model.Commission;
import course.linkflower.link.oneframework.house.model.RentHouseInfo;
import course.linkflower.link.oneframework.house.vo.areainfo.AreaInfoVo;
import course.linkflower.link.oneframework.house.vo.commission.CommissionVo;
import course.linkflower.link.oneframework.house.vo.housedictionary.HouseDictionaryVo;
import course.linkflower.link.oneframework.house.vo.renthouseinfo.RentHouseInfoVo;
import lombok.Data;

import java.util.List;

@Data
public class RentHouseWholeInfoVo {
    private String id;
    private String clientId;
    private String agentId;
    private List<HouseDictionaryVo> houseDictionaryVo;
    private List<AreaInfoVo> houseAreaInfoVo;
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

    public RentHouseWholeInfoVo loadFrom(RentHouseInfo rentHouseInfo){
        if (rentHouseInfo!=null){

        }
        return this;
    }

    public RentHouseWholeInfoVo listAllData(){

        return this;
    }
}
