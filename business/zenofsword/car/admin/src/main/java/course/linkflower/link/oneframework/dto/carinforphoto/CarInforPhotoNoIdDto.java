package course.linkflower.link.oneframework.dto.carinforphoto;

import course.linkflower.link.oneframework.model.CarInforPhoto;
import lombok.Data;
import org.apache.commons.lang3.StringUtils;

@Data
public class CarInforPhotoNoIdDto {
    private String carInforId;
    private String photo;
    private Byte ordering;

    public CarInforPhoto toModel(CarInforPhotoNoIdDto carInforPhotoDto) {
        CarInforPhoto carInforPhoto=new CarInforPhoto();
        if (StringUtils.isNotEmpty(carInforId)){
            carInforPhoto.setCarInforId(Long.valueOf(carInforId));
        }
        carInforPhoto.setPhoto(photo);
        carInforPhoto.setOrdering(ordering);
        return carInforPhoto;
    }
}
