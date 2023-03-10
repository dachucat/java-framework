package course.linkflower.link.oneframework.house.dto.book;

import cn.hutool.core.date.DateTime;
import lombok.Data;

@Data
public class AddBookDto {
    private String id;
    private String bookInforId;
    private DateTime inLibraryDate;

    public Book toModel() {
        Book b = new Book();
        b.setBookInforId(Long.parseLong(bookInforId));
        b.setInLibraryDate(inLibraryDate);
        return b;
    }
}
