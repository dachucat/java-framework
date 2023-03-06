package course.linkflower.link.oneframework.vo.carbrand;

import course.linkflower.link.oneframework.model.CarBrand;
import lombok.Data;

@Data
public class CarBrandNoIdVo {
    private String icon;
    private String name;
    private String carCompanyId;

    public CarBrandNoIdVo loadFrom(CarBrand carBrand) {
        icon=carBrand.getIcon();
        name=carBrand.getName();
        carCompanyId=String.valueOf(carBrand.getCarCompanyId());
        return this;
    }
}
