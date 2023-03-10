package course.linkflower.link.oneframework.house.dto.author;

import lombok.Data;

@Data
public class UpdateAuthorDto {
    private String id;
    private String phone;
    private String country;
    private String address;
    private String mail;
    private String remark;

    public Author toModel(UpdateAuthorDto updateAuthorDto){
        Author author=new Author();
        author.setId(Long.parseLong(id));
        author.setPhone(phone);
        author.setCountry(country);
        author.setAddress(address);
        author.setMail(mail);
        author.setRemark(remark);
        return author;
    }
}
