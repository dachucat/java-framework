package course.linkflower.link.oneframework.vo.carinforphoto;

import course.linkflower.link.oneframework.model.CarInforPhoto;
import lombok.Data;

import java.util.Objects;
@Data
public class CarInforPhotoShowVo {
    private String id;
    private String carInforId;
    private String photo;
    private Byte ordering;
}
