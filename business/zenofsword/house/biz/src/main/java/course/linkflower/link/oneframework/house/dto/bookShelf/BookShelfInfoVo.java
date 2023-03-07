package course.linkflower.link.oneframework.house.dto.bookShelf;

import lombok.Data;

@Data
public class BookShelfInfoVo {
    private String id;
    private String name;

    public BookShelfInfoVo loadFrom(Bookshelf bs) {
        if (bs != null) {
            id = String.valueOf(bs.getId());
            name = bs.getName();
        }
        return this;
    }
}
