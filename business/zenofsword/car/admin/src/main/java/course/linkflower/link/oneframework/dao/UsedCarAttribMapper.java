package course.linkflower.link.oneframework.dao;

import course.linkflower.link.oneframework.dao.UsedCarMapper;
import course.linkflower.link.oneframework.db.mapper.SuperMapper;
import course.linkflower.link.oneframework.model.UsedCarAttrib;
import course.linkflower.link.oneframework.vo.usedcarattrib.UsedCarAttribVo;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;

@Mapper
public interface UsedCarAttribMapper extends SuperMapper<UsedCarMapper> {
    int countUsedCarIdAttribKeyValue(@Param("usedCarId") long usedCarId,@Param("attribKey") String attribKey,@Param("value") long value);

    int add(UsedCarAttrib usedCarAttrib);

    UsedCarAttribVo getUsedCarAttribById(@Param("id") Long id);

    List<UsedCarAttribVo> search(@Param("startCount") int startPage,@Param("pageSize") int pageSize);

    Long countAll();

    int updateById(UsedCarAttrib usedCarAttrib);

    int countUsedCarIdAttribKeyValueDiffId(@Param("usedCarId") long usedCarId,@Param("attribKey") String attribKey,@Param("value") long value, @Param("id") long id);

    int countUsedCarIdAttribKey(@Param("usedCarId") long usedCarId,@Param("attribKey") String attribKey);

    int countUsedCarIdAttribKeyDiffId(@Param("usedCarId") long usedCarId,@Param("attribKey") String attribKey,@Param("id") long id);
}
