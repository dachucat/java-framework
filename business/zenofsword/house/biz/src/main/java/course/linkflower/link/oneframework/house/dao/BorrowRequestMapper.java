package course.linkflower.link.oneframework.house.dao;

import course.linkflower.link.oneframework.db.mapper.SuperMapper;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
@Mapper
public interface BorrowRequestMapper extends SuperMapper<BorrowRequest> {
    int save(@Param("clientId") long clientId , @Param("bookInfoId") long bookInfoId);

    int delete(@Param("id") Long id);

    int update(@Param("bookInfoId") long bookInfoId);

    BorrowRequest borrowRequestSearchByid (@Param("id") Long id);
}
