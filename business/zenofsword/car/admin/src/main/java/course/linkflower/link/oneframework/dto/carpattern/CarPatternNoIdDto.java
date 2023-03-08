package course.linkflower.link.oneframework.dto.carpattern;

import course.linkflower.link.oneframework.model.CarPattern;
import lombok.Data;
import org.apache.commons.lang3.StringUtils;

@Data
public class CarPatternNoIdDto {
    private String carPattern;
    private String carBrandId;
    private String timePattern;
    private String pattern_key;

    public CarPattern toModel() {
        CarPattern carPattern=new CarPattern();
        carPattern.setCarPattern(this.carPattern);
        if(StringUtils.isNotEmpty(carBrandId)){
            carPattern.setCarBrandId(Long.valueOf(carBrandId));
        }
        carPattern.setTimePattern(timePattern);
        carPattern.setPattern_key(pattern_key);
        return carPattern;
    }
}
