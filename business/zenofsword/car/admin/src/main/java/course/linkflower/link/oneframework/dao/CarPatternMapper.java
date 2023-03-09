package course.linkflower.link.oneframework.dao;

import course.linkflower.link.oneframework.db.mapper.SuperMapper;
import course.linkflower.link.oneframework.model.CarPattern;
import course.linkflower.link.oneframework.vo.carpattern.CarPatternVo;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;

@Mapper
public interface CarPatternMapper extends SuperMapper<CarPatternMapper> {

    int countBrandPatternTimeKey(@Param("CarBrandId") long CarBrandId,@Param("carPattern") String carPattern,
                                 @Param("timePattern") String timePattern,@Param("PatternKey") String PatternKey);

    int add(CarPattern carPattern);

    int deleteById(@Param("id") long id);

    int countBrandPatternTimeKeyDiffId(@Param("CarBrandId") long CarBrandId,@Param("carPattern") String carPattern,
                                           @Param("timePattern") String timePattern,@Param("PatternKey") String PatternKey,
                                           @Param("id") long id);

    int updateById(CarPattern carPattern);

    List<CarPatternVo> listCarPatternByCarBrandId(@Param("carBrandId") long carBrandId,
                                                  @Param("defaultMaxCountLimit") int defaultMaxCountLimit);

    CarPatternVo getCarPatternById(@Param("id") long id);
}
