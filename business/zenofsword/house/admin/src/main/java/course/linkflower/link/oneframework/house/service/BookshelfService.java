package course.linkflower.link.oneframework.house.service;

import course.linkflower.link.oneframework.house.dto.bookInfo.AddBookInfoDto;
import course.linkflower.link.oneframework.house.dto.bookInfo.DeleteBookInfoDto;
import course.linkflower.link.oneframework.house.dto.bookInfo.SearchBookInfoDto;
import course.linkflower.link.oneframework.house.dto.bookInfo.UpdateBookInfoDto;
import course.linkflower.link.oneframework.house.dto.bookShelf.AddBookShelfDto;
import course.linkflower.link.oneframework.house.dto.bookShelf.DeleteBookShelfDto;
import course.linkflower.link.oneframework.house.dto.bookShelf.SearchBookShelfDto;
import course.linkflower.link.oneframework.house.dto.bookShelf.UpdateBookShelfDto;
import course.linkflower.link.oneframework.house.vo.bookInfo.BookInfoVo;
import course.linkflower.link.oneframework.house.vo.bookShelf.BookShelfVo;

public interface BookshelfService {
    void addBookShelf (AddBookShelfDto addBookShelfDto);
    void updateBookShelf(UpdateBookShelfDto updateBookShelfDto);
    void deleteBookShelf (DeleteBookShelfDto deleteBookShelfDto);
    BookShelfVo getBookShelfById(SearchBookShelfDto searchBookShelfDto);
}

