package course.linkflower.link.oneframework.house.dao;

import course.linkflower.link.oneframework.house.model.HouseDictionary;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

@Mapper
public interface HouseDictionaryMapper {
    int save (HouseDictionary houseDictionary);
    int delete(@Param("id") long id);
    int update(HouseDictionary houseDictionary);
    HouseDictionary getHouseDictionaryById(@Param("id") long id);
    int lastSortValueByKey(@Param("key") String key);
    int countByTypeKey(@Param("type") String type,@Param("key") String key);
}
