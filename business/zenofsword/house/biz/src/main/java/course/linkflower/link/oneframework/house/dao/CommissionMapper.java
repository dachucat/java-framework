package course.linkflower.link.oneframework.house.dao;

import course.linkflower.link.oneframework.house.model.Commission;
import course.linkflower.link.oneframework.house.model.Dictionary;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

@Mapper
public interface CommissionMapper {
    int save (Commission commission);
    int delete(@Param("id") long id);
    int update(Commission commission);
    Commission getCommissionById(@Param("id") long id);
}
