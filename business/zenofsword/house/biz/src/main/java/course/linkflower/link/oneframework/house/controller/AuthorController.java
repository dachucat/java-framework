package course.linkflower.link.oneframework.house.controller;

import course.linkflower.link.oneframework.common.model.Result;
import course.linkflower.link.oneframework.house.dto.author.AddAuthorDto;
import course.linkflower.link.oneframework.house.dto.author.AuthorIdDto;
import course.linkflower.link.oneframework.house.dto.author.UpdateAuthorDto;
import course.linkflower.link.oneframework.house.dto.base.IdDto;
import course.linkflower.link.oneframework.house.service.AuthorService;
import course.linkflower.link.oneframework.house.vo.author.AuthorVo;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@Slf4j
@RequestMapping("/author")
@RefreshScope
public class AuthorController {
    @Autowired
    private AuthorService authorService;

    @PostMapping("/addAuthor")
    public Result<AuthorVo> addAuthor(@RequestBody AddAuthorDto addAuthorDto){
        return Result.succeed(authorService.addAuthor(addAuthorDto));
    }

    @PostMapping("/getAuthorByAuthorId")
    public Result<AuthorVo> getAuthorByAuthorId(@RequestBody IdDto idDto){
        return Result.succeed(authorService.getAuthorById(idDto));
    }

    @PostMapping("/updateAuthor")
    public Result<AuthorVo> updateAuthor(@RequestBody UpdateAuthorDto updateAuthorDto){
        return Result.succeed(authorService.updateAuthor(updateAuthorDto));
    }

    @PostMapping("/deleteAuthorById")
    public Result<AuthorVo> deleteAuthorById(@RequestBody IdDto idDto){
        authorService.deleteAuthorById(idDto);
        return Result.succeed();
    }
}

