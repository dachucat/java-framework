package course.linkflower.link.oneframework.model;

import cn.hutool.core.text.StrJoiner;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.*;

@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode(callSuper = false)
@TableName("car_pattern")
public class CarPattern {
    private Long id;
    private String carPattern;
    private Long carBrandId;
    private String timePattern;
    private String PatternKey;
}
