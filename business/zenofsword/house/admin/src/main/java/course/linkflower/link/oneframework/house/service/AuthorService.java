package course.linkflower.link.oneframework.house.service;

import course.linkflower.link.oneframework.house.dto.author.AddAuthorDto;
import course.linkflower.link.oneframework.house.dto.author.AuthorIdDto;
import course.linkflower.link.oneframework.house.dto.author.UpdateAuthorDto;
import course.linkflower.link.oneframework.house.dto.base.IdDto;
import course.linkflower.link.oneframework.house.vo.author.AuthorVo;

public interface AuthorService {
    AuthorVo addAuthor(AddAuthorDto addAuthorDto);
    AuthorVo getAuthorById(IdDto idDto);

    AuthorVo updateAuthor(UpdateAuthorDto updateAuthorDto);

    void deleteAuthorById(IdDto idDto);
}
