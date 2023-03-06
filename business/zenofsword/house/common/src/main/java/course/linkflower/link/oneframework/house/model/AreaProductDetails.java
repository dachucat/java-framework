package course.linkflower.link.oneframework.house.model;

import com.baomidou.mybatisplus.annotation.TableName;
import lombok.*;

@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode(callSuper = false)
@TableName("area_product_details")
public class AreaProductDetails {
    private long id;
    private long targetId;
    private long areaInfoId;
    private String targetType;
    private String areaType;
    private int areaLevel;
}
