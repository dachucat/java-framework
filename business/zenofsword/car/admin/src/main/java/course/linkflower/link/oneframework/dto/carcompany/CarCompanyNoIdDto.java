package course.linkflower.link.oneframework.dto.carcompany;

import course.linkflower.link.oneframework.model.CarCompany;
import lombok.Data;
import org.apache.commons.lang3.StringUtils;
@Data
public class CarCompanyNoIdDto {
    private String name;
    private String address;
    private String email;
    private String phone;
    private String icon;

    public CarCompany toModel() {
        CarCompany carCompany=new CarCompany();
        carCompany.setAddress(address);
        carCompany.setEmail(email);
        carCompany.setIcon(icon);
        carCompany.setName(name);
        carCompany.setPhone(phone);
        return carCompany;
    }
}
