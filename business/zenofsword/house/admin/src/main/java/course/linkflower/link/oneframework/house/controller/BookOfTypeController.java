package course.linkflower.link.oneframework.house.controller;

import course.linkflower.link.oneframework.common.model.Result;
import course.linkflower.link.oneframework.house.dto.bookoftype.BookOfTypeDto;
import course.linkflower.link.oneframework.house.service.BookOfTypeService;
import course.linkflower.link.oneframework.house.vo.bookoftype.BookOfTypeVo;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;



@RestController
@Slf4j
@RequestMapping("/bookOfType")
@RefreshScope
public class BookOfTypeController {
    @Autowired
    BookOfTypeService bookOfTypeService;

    @PostMapping("/add")
    Result<BookOfTypeVo> add(@RequestBody BookOfTypeDto bookOfTypeDto){
        return Result.succeed(bookOfTypeService.add(bookOfTypeDto));
    }
}
