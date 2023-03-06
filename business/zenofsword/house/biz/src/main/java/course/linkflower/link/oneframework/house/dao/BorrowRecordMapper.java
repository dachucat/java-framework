package course.linkflower.link.oneframework.house.dao;

import course.linkflower.link.oneframework.db.mapper.SuperMapper;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

@Mapper
public interface BorrowRecordMapper extends SuperMapper<BorrowRecord> {
    int save(@Param("clientId") long clientId , @Param("startDate") String startDate );

    int delete(@Param("id") Long id);

    int update(@Param("clientId") long clientId);

    BorrowRecord borrowRecordSearchByid (@Param("id") Long id);


}
