package course.linkflower.link.oneframework.model;

import com.baomidou.mybatisplus.annotation.TableName;
import lombok.*;

@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode(callSuper = false)
@TableName("car_company")
public class CarCompany {
    private Long id;
    private String name;
    private String address;
    private String email;
    private String phone;
    private String icon;
}
