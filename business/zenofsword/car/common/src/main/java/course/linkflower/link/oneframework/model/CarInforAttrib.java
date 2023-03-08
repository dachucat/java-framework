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
    private String typeCarDictKey;
    private Long value;
    private Long id;
    private String remark;
    private String icon;
    private Byte valueTypeCarDictKey;
    private String introduction;
}
