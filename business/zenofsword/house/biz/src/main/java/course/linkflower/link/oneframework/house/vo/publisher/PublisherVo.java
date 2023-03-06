package course.linkflower.link.oneframework.house.vo.publisher;

import lombok.Data;

@Data
public class PublisherVo {
    private String name;
    private String phone;
    private String country;
    private String address;
    private long id;

    public PublisherVo loadFrom(Publisher publisher){
        if(publisher != null){
            name= publisher.getName();
        }
        return this;
    }
}
