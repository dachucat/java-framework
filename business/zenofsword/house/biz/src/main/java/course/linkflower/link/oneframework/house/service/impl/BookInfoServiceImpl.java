package course.linkflower.link.oneframework.house.service.impl;

import course.linkflower.link.oneframework.house.dao.BookInfoMapper;
import course.linkflower.link.oneframework.house.dao.BookMapper;
import course.linkflower.link.oneframework.house.dto.bookInfo.AddBookInfoDto;
import course.linkflower.link.oneframework.house.dto.bookInfo.DeleteBookInfoDto;
import course.linkflower.link.oneframework.house.dto.bookInfo.SearchBookInfoDto;
import course.linkflower.link.oneframework.house.dto.bookInfo.UpdateBookInfoDto;
import course.linkflower.link.oneframework.house.model.BookInfo;
import course.linkflower.link.oneframework.house.service.BookInfoService;
import course.linkflower.link.oneframework.house.service.BookService;
import course.linkflower.link.oneframework.house.vo.bookInfo.BookInfoVo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class BookInfoServiceImpl implements BookInfoService {

    @Autowired
    BookInfoMapper bookInfoMapper;

    @Autowired
    private BookService bookService;

    @Override
    public void addBookInfo(AddBookInfoDto addBookInfoDto) {
        bookInfoMapper.save(addBookInfoDto.getName());
    }

    @Override
    public void updateBookInfo(UpdateBookInfoDto updateBookInfoDto) {
        bookInfoMapper.update(updateBookInfoDto.getName());
    }

    @Override
    public void deleteBookInfo(DeleteBookInfoDto deleteBookInfoDto) {
        bookService.deleteByBookInforId(Long.parseLong(deleteBookInfoDto.getId()));
        bookInfoMapper.delete(Long.parseLong(deleteBookInfoDto.getId()));
    }

    @Override
    public BookInfoVo getBookInfoById(SearchBookInfoDto searchBookInfoDto) {
        return new BookInfoVo().loadFrom(bookInfoMapper.bookInfoSearchById(Long.parseLong(searchBookInfoDto.getId())));
    }
}
