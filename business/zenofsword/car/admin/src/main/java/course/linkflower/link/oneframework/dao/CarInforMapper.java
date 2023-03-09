package course.linkflower.link.oneframework.dao;

import course.linkflower.link.oneframework.db.mapper.SuperMapper;
import course.linkflower.link.oneframework.model.CarInfor;
import course.linkflower.link.oneframework.vo.carinfor.CarInforVo;
import org.apache.ibatis.annotations.Param;

public interface CarInforMapper extends SuperMapper<CarInforMapper> {
    int countCarPatternId(long carPatternId);

    int add(CarInfor carInfor);

    int deleteById(@Param("id") long id);

    int countCarPatternIdDiffId(@Param("carPatternId") long carPatternId,@Param("id") long id);

    CarInforVo getCarInforById(@Param("id") long id);

    int updateById(CarInfor carInfor);
}
