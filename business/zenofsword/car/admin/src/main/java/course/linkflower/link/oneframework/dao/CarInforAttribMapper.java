package course.linkflower.link.oneframework.dao;

import course.linkflower.link.oneframework.db.mapper.SuperMapper;
import course.linkflower.link.oneframework.dto.carinforattrib.CarInforAttribDto;
import course.linkflower.link.oneframework.model.CarInforAttrib;
import course.linkflower.link.oneframework.vo.carinforattrib.CarInforAttribVo;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.springframework.security.core.parameters.P;

import java.util.List;

@Mapper
public interface CarInforAttribMapper extends SuperMapper<CarInforAttribMapper> {

    int countCarInforIdTypeKey(@Param("carInforId") long carInforId,@Param("typeCarDictKey") String typeCarDictKey);

    int add(CarInforAttrib carInforAttrib);

    int deleteById(@Param("id") long id);
    
    int countCarInforIdTypeKeyDiffId(@Param("carInforId") long carInforId,@Param("typeCarDictKey") String typeCarDictKey,@Param("id") long id);
    
    int updateById(CarInforAttrib carInforAttrib);

    CarInforAttribVo getCarInforAttribById(@Param("id") long id);

    List<CarInforAttribVo> listCarInforAttribByCarInforId(@Param("id") long id,@Param("defaultMaxCountLimit") int defaultMaxCountLimit);
}
