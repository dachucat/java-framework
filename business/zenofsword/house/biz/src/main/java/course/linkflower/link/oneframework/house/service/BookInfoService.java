package course.linkflower.link.oneframework.house.service;

import course.linkflower.link.oneframework.house.dto.bookInfo.AddBookInfoDto;
import course.linkflower.link.oneframework.house.dto.bookInfo.DeleteBookInfoDto;
import course.linkflower.link.oneframework.house.dto.bookInfo.SearchBookInfoDto;
import course.linkflower.link.oneframework.house.dto.bookInfo.UpdateBookInfoDto;
import course.linkflower.link.oneframework.house.vo.bookInfo.BookInfoVo;

public interface BookInfoService {

    void addBookInfo (AddBookInfoDto addBookInfoDto);
    void updateBookInfo(UpdateBookInfoDto updateBookInfoDto);
    void deleteBookInfo (DeleteBookInfoDto deleteBookInfoDto);
    BookInfoVo getBookInfoById(SearchBookInfoDto searchBookInfoDto);

}
