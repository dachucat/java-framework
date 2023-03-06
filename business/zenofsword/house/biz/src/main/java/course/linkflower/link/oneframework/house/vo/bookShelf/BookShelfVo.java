package course.linkflower.link.oneframework.house.vo.bookShelf;

import lombok.Data;

@Data
public class BookShelfVo {
    private String id;
    private String name;
    private int type;
    private String barcode;
    private int status;

    public BookShelfVo loadFrom(Bookshelf bookshelf){
            if (bookshelf != null){
                name = bookshelf.getName();
                type = bookshelf.getType();
                barcode = bookshelf.getBarcode();
            }
            return this;
    }
}
