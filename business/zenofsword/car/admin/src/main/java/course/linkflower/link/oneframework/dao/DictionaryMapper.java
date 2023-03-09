package course.linkflower.link.oneframework.dao;

import course.linkflower.link.oneframework.db.mapper.SuperMapper;
import course.linkflower.link.oneframework.model.Dictionary;
import course.linkflower.link.oneframework.vo.dictionary.DictionaryVo;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;

@Mapper
public interface DictionaryMapper extends SuperMapper<DictionaryMapper> {
    int countTypeValue(@Param("type") String type, @Param("value") String value);

    int add(Dictionary dictionary);

    DictionaryVo getDictById(@Param("id") Long id);

    Integer lastOrderingByType(@Param("type") String type);

    int deleteById(@Param("id") long id);

    int countTypeValuediffId(@Param("type") String type, @Param("value") String value, @Param("id") long id);

    int update(Dictionary dictionary);

    List<DictionaryVo> listKeyByType(@Param("type") String type, @Param("DefaultMaxCountLimit") int DefaultMaxCountLimit);
}
