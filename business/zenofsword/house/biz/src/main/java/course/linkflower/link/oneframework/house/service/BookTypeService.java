package course.linkflower.link.oneframework.house.service;

import course.linkflower.link.oneframework.house.dto.bookType.AddBookTypeDto;
import course.linkflower.link.oneframework.house.dto.bookType.DeleteBookTypeDto;
import course.linkflower.link.oneframework.house.dto.bookType.SearchBookTypeDto;
import course.linkflower.link.oneframework.house.dto.bookType.UpdateBookTypeDto;
import course.linkflower.link.oneframework.house.vo.bookType.BookTypeVo;

public interface BookTypeService {
    void addBookType (AddBookTypeDto addBookTypeDto);
    void updateType(UpdateBookTypeDto updateBookTypeDto);
    void deleteType (DeleteBookTypeDto deleteBookTypeDto);
    BookTypeVo getBookTypeById(SearchBookTypeDto searchBookTypeDto);
}
