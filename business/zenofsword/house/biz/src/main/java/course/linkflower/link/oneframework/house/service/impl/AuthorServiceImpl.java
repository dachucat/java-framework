package course.linkflower.link.oneframework.house.service.impl;

import course.linkflower.link.oneframework.house.dto.author.AddAuthorDto;
import course.linkflower.link.oneframework.house.dto.author.UpdateAuthorDto;
import course.linkflower.link.oneframework.house.dto.base.IdDto;
import course.linkflower.link.oneframework.house.service.AuthorService;
import course.linkflower.link.oneframework.house.vo.author.AuthorVo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class AuthorServiceImpl implements AuthorService {

    @Autowired
    private AuthorMapper authorMapper;

    @Override
    public AuthorVo addAuthor(AddAuthorDto addAuthorDto) {
         authorMapper.addAuthor(addAuthorDto);
         return authorMapper.getAuthorById(Long.parseLong(addAuthorDto.getId()));
    }

    @Override
    public AuthorVo getAuthorById(IdDto idDto) {
        return authorMapper.getAuthorById(Long.parseLong(idDto.getId()));
    }

    @Override
    public AuthorVo updateAuthor(UpdateAuthorDto updateAuthorDto) {
        Author author=updateAuthorDto.toModel(updateAuthorDto);
        authorMapper.updateAuthor(author);
        return authorMapper.getAuthorById(author.getId());
    }

    @Override
    public void deleteAuthorById(IdDto idDto) {
        authorMapper.deleteAuthorById(Long.parseLong(idDto.getId()));
    }
}
