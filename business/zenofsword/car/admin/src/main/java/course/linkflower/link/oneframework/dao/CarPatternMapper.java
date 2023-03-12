package course.linkflower.link.oneframework.dao;

import course.linkflower.link.oneframework.common.model.PageResult;
import course.linkflower.link.oneframework.db.mapper.SuperMapper;
import course.linkflower.link.oneframework.model.CarPattern;
import course.linkflower.link.oneframework.vo.carpattern.CarPatternShowVo;
import course.linkflower.link.oneframework.vo.carpattern.CarPatternVo;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;

@Mapper
public interface CarPatternMapper extends SuperMapper<CarPatternMapper> {

    int countBrandPatternTimeKey(@Param("carBrandId") long carBrandId,@Param("carPattern") String carPattern,
                                 @Param("timePattern") String timePattern,@Param("patternKey") String patternKey);

    int add(CarPattern carPattern);

    int deleteById(@Param("id") long id);

    int countBrandPatternTimeKeyDiffId(@Param("carBrandId") long carBrandId,@Param("carPattern") String carPattern,
                                           @Param("timePattern") String timePattern,@Param("patternKey") String patternKey,
                                           @Param("id") long id);

    int updateById(CarPattern carPattern);

    List<CarPatternVo> listCarPatternByCarBrandId(@Param("carBrandId") long carBrandId,
                                                  @Param("defaultMaxCountLimit") int defaultMaxCountLimit);

    CarPatternVo getCarPatternById(@Param("id") long id);

    List<CarPatternShowVo> search(@Param("startCount") int startCount,@Param("pageSize") int pageSize);

    Long countAll();
}
