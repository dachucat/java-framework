package course.linkflower.link.oneframework.model;

import com.alibaba.druid.pool.ha.selector.StickyDataSourceHolder;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.*;

@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode(callSuper = false)
@TableName("car_brand")
public class CarBrand {
    private Long id;
    private String icon;
    private String name;
    private Long carCompanyId;
}
