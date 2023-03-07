package course.linkflower.link.web.dao;

import course.linkflower.link.oneframework.house.model.AreaInfo;
import course.linkflower.link.oneframework.house.model.HouseDictionary;
import course.linkflower.link.oneframework.house.model.RentHouseInfo;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.Collection;
import java.util.Date;
import java.util.List;

@Mapper
public interface RentHouseWholeInfoMapper {

    RentHouseInfo getRentHouseInfoById(@Param("id") long id);
    List<HouseDictionary> searchHouseDictionaryByIds(@Param("ids") Collection<Long> ids);
    List<AreaInfo> searchAreaInfoByIds(@Param("ids") Collection<Long> ids);
}
