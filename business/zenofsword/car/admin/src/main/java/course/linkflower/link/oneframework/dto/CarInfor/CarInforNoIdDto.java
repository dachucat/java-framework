package course.linkflower.link.oneframework.dto.CarInfor;

import course.linkflower.link.oneframework.model.CarInfor;
import lombok.Data;
import org.apache.commons.lang3.StringUtils;

@Data
public class CarInforNoIdDto {
    private String quotedPrice;
    private String guidePrice;
    private String carPatternId;

    public CarInfor toModel() {
        CarInfor carInfor=new CarInfor();
        if (StringUtils.isNotEmpty(quotedPrice)){
            carInfor.setQuotedPrice(Long.valueOf(quotedPrice));
        }
        if (StringUtils.isNotEmpty(guidePrice)){
            carInfor.setGuidePrice(Long.valueOf(guidePrice));
        }
        if(StringUtils.isNotEmpty(guidePrice)){
            carInfor.setCarPatternId(Long.valueOf(carPatternId));
        }
        return carInfor;
    }
}
