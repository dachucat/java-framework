package course.linkflower.link.oneframework.vo.carbrand;

import course.linkflower.link.oneframework.model.CarBrand;
import lombok.Data;

@Data
public class CarBrandVo {
    private String id;
    private String icon;
    private String name;
    private String carCompanyId;

    public CarBrandVo loadFrom(CarBrand carBrand) {
        id=String.valueOf(carBrand.getId());
        icon=carBrand.getIcon();
        name=carBrand.getName();
        carCompanyId=String.valueOf(carBrand.getCarCompanyId());
        return this;
    }
}
