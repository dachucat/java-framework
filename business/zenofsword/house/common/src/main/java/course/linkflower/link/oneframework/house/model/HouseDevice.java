package course.linkflower.link.oneframework.house.model;

import com.baomidou.mybatisplus.annotation.TableName;
import lombok.*;

@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode(callSuper = false)
@TableName("house_device")
public class HouseDevice {
    private long id;
    private long rentHouseInfoId;
    private long houseDeviceTypeId;
}
