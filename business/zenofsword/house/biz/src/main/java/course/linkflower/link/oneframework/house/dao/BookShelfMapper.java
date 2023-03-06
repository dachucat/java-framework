package course.linkflower.link.oneframework.house.dao;

import course.linkflower.link.oneframework.db.mapper.SuperMapper;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.Collection;
import java.util.List;

@Mapper
public interface BookShelfMapper extends SuperMapper<Bookshelf> {
    int save(@Param("name") String name);

    int delete(@Param("id") Long id);

    int update(@Param("name") String name);

    Bookshelf bookShelfSearchById(@Param("id") Long id);

    Bookshelf getByBarcode(@Param("barcode") String barcode);

    List<Bookshelf> listByIds(@Param("ids") Collection<Long> ids);
}
