package course.linkflower.link.oneframework.dao;

import course.linkflower.link.oneframework.db.mapper.SuperMapper;
import course.linkflower.link.oneframework.model.CarDictionary;
import course.linkflower.link.oneframework.vo.CarDictionary.CarDictionaryVo;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

@Mapper
public interface CarDictionaryMapper extends SuperMapper<CarDictionaryMapper> {

    int countTypeValue(@Param("type") String type,@Param("value") String value);

    int add(CarDictionary carDictionary);

    CarDictionaryVo getCarDictById(Long id);

    Integer lastOrderingByType(@Param("type") String type);
}
