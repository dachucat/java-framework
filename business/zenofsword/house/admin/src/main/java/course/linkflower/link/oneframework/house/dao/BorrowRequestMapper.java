package course.linkflower.link.oneframework.house.dao;

import course.linkflower.link.oneframework.db.mapper.SuperMapper;
import course.linkflower.link.oneframework.house.dto.book.AddBookDto;
import course.linkflower.link.oneframework.house.dto.book.UpdateBookDto;
import course.linkflower.link.oneframework.house.dto.borrowRequest.AddBorrowRequestDto;
import course.linkflower.link.oneframework.house.dto.borrowRequest.UpdateBorrowRequestDto;
import course.linkflower.link.oneframework.house.model.BorrowRequest;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
@Mapper
public interface BorrowRequestMapper extends SuperMapper<BorrowRequest> {
    int save(@Param("clientId") long clientId , @Param("bookInfoId") long bookInfoId);

    int delete(@Param("id") Long id);

    int update(@Param("bookInfoId") long bookInfoId);

    BorrowRequest borrowRequestSearchByid (@Param("id") Long id);
}
