package course.linkflower.link.oneframework.house.vo.bookInfo;

import lombok.Data;

@Data
public class BookInforShortVo {
    private String id;
    private String name;

    public BookInforShortVo loadFrom(BookInfo bi) {
        if (bi != null) {
            id = String.valueOf(bi.getId());
            name = bi.getName();
        }
        return this;
    }
}
