package course.linkflower.link.oneframework.house.dto.dictionary;

import course.linkflower.link.oneframework.house.model.Dictionary;
import lombok.Data;

@Data
public class AddDictionaryDto {
    private String type;
    private String key;
    private String value;
    private Integer sortValue;

    public Dictionary toModel(){
        Dictionary dictionary = new Dictionary();
        dictionary.setType(type);
        dictionary.setKey(key);
        dictionary.setValue(value);
        dictionary.setSortValue(sortValue);
        return dictionary;
    }
}
