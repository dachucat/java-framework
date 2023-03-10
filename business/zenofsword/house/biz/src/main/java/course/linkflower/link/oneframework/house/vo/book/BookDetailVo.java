package course.linkflower.link.oneframework.house.vo.book;

import course.linkflower.link.oneframework.house.dto.book.BookShortInfoVo;
import course.linkflower.link.oneframework.house.dto.bookShelf.BookShelfInfoVo;
import course.linkflower.link.oneframework.house.vo.bookInfo.BookInforShortVo;
import course.linkflower.link.oneframework.house.vo.borrowRecord.BorrowRecordInfoVo;
import course.linkflower.link.oneframework.house.vo.borrowcard.BorrowCardInfoVo;
import course.linkflower.link.oneframework.house.vo.client.ClientInfoVo;
import course.linkflower.link.oneframework.house.vo.publisher.PublisherInfoVo;
import lombok.Data;

@Data
public class BookDetailVo {
    private String id;

    private BookInforShortVo bookInfo;
    //借书人
    private ClientInfoVo borrower;

    private BorrowRecordInfoVo borrowRecord;

    private BorrowCardInfoVo borrowCard;

    private BookShelfInfoVo bookShelf;

    private BookShortInfoVo book;

    private PublisherInfoVo publisher;

    public BookDetailVo loadFrom(BookBorrowRecord r) {
        if (r != null) {
            id = String.valueOf(r.getId());
        }
        return this;
    }
}
