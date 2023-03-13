package course.linkflower.link.oneframework.dao;

import course.linkflower.link.oneframework.common.dto.PageDto;
import course.linkflower.link.oneframework.db.mapper.SuperMapper;
import course.linkflower.link.oneframework.model.UsedCarPhoto;
import course.linkflower.link.oneframework.vo.usedcarphoto.UsedCarPhotoShowVo;
import course.linkflower.link.oneframework.vo.usedcarphoto.UsedCarPhotoVo;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;

@Mapper
public interface UsedCarPhotoMapper extends SuperMapper<UsedCarPhotoMapper> {

    int add(UsedCarPhoto usedCarPhoto);

    Byte lastOrderingByUsedCarId(@Param("id") long id);

    int deleteById(@Param("id") long id);

    int updateById(UsedCarPhoto usedCarPhoto);

    List<UsedCarPhotoVo> listPhotoByUsedCarId(@Param("usedCarId") long usedCarId);

    List<UsedCarPhotoShowVo> search(@Param("startCount") int startCount, @Param("pageSize") int pageSize);

    long countAll();
}
