package course.linkflower.link.oneframework.house.dao;

import course.linkflower.link.oneframework.house.model.AreaInfo;
import course.linkflower.link.oneframework.house.model.CommunityInfo;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

@Mapper
public interface AreaInfoMapper {
    int save (AreaInfo areaInfo);
    int delete(@Param("id") long id);
    int update(AreaInfo areaInfo);
    AreaInfo getAreaInfoById(@Param("id") long id);
}
