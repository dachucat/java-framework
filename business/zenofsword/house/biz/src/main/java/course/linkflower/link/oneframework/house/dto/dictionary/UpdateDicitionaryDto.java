package course.linkflower.link.oneframework.house.dto.dictionary;

import course.linkflower.link.oneframework.house.model.Dictionary;
import lombok.Data;

@Data
public class UpdateDicitionaryDto {
    private String id;
    private String type;
    private String key;
    private String value;
    public Dictionary toModel(){
        Dictionary dictionary = new Dictionary();
        dictionary.setId(Long.parseLong(id));
        dictionary.setType(type);
        dictionary.setKey(key);
        dictionary.setValue(value);
        return dictionary;
    }
}
