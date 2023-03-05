package course.linkflower.link.oneframework.house.dao;

import course.linkflower.link.oneframework.db.mapper.SuperMapper;
import course.linkflower.link.oneframework.house.dto.book.AddBookDto;
import course.linkflower.link.oneframework.house.dto.book.UpdateBookDto;
import course.linkflower.link.oneframework.house.dto.publisher.AddPublisherDto;
import course.linkflower.link.oneframework.house.dto.publisher.UpdatePublisherDto;
import course.linkflower.link.oneframework.house.model.Publisher;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.Collection;
import java.util.List;

@Mapper
public interface PublisherMapper extends SuperMapper<Publisher> {
    int save(@Param("name") String name);

    int delete(@Param("id") Long id);

    int update(@Param("name") String name ,@Param("id") Long id);
    Publisher publisherSearchById (@Param("id") Long id);

    List<Publisher> listByIds(@Param("ids") Collection<Long> ids);

}
