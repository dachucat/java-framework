package course.linkflower.link.oneframework.car.dao;

import course.linkflower.link.oneframework.db.mapper.SuperMapper;
import course.linkflower.link.oneframework.car.dto.carcompany.CarCompanyNoIdDto;
import course.linkflower.link.oneframework.car.model.CarCompany;
import course.linkflower.link.oneframework.car.vo.carcompany.CarCompanyNoIdVo;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

@Mapper
public interface CarCompanyMapper extends SuperMapper<CarCompanyMapper> {
    int add(CarCompany carCompany);

    int update(CarCompany carCompany);

    CarCompanyNoIdVo getCarCompanyById(@Param("id") long id);
}
