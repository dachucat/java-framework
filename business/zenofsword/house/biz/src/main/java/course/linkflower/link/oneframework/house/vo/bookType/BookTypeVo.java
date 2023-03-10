package course.linkflower.link.oneframework.house.vo.bookType;

import lombok.Data;

@Data
public class BookTypeVo {
    private String id;
    private String name;

    public BookTypeVo loadFrom(BookType bookType){
        if (bookType != null){
            name = bookType.getName();
        }
        return this;
    }
}
