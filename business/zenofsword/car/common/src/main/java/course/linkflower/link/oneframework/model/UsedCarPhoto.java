package course.linkflower.link.oneframework.model;

import com.baomidou.mybatisplus.annotation.TableName;
import lombok.*;

@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode(callSuper = false)
@TableName("used_car_photo")
public class UsedCarPhoto {
    private Long id;
    private Long usedCarId;
    private String photo;
    private Byte ordering;
}
