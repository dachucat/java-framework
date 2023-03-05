package course.linkflower.link.oneframework.house.dao;

import course.linkflower.link.oneframework.house.model.RentHouseInfo;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

@Mapper
public interface RentHouseInfoMapper {
    int save (RentHouseInfo rentHouseInfo);
    int delete(@Param("id") long id);
    int update(RentHouseInfo rentHouseInfo);
    RentHouseInfo getRentHouseInfoById(@Param("id") long id);
}
