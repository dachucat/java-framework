package course.linkflower.link.oneframework.vo.carinforattrib;

import course.linkflower.link.oneframework.model.CarInforAttrib;
import lombok.Data;
import org.apache.commons.lang3.StringUtils;

import java.util.Objects;

@Data
public class CarInforAttribVo {
    private String carInforId;
    private String attribKey;
    private String value;
    private String remark;
    private String icon;
    private String valueTypeKey;
    private String introduction;
    private String id;

    public CarInforAttribVo loadFrom(CarInforAttrib carInforAttrib) {
        Long aLong=carInforAttrib.getId();
        if (Objects.nonNull(aLong)) {
            carInforId = String.valueOf(carInforAttrib.getCarInforId());
        }
        attribKey=carInforAttrib.getAttribKey();
        Long aLong1=carInforAttrib.getValue();
        if (Objects.nonNull(aLong1)) {
            value=String.valueOf(aLong1);
        }
        remark=carInforAttrib.getRemark();
        icon=carInforAttrib.getIcon();
        valueTypeKey=carInforAttrib.getValueTypeKey();
        Long aLong2=carInforAttrib.getId();
        if (Objects.nonNull(aLong2)){
            id=String.valueOf(carInforAttrib.getId());
        }
        return this;
    }
}
