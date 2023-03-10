package course.linkflower.link.oneframework.house.dao;

import course.linkflower.link.oneframework.common.dto.CodeDto;
import course.linkflower.link.oneframework.db.mapper.SuperMapper;
import course.linkflower.link.oneframework.house.vo.park.ParkTreeVo;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface ParkMapper extends SuperMapper<ParkMapper> {
    List<ParkTreeVo> listParkTreeByCode(CodeDto codeDto);
}
