package course.linkflower.link.oneframework.car.dto.carbrand;

import course.linkflower.link.oneframework.car.model.CarBrand;
import lombok.Data;

@Data
public class CarBrandNoIdDto {
    private String icon;
    private String name;
    private String carCompanyId;

    public CarBrand toModel(CarBrandNoIdDto carBrandNoIdDto) {
        CarBrand carBrand=new CarBrand();
        carBrand.setIcon(icon);
        carBrand.setName(name);
        carBrand.setCarCompanyId(Long.parseLong(carCompanyId));
        return carBrand;
    }
}
