package course.linkflower.link.oneframework.vo.carinfor;

import course.linkflower.link.oneframework.model.CarInfor;
import lombok.Data;
import org.apache.commons.lang3.StringUtils;

import java.util.Objects;

@Data
public class CarInforVo {
    private String id;
    private String quotedPrice;
    private String guidePrice;
    private String carPatternId;

    public CarInforVo loadFrom(CarInfor carInfor) {
        Long aLong= carInfor.getId();
        if (Objects.nonNull(aLong)){
            id=String.valueOf(aLong);
        }
        Long aLong1= carInfor.getQuotedPrice();
        if (Objects.nonNull(aLong1)){
            quotedPrice=String.valueOf(aLong1);
        }
        Long aLong2= carInfor.getGuidePrice();
        if (Objects.nonNull(aLong2)){
            guidePrice=String.valueOf(aLong2);
        }
        Long aLong3= carInfor.getCarPatternId();
        if (Objects.nonNull(aLong3)){
            carPatternId=String.valueOf(aLong3);
        }
        return this;
    }
}
