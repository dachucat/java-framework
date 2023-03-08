package course.linkflower.link.oneframework.dao;

import course.linkflower.link.oneframework.db.mapper.SuperMapper;
import course.linkflower.link.oneframework.dto.caradvantage.CarAdvantageDto;
import course.linkflower.link.oneframework.model.CarAdvantage;
import course.linkflower.link.oneframework.vo.caradvantage.CarAdvantageVo;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

@Mapper
public interface CarAdvantageMapper extends SuperMapper<CarAdvantageMapper> {

    int countTypeKey(@Param("typeKey") String typeKey);

    int add(CarAdvantage carAdvantage);

    CarAdvantageVo getCarAdvantageById(@Param("id") Long id);

    int deleteById(@Param("id") Long id);

    int updateById(CarAdvantageDto carAdvantageDto);

    int countTypeKeyDiffId(String typeKey, long id);
}
