package course.linkflower.link.oneframework.house.dao;

import course.linkflower.link.oneframework.db.mapper.SuperMapper;
import course.linkflower.link.oneframework.house.dto.book.SearchBookDto;

import course.linkflower.link.oneframework.house.vo.book.BookVo;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.Collection;
import java.util.List;

@Mapper
public interface BookMapper extends SuperMapper<Book> {
    int save(Book book);

    int deleteByBookInforId(@Param("id") long id);
    int delete(@Param("id") long id);

    int update(@Param("bookInfoId") long bookInfoId);
    BookVo bookSearchById(@Param("id") long id);

    BookVo bookSearchByName(@Param("name") String name);

    List<BookVo> bookSearch(SearchBookDto dto);

    List<BookVo> listBookByBookId(long id);

    List<Book> listByIds(@Param("ids") Collection<Long> ids);

}
