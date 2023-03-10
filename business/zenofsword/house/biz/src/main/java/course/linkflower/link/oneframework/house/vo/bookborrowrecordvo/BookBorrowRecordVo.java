package course.linkflower.link.oneframework.house.vo.bookborrowrecordvo;

import lombok.Data;

@Data
public class BookBorrowRecordVo {
    private long id;
    private long clientId;
    private long borrowCardId;
    private long borrowId;
    private long bookId;
    private long bookInforId;
    private int status;
    private String startDate;
    private String endDate;
    private String bakckDate;
    private String remark;

    public BookBorrowRecordVo loadFrom(BookBorrowRecord bookBorrowRecord){
        if (bookBorrowRecord!=null){
            clientId = bookBorrowRecord.getClientId();
            borrowId = bookBorrowRecord.getBorrowId();
            bookId = bookBorrowRecord.getBookId();
            bookInforId = bookBorrowRecord.getBookInforId();;
        }
        return this;
    }
}
