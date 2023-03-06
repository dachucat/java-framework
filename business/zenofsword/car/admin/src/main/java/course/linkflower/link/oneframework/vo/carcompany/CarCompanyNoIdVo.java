package course.linkflower.link.oneframework.vo.carcompany;

import course.linkflower.link.oneframework.model.CarCompany;
import lombok.Data;

@Data

public class CarCompanyNoIdVo {
    private String name;
    private String address;
    private String email;
    private String phone;
    private String icon;

    public CarCompanyNoIdVo loadFrom(CarCompany carCompany) {
        name=carCompany.getName();
        address=carCompany.getAddress();
        email=carCompany.getEmail();
        phone=carCompany.getPhone();
        icon=carCompany.getIcon();
        return this;
    }
}
