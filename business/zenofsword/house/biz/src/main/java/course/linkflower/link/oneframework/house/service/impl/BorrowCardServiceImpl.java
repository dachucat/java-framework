package course.linkflower.link.oneframework.house.service.impl;

import course.linkflower.link.oneframework.house.dao.BorrowCardMapper;
import course.linkflower.link.oneframework.house.dto.base.IdDto;
import course.linkflower.link.oneframework.house.dto.borrowCard.BorrowCardDto;
import course.linkflower.link.oneframework.house.service.BorrowCardService;
import course.linkflower.link.oneframework.house.vo.borrowcard.BorrowCardVo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class BorrowCardServiceImpl implements BorrowCardService {
    @Autowired
    private BorrowCardMapper borrowCardMapper;

    @Override
    public int addBorrowCard(BorrowCardDto borrowCardDto) {
        return borrowCardMapper.addBorrowCard(borrowCardDto);
    }

    @Override
    public void deleteBorrowCard(BorrowCardDto borrowCardDto) {
        borrowCardMapper.deleteBorrowCard(borrowCardDto);
    }

    @Override
    public BorrowCardVo getBorrowCardByBorrowCardId(IdDto idDto) {
        return new BorrowCardVo().loadFrom(borrowCardMapper.getBorrowCardByBorrowCardId(Long.parseLong(idDto.getId())));
    }
    @Override
    public void updateBorrowCard(BorrowCardDto borrowCardDto) {
        borrowCardMapper.updateBorrowCard(borrowCardDto);
    }
}
