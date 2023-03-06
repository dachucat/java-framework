package course.linkflower.link.oneframework.house.vo.publisher;


import lombok.Data;

@Data
public class PublisherInfoVo {
    private String id;
    private String name;

    public PublisherInfoVo loadFrom(Publisher p) {
        if (p != null) {
            id = String.valueOf(p.getId());
            name = p.getName();
        }
        return this;
    }
}
