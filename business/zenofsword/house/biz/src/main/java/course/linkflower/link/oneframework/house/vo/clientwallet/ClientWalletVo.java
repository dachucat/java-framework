package course.linkflower.link.oneframework.house.vo.clientwallet;

import lombok.Data;

import java.util.Date;

@Data
public class ClientWalletVo {
    private String id;
    private String clientId;
    private String amount;
    private Date lastDeposit;

}
