package course.linkflower.link.oneframework.dto.usedcarattrib;

import course.linkflower.link.oneframework.model.UsedCarAttrib;
import lombok.Data;
import org.apache.commons.lang3.StringUtils;

@Data
public class UsedCarAttribDto {
    private String usedCarId;
    private String attribKey;
    private String value;
    private String id;
    private String remark;
    private String icon;
    private String valueTypeKey;
    private String introduction;

    public UsedCarAttrib toModel() {
        UsedCarAttrib usedCarAttrib=new UsedCarAttrib();
        if (StringUtils.isNotEmpty(usedCarId)){
            usedCarAttrib.setUsedCarId(Long.valueOf(usedCarId));
        }
        usedCarAttrib.setAttribKey(attribKey);
        if (StringUtils.isNotEmpty(value)){
            usedCarAttrib.setValue(Long.valueOf(value));
        }
        usedCarAttrib.setRemark(remark);
        usedCarAttrib.setRemark(remark);
        usedCarAttrib.setIcon(icon);
        usedCarAttrib.setValueTypeKey(valueTypeKey);
        usedCarAttrib.setIntroduction(introduction);
        if (StringUtils.isNotEmpty(id)){
            usedCarAttrib.setId(Long.valueOf(id));
        }
        return usedCarAttrib;
    }
}
