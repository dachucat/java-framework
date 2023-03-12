package course.linkflower.link.oneframework.vo.carinfor;

import lombok.Data;
import org.springframework.stereotype.Service;

@Data
public class CarInforShowVo {
    private String id;
    private String quotedPrice;
    private String guidePrice;
    private String carPatternId;
}
