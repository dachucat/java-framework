package course.linkflower.link.oneframework.dto.carinforattrib;

import course.linkflower.link.oneframework.model.CarInforAttrib;
import lombok.Data;
import org.apache.commons.lang3.StringUtils;

@Data
public class CarInforAttribDto {
    private String carInforId;
    private String typeCarDictKey;
    private Long value;
    private String remark;
    private String icon;
    private Byte valueTypeCarDictKey;
    private String introduction;
    private String id;
    public CarInforAttrib toModel(CarInforAttribDto carInforAttribDto) {
        CarInforAttrib carInforAttrib=new CarInforAttrib();
        if (StringUtils.isNotEmpty(carInforAttribDto.getCarInforId())){
            carInforAttrib.setCarInforId(Long.valueOf(carInforId));
        }
        carInforAttrib.setTypeCarDictKey(typeCarDictKey);
        carInforAttrib.setValue(value);
        carInforAttrib.setRemark(remark);
        carInforAttrib.setIcon(icon);
        carInforAttrib.setValueTypeCarDictKey(valueTypeCarDictKey);
        carInforAttrib.setIntroduction(introduction);
        if (StringUtils.isNotEmpty(carInforAttribDto.getId())){
            carInforAttrib.setId(Long.valueOf(id));
        }
        return carInforAttrib;
    }
}
