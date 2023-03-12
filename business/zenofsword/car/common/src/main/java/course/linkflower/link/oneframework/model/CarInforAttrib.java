package course.linkflower.link.oneframework.model;

import com.baomidou.mybatisplus.annotation.TableName;
import lombok.*;

@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode(callSuper = false)
@TableName("car_infor_attrib")
public class CarInforAttrib {
    private Long carInforId;
    private String attribKey;
    private Long value;
    private Long id;
    private String remark;
    private String icon;
    private String valueTypeKey;
    private String introduction;
}
