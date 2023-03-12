package course.linkflower.link.oneframework.dto.carinforattrib;

import course.linkflower.link.oneframework.model.CarInforAttrib;
import lombok.Data;
import org.apache.commons.lang3.StringUtils;

@Data
public class CarInforAttribDto {
    private String carInforId;
    private String attribKey;
    private String value;
    private String remark;
    private String icon;
    private String valueTypeKey;
    private String introduction;
    private String id;
    public CarInforAttrib toModel() {
        CarInforAttrib carInforAttrib=new CarInforAttrib();
        if (StringUtils.isNotEmpty(carInforId)){
            carInforAttrib.setCarInforId(Long.valueOf(carInforId));
        }
        carInforAttrib.setAttribKey(attribKey);
        if (StringUtils.isNotEmpty(value)) {
            carInforAttrib.setValue(Long.valueOf(value));
        }
        carInforAttrib.setRemark(remark);
        carInforAttrib.setIcon(icon);
        carInforAttrib.setValueTypeKey(valueTypeKey);
        carInforAttrib.setIntroduction(introduction);
        if (StringUtils.isNotEmpty(id)){
            carInforAttrib.setId(Long.valueOf(id));
        }
        return carInforAttrib;
    }
}
