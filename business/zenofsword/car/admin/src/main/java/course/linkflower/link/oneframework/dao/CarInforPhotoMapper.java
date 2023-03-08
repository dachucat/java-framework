package course.linkflower.link.oneframework.dao;

import course.linkflower.link.oneframework.db.mapper.SuperMapper;
import course.linkflower.link.oneframework.model.CarInforPhoto;
import course.linkflower.link.oneframework.vo.carinforphoto.CarInforPhotoVo;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;

@Mapper
public interface CarInforPhotoMapper extends SuperMapper<CarInforPhotoMapper> {

    int add(CarInforPhoto carInforPhoto);

    byte lastOrderingByCarInforId(@Param("id") long id);

    int deleteById(@Param("id") long id);

    int updateById(CarInforPhoto carInforPhoto);

    List<CarInforPhotoVo> listPhotoById(@Param("carInforId") long carInforId);
}
