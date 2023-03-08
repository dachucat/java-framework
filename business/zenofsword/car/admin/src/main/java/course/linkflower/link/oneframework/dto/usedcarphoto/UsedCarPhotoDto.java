package course.linkflower.link.oneframework.dto.usedcarphoto;

import course.linkflower.link.oneframework.model.CarInforAttrib;
import course.linkflower.link.oneframework.model.UsedCarPhoto;
import lombok.Data;
import org.apache.commons.lang3.StringUtils;

@Data
public class UsedCarPhotoDto {
    private String id;
    private String usedCarId;
    private String photo;
    private byte ordering;

    public UsedCarPhoto toModel(UsedCarPhotoDto usedCarPhotoDto) {
        UsedCarPhoto usedCarPhoto=new UsedCarPhoto();
        if (StringUtils.isNotEmpty(id)){
            usedCarPhoto.setId(Long.valueOf(id));
        }
        if (StringUtils.isNotEmpty(usedCarId)){
            usedCarPhoto.setId(Long.valueOf(usedCarId));
        }
        usedCarPhoto.setPhoto(photo);
        usedCarPhoto.setOrdering(ordering);
        return usedCarPhoto;
    }
}
