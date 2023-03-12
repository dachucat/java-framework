package course.linkflower.link.oneframework.dao;

import course.linkflower.link.oneframework.db.mapper.SuperMapper;
import course.linkflower.link.oneframework.model.CarCompany;
import course.linkflower.link.oneframework.vo.carcompany.CarCompanyShowVo;
import course.linkflower.link.oneframework.vo.carcompany.CarCompanyVo;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;

@Mapper
public interface CarCompanyMapper extends SuperMapper<CarCompanyMapper> {
    int add(CarCompany carCompany);

    int update(CarCompany carCompany);

    CarCompanyVo getCarCompanyById(@Param("id") long id);

    int countName(@Param("name")String name);

    int countNameDiffId(@Param("name") String name,@Param("id") long id);

    List<CarCompanyShowVo> search(@Param("startCount") int startCount,@Param("pageSize") int pageSize);

    Long countAll();
}
