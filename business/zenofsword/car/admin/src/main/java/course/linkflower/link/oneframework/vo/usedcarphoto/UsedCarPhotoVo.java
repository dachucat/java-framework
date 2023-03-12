package course.linkflower.link.oneframework.vo.usedcarphoto;

import course.linkflower.link.oneframework.model.UsedCarPhoto;
import lombok.Data;

import java.util.Objects;

@Data
public class UsedCarPhotoVo {
    private String id;
    private String usedCarId;
    private String photo;
    private byte ordering;

    public UsedCarPhotoVo loadFrom(UsedCarPhoto usedCarPhoto) {
        Long aLong = usedCarPhoto.getId();
        if (Objects.nonNull(aLong)) {
            id = String.valueOf(aLong);
        }
        Long aLong1 = usedCarPhoto.getUsedCarId();
        if (Objects.nonNull(aLong1)) {
            usedCarId = String.valueOf(aLong1);
        }
        photo=usedCarPhoto.getPhoto();
        ordering=usedCarPhoto.getOrdering();
        return this;
    }
}
