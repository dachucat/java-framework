package course.linkflower.link.oneframework.model;

import com.baomidou.mybatisplus.annotation.TableName;
import lombok.*;

@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode(callSuper = false)
@TableName("used_car_attrib")
public class UsedCarAttrib {
    private Long usedCarId;
    private String typeKey;
    private Long value;
    private Long id;
    private String remark;
    private String icon;
    private Byte valueType;
    private String introduction;
}
