package course.linkflower.link.oneframework.dao;

import course.linkflower.link.oneframework.db.mapper.SuperMapper;
import course.linkflower.link.oneframework.model.UsedCarPhoto;
import course.linkflower.link.oneframework.vo.usedcarphoto.UsedCarPhotoVo;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;

@Mapper
public interface UsedCarPhotoMapper extends SuperMapper<UsedCarPhotoMapper> {

    int add(UsedCarPhoto usedCarPhoto);

    byte lastOrderingByUsedCarId(@Param("id") long id);

    int deleteById(@Param("id") long id);

    int updateById(UsedCarPhoto usedCarPhoto);

    List<UsedCarPhotoVo> listPhotoById(@Param("usedCarId") long usedCarId);
}
