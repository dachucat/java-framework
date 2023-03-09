package course.linkflower.link.oneframework.dto.dictionary;

import course.linkflower.link.oneframework.model.Dictionary;
import lombok.Data;
import org.apache.commons.lang3.StringUtils;
@Data
public class DictionaryNoIdDto {
    private String id;
    private String value;
    private String key;
    private String type;
    private String ordering;

    public Dictionary toModel(DictionaryNoIdDto dictionaryNoIdDto) {
        Dictionary dictionary=new Dictionary();
        if (StringUtils.isNotEmpty(dictionaryNoIdDto.getValue())){
            dictionary.setValue(dictionaryNoIdDto.getValue());
        }
        if(StringUtils.isNotEmpty(dictionaryNoIdDto.getKey())){
            dictionary.setKey(dictionaryNoIdDto.getKey());
        }
        if (StringUtils.isNotEmpty(dictionaryNoIdDto.getType())) {
            dictionary.setType(dictionaryNoIdDto.getType());
        }
        if (StringUtils.isNotEmpty(dictionaryNoIdDto.getOrdering())) {
            dictionary.setOrdering(Long.valueOf(ordering));
        }
        return dictionary;
    }
}
