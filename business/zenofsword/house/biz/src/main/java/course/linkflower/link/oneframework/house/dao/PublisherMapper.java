package course.linkflower.link.oneframework.house.dao;

import course.linkflower.link.oneframework.db.mapper.SuperMapper;
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
