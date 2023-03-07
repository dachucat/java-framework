package course.linkflower.link.oneframework.vo.carcompany;

import course.linkflower.link.oneframework.model.CarCompany;
import lombok.Data;

@Data

public class CarCompanyVo {
    private String id;
    private String name;
    private String address;
    private String email;
    private String phone;
    private String icon;

    public CarCompanyVo loadFrom(CarCompany carCompany) {
        id=String.valueOf(carCompany.getId());
        name=carCompany.getName();
        address=carCompany.getAddress();
        email=carCompany.getEmail();
        phone=carCompany.getPhone();
        icon=carCompany.getIcon();
        return this;
    }
}
