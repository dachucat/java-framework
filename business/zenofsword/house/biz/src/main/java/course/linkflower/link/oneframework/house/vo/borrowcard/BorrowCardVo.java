package course.linkflower.link.oneframework.house.vo.borrowcard;

import lombok.Data;

@Data
public class BorrowCardVo {
    private String id;
    private String clientId;
    private String startDate;
    private String endDate;
    private byte status;
    private byte level;
    private String bookCount;
    public BorrowCardVo loadFrom(BorrowCard borrowCard){
        if (borrowCard!=null){
            id=String.valueOf(borrowCard.getId());
            clientId=String.valueOf(borrowCard.getClientId());
            startDate=borrowCard.getStartDate();
            endDate=borrowCard.getEndDate();
            status=borrowCard.getStatus();
            level=borrowCard.getLevel();
            bookCount=String.valueOf(borrowCard.getBookCount());
        }
        return this;
    }
}
