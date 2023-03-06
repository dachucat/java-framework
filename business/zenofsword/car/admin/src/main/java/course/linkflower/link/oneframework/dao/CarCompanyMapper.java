package course.linkflower.link.oneframework.dao;

import course.linkflower.link.oneframework.db.mapper.SuperMapper;
import course.linkflower.link.oneframework.model.CarCompany;
import course.linkflower.link.oneframework.vo.carcompany.CarCompanyNoIdVo;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

@Mapper
public interface CarCompanyMapper extends SuperMapper<CarCompanyMapper> {
    int add(CarCompany carCompany);

    int update(CarCompany carCompany);

    CarCompanyNoIdVo getCarCompanyById(@Param("id") long id);
}
