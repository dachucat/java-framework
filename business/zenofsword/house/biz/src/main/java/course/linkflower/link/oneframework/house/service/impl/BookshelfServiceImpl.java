package course.linkflower.link.oneframework.house.service.impl;

import course.linkflower.link.oneframework.house.dao.BookShelfMapper;
import course.linkflower.link.oneframework.house.dto.bookShelf.AddBookShelfDto;
import course.linkflower.link.oneframework.house.dto.bookShelf.DeleteBookShelfDto;
import course.linkflower.link.oneframework.house.dto.bookShelf.SearchBookShelfDto;
import course.linkflower.link.oneframework.house.dto.bookShelf.UpdateBookShelfDto;
import course.linkflower.link.oneframework.house.service.BookshelfService;
import course.linkflower.link.oneframework.house.vo.bookShelf.BookShelfVo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class BookshelfServiceImpl implements BookshelfService {
    @Autowired
    BookShelfMapper bookShelfMapper;

    @Override
    public void addBookShelf(AddBookShelfDto addBookShelfDto) {
        bookShelfMapper.save(addBookShelfDto.getName());
    }

    @Override
    public void updateBookShelf(UpdateBookShelfDto updateBookShelfDto) {
        bookShelfMapper.update(updateBookShelfDto.getName());
    }

    @Override
    public void deleteBookShelf(DeleteBookShelfDto deleteBookShelfDto) {
        bookShelfMapper.delete(Long.parseLong(deleteBookShelfDto.getId()));
    }

    @Override
    public BookShelfVo getBookShelfById(SearchBookShelfDto searchBookShelfDto) {
        return new BookShelfVo().loadFrom(bookShelfMapper.bookShelfSearchById(Long.parseLong(searchBookShelfDto.getId())));
    }
}
