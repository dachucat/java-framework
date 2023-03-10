package course.linkflower.link.oneframework.house.vo.bookInfo;

import lombok.Data;

import java.math.BigDecimal;
@Data
public class BookInfoVo {
    private String id;
    private String name;
    private String publisherId;
    private String version;
    private BigDecimal price;
    private String barcode;
    private String count;

    public BookInfoVo loadFrom(BookInfo bi){
        if (bi != null){
            name = bi.getName();
            barcode = bi.getBarcode();
            price = bi.getPrice();
        }
        return  this;
    }
}
