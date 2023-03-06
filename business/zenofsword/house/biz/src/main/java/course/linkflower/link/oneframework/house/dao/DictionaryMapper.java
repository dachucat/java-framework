package course.linkflower.link.oneframework.house.dao;

import course.linkflower.link.oneframework.house.model.Dictionary;
import course.linkflower.link.oneframework.house.model.RentHouseInfo;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;

@Mapper
public interface DictionaryMapper {

    List<Dictionary> listDictionaryByKey(@Param("key") String key, @Param("count") int count);
    int save (Dictionary dictionary);
    int delete(@Param("id") long id);
    int update(Dictionary dictionary);
    Dictionary getDictionaryById(@Param("id") long id);
}
