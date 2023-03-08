package course.linkflower.link.oneframework.service;

import course.linkflower.link.oneframework.common.dto.base.IdDto;
import course.linkflower.link.oneframework.db.mapper.SuperMapper;
import course.linkflower.link.oneframework.model.CarPattern;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

@Mapper
public interface CarPatternMapper extends SuperMapper<CarPatternMapper> {

    int countBrandPatternTimeKey(@Param("CarBrandId") long CarBrandId,@Param("carPattern") String carPattern,
                                 @Param("timePattern") String timePattern,@Param("PatternKey") String PatternKey);

    int add(CarPattern carPattern);

    int deleteById(@Param("id") long id);

    boolean countBrandPatternTimeKeyDiffId(@Param("CarBrandId") long CarBrandId,@Param("carPattern") String carPattern,
                                           @Param("timePattern") String timePattern,@Param("PatternKey") String PatternKey,
                                           @Param("id") long id);
}
