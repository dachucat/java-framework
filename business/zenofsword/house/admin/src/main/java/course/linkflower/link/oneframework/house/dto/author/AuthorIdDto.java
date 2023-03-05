package course.linkflower.link.oneframework.house.dto.author;

import course.linkflower.link.oneframework.house.model.Author;
import lombok.Data;

@Data
public class AuthorIdDto {
    private String id;

    public Author toModel(AuthorIdDto authorIdDto){
        Author author=new Author();
        author.setId(Long.parseLong(id));
        return author;
    }
}
