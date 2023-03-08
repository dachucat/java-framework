package course.linkflower.link.oneframework.vo.carpattern;

import course.linkflower.link.oneframework.model.CarPattern;
import lombok.Data;

import java.util.Objects;

@Data
public class CarPatternVo {
    private String id;
    private String carPattern;
    private String carBrandId;
    private String timePattern;
    private String pattern_key;

    public CarPatternVo loadFrom(CarPattern carPattern) {
        Long aLong=carPattern.getId();
        if (Objects.nonNull(aLong)){
            id=String.valueOf(aLong);
        }
        this.carPattern=carPattern.getCarPattern();
        Long aLong1=carPattern.getCarBrandId();
        if (Objects.nonNull(carBrandId)){
            carBrandId=String.valueOf(carPattern.getCarBrandId());
        }
        timePattern=carPattern.getTimePattern();
        pattern_key=carPattern.getPattern_key();
        return this;
    }
}
