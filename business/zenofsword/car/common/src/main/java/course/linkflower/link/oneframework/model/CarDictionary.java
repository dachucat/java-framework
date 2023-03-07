package course.linkflower.link.oneframework.model;

import com.baomidou.mybatisplus.annotation.TableName;
import lombok.*;

@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode(callSuper = false)
@TableName("car_dictionary")
public class CarDictionary {
    private Long id;
    private String value;
    private String key;
    private String type;
    private Long ordering;
}
