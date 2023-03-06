package course.linkflower.link.oneframework.house.vo.borrowRecord;

import lombok.Data;

@Data
public class BorrowRecordVo {
    private String id;
    private String clientId;
    private String borrowCardId;
    private int status;
    private String startDate;
    private String endDate;
    private String remark;

    public BorrowRecordVo loadFrom(BorrowRecord borrowRecord){
        if (borrowRecord != null){
            clientId = String.valueOf(borrowRecord.getClientId());
            startDate = borrowRecord.getStartDate();
            endDate = borrowRecord.getEndDate();
        }
        return  this;
    }
}
