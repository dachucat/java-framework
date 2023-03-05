package course.linkflower.link.oneframework.house.dao;

import course.linkflower.link.oneframework.db.mapper.SuperMapper;
import course.linkflower.link.oneframework.house.dto.bookoftype.BookOfTypeDto;
import course.linkflower.link.oneframework.house.vo.bookoftype.BookOfTypeVo;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

@Mapper
public interface BookOfTypeMapper extends SuperMapper<BookOfTypeMapper> {
    int add(BookOfTypeDto bookOfTypeDto);
    BookOfTypeVo getBookOfTypeById(@Param("BookTypeId") long BookTypeId, @Param("BookInforId") long BookInforId);
}
