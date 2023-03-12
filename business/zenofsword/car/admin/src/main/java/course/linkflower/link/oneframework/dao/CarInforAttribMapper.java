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

    int countCarInforIdAttribKeyValue(@Param("carInforId") long carInforId,@Param("attribKey") String attribKey,@Param("value") long value);

    int add(CarInforAttrib carInforAttrib);

    int deleteById(@Param("id") long id);
    
    int countCarInforIdAttribKeyValueDiffId(@Param("carInforId") long carInforId,@Param("attribKey") String attribKey,@Param("value") long value,@Param("id") long id);
    
    int updateById(CarInforAttrib carInforAttrib);

    CarInforAttribVo getCarInforAttribById(@Param("id") long id);

    List<CarInforAttribVo> listCarInforAttribByCarInforId(@Param("id") long id,@Param("defaultMaxCountLimit") int defaultMaxCountLimit);

    int countCarInforIdAttribKey(@Param("carInforId") long carInforId,@Param("attribKey") String attribKey);

    List<CarInforAttribVo> search(@Param("startCount") int startCount,@Param("pageSize") int pageSize);

    Long countAll();
}
