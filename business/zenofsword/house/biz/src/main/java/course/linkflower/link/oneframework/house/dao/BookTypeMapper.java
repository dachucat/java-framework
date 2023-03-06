package course.linkflower.link.oneframework.house.dao;

import course.linkflower.link.oneframework.db.mapper.SuperMapper;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

@Mapper
public interface BookTypeMapper extends SuperMapper<BookType> {
    int save(@Param("name") String name);

    int delete(@Param("id") Long id);

    int update(@Param("name") String name);
    BookType bookTypeSearchById (@Param("id") Long id);
}
