package course.linkflower.link.oneframework.house.dao;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.Collection;
import java.util.Date;
import java.util.List;

@Mapper
public interface BookBorrowRecordMapper {
    int save(BookBorrowRecord bookBorrowRecord);
    int delete(@Param("id") long id);
    int update(BookBorrowRecord bookBorrowRecord);
    BookBorrowRecord getBookBorrowRecordById(@Param("id") long id);
    List<BookBorrowRecord> listByIds(@Param("ids") Collection<Long> ids);

    List<BookBorrowRecord> listByDate(@Param("starDate") Date startDate, @Param("endDate") Date endDate, @Param("pageStart")  int pageStart, @Param("pageCount")  int pageCount);
    int getByDateTotal(@Param("starDate")Date startDate, @Param("endDate") Date endDate);
}
