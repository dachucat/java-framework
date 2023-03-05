package course.linkflower.link.oneframework.house.dto.login;

import lombok.Data;

@Data
public class ChangePasswordDto {
    private String id;
    private String oldPassword;
    private String password;
}
