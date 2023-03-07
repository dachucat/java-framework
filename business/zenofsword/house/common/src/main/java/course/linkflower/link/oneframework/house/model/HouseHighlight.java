package course.linkflower.link.oneframework.house.model;

import com.baomidou.mybatisplus.annotation.TableName;
import lombok.*;

@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode(callSuper = false)
@TableName("house_highlight")
public class HouseHighlight {
    private long id;
    private long rentHouseInfoId;
    private long HighlightId;
}
