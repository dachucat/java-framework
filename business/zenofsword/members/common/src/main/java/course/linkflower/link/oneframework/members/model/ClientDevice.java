package course.linkflower.link.oneframework.members.model;

import com.baomidou.mybatisplus.annotation.TableName;
import lombok.*;

@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode(callSuper = false)
@TableName("client_device")
public class ClientDevice {
    private String deviceName;
    private String osName;
    private String osVersion;
    private String clientType; //web, ios, android
    private String session; //会话
}
