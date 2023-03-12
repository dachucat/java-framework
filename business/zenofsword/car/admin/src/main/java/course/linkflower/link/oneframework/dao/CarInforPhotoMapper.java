package course.linkflower.link.oneframework.dao;

import course.linkflower.link.oneframework.db.mapper.SuperMapper;
import course.linkflower.link.oneframework.model.CarInforPhoto;
import course.linkflower.link.oneframework.vo.carinfor.CarInforVo;
import course.linkflower.link.oneframework.vo.carinforphoto.CarInforPhotoShowVo;
import course.linkflower.link.oneframework.vo.carinforphoto.CarInforPhotoVo;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;

@Mapper
public interface CarInforPhotoMapper extends SuperMapper<CarInforPhotoMapper> {

    int add(CarInforPhoto carInforPhoto);

    Byte lastOrderingByCarInforId(@Param("carInforId") long carInforId);

    int deleteById(@Param("id") long id);

    int updateById(CarInforPhoto carInforPhoto);

    List<CarInforPhotoVo> listPhotoByCarInforId(@Param("carInforId") long carInforId);

    CarInforPhotoVo getCarInforPhotoById(@Param("id") Long id);

    Long countAll();

    List<CarInforPhotoShowVo> search(@Param("startCount") int startCount,@Param("pageSize") int pageSize);
}
