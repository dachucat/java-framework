package course.linkflower.link.oneframework.house.dao;

import course.linkflower.link.oneframework.house.model.AreaInfo;
import course.linkflower.link.oneframework.house.model.HouseDeviceType;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

@Mapper
public interface HouseDeviceTypeMapper {
    int save (HouseDeviceType houseDeviceType);
    int delete(@Param("id") long id);
    int update(HouseDeviceType houseDeviceType);
    HouseDeviceType getHouseDeviceTypeById(@Param("id") long id);
}
