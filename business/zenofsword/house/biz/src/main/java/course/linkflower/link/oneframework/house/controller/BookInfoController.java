package course.linkflower.link.oneframework.house.controller;

import course.linkflower.link.oneframework.common.model.Result;
import course.linkflower.link.oneframework.house.dao.BookInfoMapper;
import course.linkflower.link.oneframework.house.dto.book.AddBookDto;
import course.linkflower.link.oneframework.house.dto.book.DeleteBookDto;
import course.linkflower.link.oneframework.house.dto.book.SearchBookDto;
import course.linkflower.link.oneframework.house.dto.book.UpdateBookDto;
import course.linkflower.link.oneframework.house.dto.bookInfo.AddBookInfoDto;
import course.linkflower.link.oneframework.house.dto.bookInfo.DeleteBookInfoDto;
import course.linkflower.link.oneframework.house.dto.bookInfo.SearchBookInfoDto;
import course.linkflower.link.oneframework.house.dto.bookInfo.UpdateBookInfoDto;
import course.linkflower.link.oneframework.house.service.BookInfoService;
import course.linkflower.link.oneframework.house.vo.book.BookVo;
import course.linkflower.link.oneframework.house.vo.bookInfo.BookInfoVo;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@Slf4j
@RequestMapping("/bookInfo")
@RefreshScope
public class BookInfoController {
    @Autowired
    private BookInfoService bookInfoService;

    @PostMapping("/add")
    public void add(@RequestBody AddBookInfoDto addBookInfoDto) {
        bookInfoService.addBookInfo(addBookInfoDto);
    }

    @PostMapping("/delete")
    public Result delete(@RequestBody DeleteBookInfoDto deleteBookInfoDto) {
         bookInfoService.deleteBookInfo(deleteBookInfoDto);
         return Result.succeed();
    }
    @PostMapping("/update")
    public void update(@RequestBody UpdateBookInfoDto updateBookInfoDto) {
        bookInfoService.updateBookInfo(updateBookInfoDto);
    }
    @PostMapping("/search")
    public BookInfoVo search(@RequestBody SearchBookInfoDto searchBookInfoDto){
        return bookInfoService.getBookInfoById(searchBookInfoDto);
    }
}
