package course.linkflower.link.oneframework.house.dao;

import course.linkflower.link.oneframework.db.mapper.SuperMapper;
import course.linkflower.link.oneframework.house.dto.author.AddAuthorDto;
import course.linkflower.link.oneframework.house.vo.author.AuthorVo;
import feign.Param;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface AuthorMapper extends SuperMapper<AuthorMapper> {
    int addAuthor(AddAuthorDto addAuthorDto);
    AuthorVo getAuthorById(@Param("id") long id);
    int updateAuthor(Author author);
    int deleteAuthorById(@Param("id") long id);
}
