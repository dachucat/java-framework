package course.linkflower.link.oneframework.house.dao;

import course.linkflower.link.oneframework.house.model.AreaInfo;
import course.linkflower.link.oneframework.house.model.AreaProductDetails;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

@Mapper
public interface AreaProductDetailsMapper {
    int save (AreaProductDetails areaProductDetails);
    int delete(@Param("id") long id);
    int update(AreaProductDetails areaProductDetails);
    AreaProductDetails getAreaProductDetailsById(@Param("id") long id);
    int countByAreaTargetType(AreaProductDetails areaProductDetails);
}
