package course.linkflower.link.oneframework.house.dto.househighlightinfo;

import course.linkflower.link.oneframework.house.model.HouseHightlightInfo;
import lombok.Data;

@Data
public class AddHouseHightlightInfoDto {

    private String name;
    private String key;

    public HouseHightlightInfo toModel(){
        HouseHightlightInfo houseHightlightInfo = new HouseHightlightInfo();
        houseHightlightInfo.setName(name);
        houseHightlightInfo.setKey(key);
        return  houseHightlightInfo;
    }
}
