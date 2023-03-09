package course.linkflower.link.oneframework.dto.carinforphoto;

import course.linkflower.link.oneframework.model.CarInforPhoto;
import lombok.Data;
import org.apache.commons.lang3.StringUtils;

@Data
public class CarInforPhotoDto {
    private String id;
    private String carInforId;
    private String photo;
    private byte ordering;

    public CarInforPhoto toModel() {
        CarInforPhoto carInforPhoto=new CarInforPhoto();
        if (StringUtils.isNotEmpty(id)){
            carInforPhoto.setId(Long.valueOf(id));
        }
        if (StringUtils.isNotEmpty(carInforId)){
            carInforPhoto.setId(Long.valueOf(carInforId));
        }
        carInforPhoto.setPhoto(photo);
        carInforPhoto.setOrdering(ordering);
        return carInforPhoto;
    }
}
