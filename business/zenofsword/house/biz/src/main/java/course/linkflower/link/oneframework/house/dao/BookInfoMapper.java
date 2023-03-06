package course.linkflower.link.oneframework.house.dao;

import course.linkflower.link.oneframework.db.mapper.SuperMapper;
import course.linkflower.link.oneframework.house.vo.book.BookVo;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.Collection;
import java.util.List;

@Mapper
public interface BookInfoMapper extends SuperMapper<BookInfo> {

    BookVo getDetailById(@Param("id") long id);
    int save(@Param("name") String name);

    int delete(@Param("id") Long id);

    int update(@Param("name") String name);

    BookInfo bookInfoSearchById(@Param("id") Long id);

    BookInfo getBookByBarcode(@Param("barcode") String barcode);

    List<BookInfo> listByIds(@Param("ids") Collection<Long> ids);

}
