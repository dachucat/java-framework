package course.linkflower.link.oneframework.model;

import com.baomidou.mybatisplus.annotation.TableName;
import lombok.*;

@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode(callSuper = false)
@TableName("car_infor_photo")
public class CarInforPhoto {
    private Long id;
    private Long carInforId;
    private String photo;
    private Byte ordering;
}
