package course.linkflower.link.oneframework.dto.caradvantage;

import course.linkflower.link.oneframework.model.CarAdvantage;
import lombok.Data;
import org.apache.commons.lang3.StringUtils;

@Data
public class CarAdvantageNoIdDto {
    private String typeKey;
    private String value;
    private String attribKey;

    public CarAdvantage toModel(CarAdvantageNoIdDto carAdvantageNoIdDto) {
        CarAdvantage carAdvantage=new CarAdvantage();
        carAdvantage.setTypeKey(typeKey);
        carAdvantage.setAttribKey(attribKey);
        if (StringUtils.isNotEmpty(value)){
            carAdvantage.setValue(Long.valueOf(value));
        }
        return carAdvantage;
    }
}
