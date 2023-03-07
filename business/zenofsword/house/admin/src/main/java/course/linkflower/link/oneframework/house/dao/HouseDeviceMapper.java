package course.linkflower.link.oneframework.house.dao;

import course.linkflower.link.oneframework.house.model.AreaInfo;
import course.linkflower.link.oneframework.house.model.HouseDevice;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

@Mapper
public interface HouseDeviceMapper {
    int save (HouseDevice houseDevice);
    int delete(@Param("id") long id);
    int update(HouseDevice houseDevice);
    HouseDevice getHouseDeviceById(@Param("id") long id);
}
