package course.linkflower.link.oneframework.vo.carinforphoto;

import course.linkflower.link.oneframework.model.CarInforPhoto;
import lombok.Data;

import java.util.Objects;

@Data
public class CarInforPhotoVo {
    private String id;
    private String carInforId;
    private String photo;
    private Byte ordering;

    public CarInforPhotoVo loadFrom(CarInforPhoto carInforPhoto) {
        Long aLong = carInforPhoto.getId();
        if (Objects.nonNull(aLong)) {
            id = String.valueOf(aLong);
        }
        Long aLong1 = carInforPhoto.getCarInforId();
        if (Objects.nonNull(aLong1)) {
            carInforId = String.valueOf(aLong1);
        }
        photo=carInforPhoto.getPhoto();
        ordering=carInforPhoto.getOrdering();
        return this;
    }
}
