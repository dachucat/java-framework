package course.linkflower.link.oneframework.dao;

import course.linkflower.link.oneframework.db.mapper.SuperMapper;
import course.linkflower.link.oneframework.model.UsedCar;
import course.linkflower.link.oneframework.vo.usedcar.UsedCarVo;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.springframework.security.core.parameters.P;

import java.util.Date;
import java.util.List;

@Mapper
public interface UsedCarMapper extends SuperMapper<UsedCarMapper> {

    int add(UsedCar usedCar);

    int updateById(UsedCar usedCar);

    UsedCarVo getUsedCarById(@Param("id") long id);

    List<UsedCarVo> listUsedCarByPostDate(@Param("postDate") Date postDate,@Param("DefaultMaxCountLimit") int DefaultMaxCountLimit);

    int deleteById(@Param("id") long id);
}
