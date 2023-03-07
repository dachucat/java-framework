package course.linkflower.link.oneframework.house.dto.areainfo;

import course.linkflower.link.oneframework.house.model.AreaInfo;
import lombok.Data;
import org.apache.commons.lang3.StringUtils;
import org.springframework.scheduling.support.SimpleTriggerContext;

@Data
public class AddAreaInfoDto {
    private String parentId;
    private int level;
    private String name;
    private String code;
    private String key;
    private String address;

    public AreaInfo toModel(){
        AreaInfo areaInfo = new AreaInfo();
        if (!StringUtils.isEmpty(parentId)){
            areaInfo.setParentId(Long.parseLong(parentId));
        }
        areaInfo.setLevel(level);
        areaInfo.setName(name);
        areaInfo.setCode(code);
        areaInfo.setKey(key);
        areaInfo.setAddress(address);
        return areaInfo;
    }
}
