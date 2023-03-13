package course.linkflower.link.oneframework.vo.usedcarphoto;

import lombok.Data;

@Data
public class UsedCarPhotoShowVo {
    private String id;
    private String usedCarId;
    private String photo;
    private byte ordering;
}
