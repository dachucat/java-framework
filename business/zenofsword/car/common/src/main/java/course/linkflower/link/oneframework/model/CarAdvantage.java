package course.linkflower.link.oneframework.model;

import com.baomidou.mybatisplus.annotation.TableName;
import lombok.*;

@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode(callSuper = false)
@TableName("car_advantage")
public class CarAdvantage {
    private Long id;
    private String typeKey;
    private Long value;
    private String attribKey;
}
