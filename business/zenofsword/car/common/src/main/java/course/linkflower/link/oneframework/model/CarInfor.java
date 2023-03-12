package course.linkflower.link.oneframework.model;

import com.baomidou.mybatisplus.annotation.TableName;
import lombok.*;

@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode(callSuper = false)
@TableName("Car_infor")
public class CarInfor {
    private Long id;
    private Long quotedPrice;
    private Long guidePrice;
    private Long carPatternId;
}
