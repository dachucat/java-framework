package course.linkflower.link.oneframework.dto.carinforattrib;

import course.linkflower.link.oneframework.model.CarInforAttrib;
import lombok.Data;
import org.apache.commons.lang3.StringUtils;
import org.apache.poi.util.StringUtil;

@Data
public class CarInforAttribNoIdDto {
    private String carInforId;
    private String typeCarDictKey;
    private Long value;
    private String remark;
    private String icon;
    private Byte valueTypeCarDictKey;
    private String introduction;

    public CarInforAttrib toModel(CarInforAttribNoIdDto carInforAttribNoIdDto) {
        CarInforAttrib carInforAttrib=new CarInforAttrib();
        if (StringUtils.isNotEmpty(carInforAttribNoIdDto.getCarInforId())){
            carInforAttrib.setCarInforId(Long.valueOf(carInforId));
        }
        carInforAttrib.setTypeCarDictKey(typeCarDictKey);
        carInforAttrib.setValue(value);
        carInforAttrib.setRemark(remark);
        carInforAttrib.setIcon(icon);
        carInforAttrib.setValueTypeCarDictKey(valueTypeCarDictKey);
        carInforAttrib.setIntroduction(introduction);
        return carInforAttrib;
    }
}
