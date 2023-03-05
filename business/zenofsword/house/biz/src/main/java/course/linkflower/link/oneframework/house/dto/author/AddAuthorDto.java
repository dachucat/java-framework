package course.linkflower.link.oneframework.house.dto.author;

import lombok.*;

@Data
public class AddAuthorDto {
    private String id;
    private String name;
    private String phone;
    private String country;
    private String address;
    private String mail;
    private String remark;
}
