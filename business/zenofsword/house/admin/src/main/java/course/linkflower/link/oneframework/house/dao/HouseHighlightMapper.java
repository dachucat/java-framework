package course.linkflower.link.oneframework.house.dao;

import course.linkflower.link.oneframework.house.model.HouseHighlight;
import course.linkflower.link.oneframework.house.model.HouseHightlightInfo;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

@Mapper
public interface HouseHighlightMapper {
    int save (HouseHighlight houseHighlight);
    int delete(@Param("id") long id);
    int update(HouseHighlight houseHighlight);
    HouseHighlight getHouseHighlightById(@Param("id") long id);
    int countByHouseHighlight(@Param("rentHouseInfoId") long rentHouseInfoId,@Param("HighlightId") long HighlightId);
}
