package course.linkflower.link.oneframework.dao;

import course.linkflower.link.oneframework.common.dto.PageDto;
import course.linkflower.link.oneframework.db.mapper.SuperMapper;
import course.linkflower.link.oneframework.model.CarBrand;
import course.linkflower.link.oneframework.vo.carbrand.CarBrandShowVo;
import course.linkflower.link.oneframework.vo.carbrand.CarBrandVo;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;

@Mapper
public interface CarBrandMapper extends SuperMapper<CarBrandMapper> {
    int add(CarBrand carBrand);

    int deleteById(@Param("id") long id);

    int update(CarBrand carBrand);

    CarBrandVo getCarBrandById(@Param("id") long id);

    List<CarBrandVo> listNameByCarCompanyId(@Param("id") long id,@Param("DefaultMaxCountLimit") int DefaultMaxCountLimit);

    int countCompanyIdBrandName(@Param("carCompanyId") long carCompanyId,@Param("name") String name);

    int countCompanyIdBrandNamediffId(@Param("carCompanyId")long carCompanyId, @Param("name") String name,
                                      @Param("id") long id);

    Long countAll();


    List<CarBrandShowVo> search(@Param("startCount") int startCount,@Param("pageSize") int pageSize);
}
