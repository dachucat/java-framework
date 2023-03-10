package course.linkflower.link.oneframeworkweb.house.dao;

import course.linkflower.link.oneframework.house.model.*;
import course.linkflower.link.oneframework.house.vo.communityinfo.CommunityInfoVo;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.Collection;
import java.util.List;

@Mapper
public interface RentHouseWholeInfoMapper {

    RentHouseInfo getRentHouseInfoById(@Param("id") long id);
    List<HouseDictionary> searchHouseDictionaryByIds(@Param("ids") Collection<Long> ids);
    List<AreaInfo> searchAreaInfoByIds(@Param("ids") Collection<Long> ids);
    List<AreaProductDetails> getAreaInfoId(@Param("id") long id);
    CommunityInfo getCommunityInfoById(@Param("id") long id);
    Commission getCommissionById(@Param("id") long id);
    List<HouseDevice> getHouseDeviceId(@Param("id") long id);
    List<HouseDeviceType> searchHouseDeviceTypeByIds(@Param("ids") Collection<Long> ids);
    List<HouseHighlight> getHouseHighlightId(@Param("id") long id);
    List<HouseHightlightInfo> searchHouseHightlightInfoByIds(@Param("ids") Collection<Long> ids);
    List<RentHouseRequest> getRentHouseRequestId(@Param("id") long id);
    List<RentHouseRequestInfo> searchRentHouseRequestInfoByIds(@Param("ids") Collection<Long> ids);
}
