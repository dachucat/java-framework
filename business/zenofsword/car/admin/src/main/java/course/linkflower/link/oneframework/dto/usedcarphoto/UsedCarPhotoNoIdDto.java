package course.linkflower.link.oneframework.dto.usedcarphoto;

import course.linkflower.link.oneframework.model.UsedCarPhoto;
import lombok.Data;
import org.apache.commons.lang3.StringUtils;

@Data
public class UsedCarPhotoNoIdDto {
    private String usedCarId;
    private String photo;
    private Byte ordering;

    public UsedCarPhoto toModel(UsedCarPhotoNoIdDto usedCarPhotoNoIdDto) {
        UsedCarPhoto usedCarPhoto=new UsedCarPhoto();
        if (StringUtils.isNotEmpty(usedCarId)){
            usedCarPhoto.setId(Long.valueOf(usedCarId));
        }
        usedCarPhoto.setPhoto(photo);
        usedCarPhoto.setOrdering(ordering);
        return usedCarPhoto;
    }
}
