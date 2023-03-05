package course.linkflower.link.oneframework.house.service;

import course.linkflower.link.oneframework.house.dto.base.IdDto;
import course.linkflower.link.oneframework.house.dto.borrowCard.BorrowCardDto;
import course.linkflower.link.oneframework.house.vo.borrowcard.BorrowCardVo;

public interface BorrowCardService {
    int addBorrowCard(BorrowCardDto borrowCardDto);
    void deleteBorrowCard(BorrowCardDto borrowCardDto);
    void updateBorrowCard(BorrowCardDto borrowCardDto);
    BorrowCardVo getBorrowCardByBorrowCardId(IdDto idDto);
}
