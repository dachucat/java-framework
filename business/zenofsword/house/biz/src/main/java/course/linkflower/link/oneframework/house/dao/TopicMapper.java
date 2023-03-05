package course.linkflower.link.oneframework.house.dao;

import course.linkflower.link.oneframework.db.mapper.SuperMapper;
import course.linkflower.link.oneframework.house.model.BookInfo;
import course.linkflower.link.oneframework.house.model.Publisher;
import course.linkflower.link.oneframework.house.model.Topic;
import course.linkflower.link.oneframework.house.vo.topic.TopicTreeVo;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.Collection;
import java.util.List;

@Mapper
public interface TopicMapper extends SuperMapper<Topic> {

    int countByCode(@Param("code") String code);
    int countByCodeAndId(@Param("code") String code, @Param("id") long id);
    int save(Topic topic);
    int delete(@Param("id") long id);
    int update(Topic topic);
    Topic getTopicById (@Param("id") long id);
    List<TopicTreeVo> listTopicTreeByParentCode(@Param("code") String code);
}