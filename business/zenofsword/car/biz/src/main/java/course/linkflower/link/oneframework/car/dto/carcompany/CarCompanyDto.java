package course.linkflower.link.oneframework.car.dto.carcompany;

import course.linkflower.link.oneframework.car.model.CarCompany;
import lombok.Data;

@Data
public class CarCompanyDto {
    private String id;
    private String name;
    private String address;
    private String email;
    private String phone;
    private String icon;

    public CarCompany toModel(CarCompanyDto carCompanyDto) {
        CarCompany carCompany=new CarCompany();
        carCompany.setName(name);
        carCompany.setPhone(phone);
        carCompany.setIcon(icon);
        carCompany.setEmail(email);
        carCompany.setAddress(address);
        return carCompany;
    }
}
