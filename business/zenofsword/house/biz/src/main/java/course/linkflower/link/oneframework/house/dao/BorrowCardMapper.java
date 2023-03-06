package course.linkflower.link.oneframework.house.dao;

import course.linkflower.link.oneframework.db.mapper.SuperMapper;
import course.linkflower.link.oneframework.house.dto.borrowCard.BorrowCardDto;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;


import java.util.Collection;
import java.util.List;

@Mapper
public interface BorrowCardMapper extends SuperMapper<BorrowCardMapper> {
    int addBorrowCard(BorrowCardDto borrowCardDto);
    int deleteBorrowCard(BorrowCardDto borrowCardDto);
    int updateBorrowCard(BorrowCardDto borrowCardDto);
    BorrowCard getBorrowCardByBorrowCardId(@Param("id") long id);
    List<BorrowCard> listByIds(@Param("ids") Collection<Long> ids);
}
