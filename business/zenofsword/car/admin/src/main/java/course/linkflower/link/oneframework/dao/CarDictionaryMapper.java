package course.linkflower.link.oneframework.dao;

import com.baomidou.mybatisplus.core.conditions.Wrapper;
import course.linkflower.link.oneframework.db.mapper.SuperMapper;
import course.linkflower.link.oneframework.model.CarDictionary;
import course.linkflower.link.oneframework.vo.CarDictionary.CarDictionaryVo;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;

@Mapper
public interface CarDictionaryMapper extends SuperMapper<CarDictionaryMapper> {

    int countTypeValue(@Param("type") String type,@Param("value") String value);

    int add(CarDictionary carDictionary);

    CarDictionaryVo getCarDictById(@Param("id") Long id);

    Integer lastOrderingByType(@Param("type") String type);

    int deleteById(@Param("id") long id);

    int countTypeValuediffId(@Param("type") String type, @Param("value") String value, @Param("id") long id);

    int update(CarDictionary carDictionary);

    List<CarDictionaryVo> listKeyByType(@Param("type") String type,@Param("DefaultMaxCountLimit") int DefaultMaxCountLimit);
}
