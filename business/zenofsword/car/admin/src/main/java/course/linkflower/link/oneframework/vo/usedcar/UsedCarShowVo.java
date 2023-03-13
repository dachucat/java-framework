package course.linkflower.link.oneframework.vo.usedcar;

import lombok.Data;

import java.util.Date;

@Data
public class UsedCarShowVo {
    private String id;
    private String carInforId;
    private String accountId;
    private Date postDate;
    private String buildingId;
    private Date licenseDate;
    private String contactedName;
    private String contactedPhone;
    private byte status;
    private byte photoCount;
    private String natureKey;
    private Date insuranceDate;
    private Date aunnualInspectionDate;
    private String maintenanceKey;
    private Date compulsoryInsuranceDate;
    private String vin;
    private String description;
    private String transferFeeKey;
    private String anxuanKey;
    private String price;
    private String mileage;
}
