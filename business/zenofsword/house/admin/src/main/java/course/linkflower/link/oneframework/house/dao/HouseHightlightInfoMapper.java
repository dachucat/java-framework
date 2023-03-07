package course.linkflower.link.oneframework.house.dao;

import course.linkflower.link.oneframework.house.model.HouseDeviceType;
import course.linkflower.link.oneframework.house.model.HouseHightlightInfo;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

@Mapper
public interface HouseHightlightInfoMapper {
    int save (HouseHightlightInfo houseHightlightInfo);
    int delete(@Param("id") long id);
    int update(HouseHightlightInfo houseHightlightInfo);
    HouseHightlightInfo getHouseHightlightInfoById(@Param("id") long id);
}
