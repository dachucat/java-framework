package course.linkflower.link.oneframework.dao;

import course.linkflower.link.oneframework.db.mapper.SuperMapper;
import course.linkflower.link.oneframework.dto.caradvantage.CarAdvantageDto;
import course.linkflower.link.oneframework.model.CarAdvantage;
import course.linkflower.link.oneframework.vo.caradvantage.CarAdvantageShowVo;
import course.linkflower.link.oneframework.vo.caradvantage.CarAdvantageVo;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;

@Mapper
public interface CarAdvantageMapper extends SuperMapper<CarAdvantageMapper> {

    int countAttribKey(@Param("attribKey") String attribKey);

    int add(CarAdvantage carAdvantage);

    CarAdvantageVo getCarAdvantageById(@Param("id") Long id);

    int deleteById(@Param("id") Long id);

    int updateById(CarAdvantageDto carAdvantageDto);

    int countAttribKeyDiffId(@Param("attribKey") String attribKey,@Param("id") long id);

    Long countAll();

    List<CarAdvantageShowVo> search(@Param("startCount") int startCount,@Param("pageSize") int pageSize);
}
