package course.linkflower.link.oneframework.vo.carinforattrib;

import course.linkflower.link.oneframework.model.CarInforAttrib;
import lombok.Data;
import org.apache.commons.lang3.StringUtils;

import java.util.Objects;

@Data
public class CarInforAttribVo {
    private String carInforId;
    private String typeCarDictKey;
    private Long value;
    private String remark;
    private String icon;
    private Byte valueTypeCarDictKey;
    private String introduction;
    private String id;

    public CarInforAttribVo loadFrom(CarInforAttrib carInforAttrib) {
        Long aLong=carInforAttrib.getId();
        if (Objects.nonNull(aLong)) {
            carInforId = String.valueOf(carInforAttrib.getCarInforId());
        }
        typeCarDictKey=carInforAttrib.getTypeCarDictKey();
        value=carInforAttrib.getValue();
        remark=carInforAttrib.getRemark();
        icon=carInforAttrib.getIcon();
        valueTypeCarDictKey=carInforAttrib.getValueTypeCarDictKey();
        Long aLong1=carInforAttrib.getId();
        if (Objects.nonNull(aLong1)){
            id=String.valueOf(carInforAttrib.getId());
        }
        return this;
    }
}
