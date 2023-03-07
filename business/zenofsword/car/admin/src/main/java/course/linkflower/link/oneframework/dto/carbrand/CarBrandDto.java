package course.linkflower.link.oneframework.dto.carbrand;

import course.linkflower.link.oneframework.model.CarBrand;
import lombok.Data;

@Data
public class CarBrandDto {
    private String id;
    private String icon;
    private String name;
    private String carCompanyId;

    public CarBrand toModel(CarBrandDto carBrandDto) {
        CarBrand carBrand=new CarBrand();
        carBrand.setIcon(icon);
        carBrand.setId(Long.valueOf(id));
        carBrand.setName(name);
        carBrand.setCarCompanyId(Long.parseLong(carCompanyId));
        return carBrand;
    }
}
