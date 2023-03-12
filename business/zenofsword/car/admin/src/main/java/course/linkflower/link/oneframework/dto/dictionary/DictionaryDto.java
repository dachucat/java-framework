package course.linkflower.link.oneframework.dto.dictionary;

import course.linkflower.link.oneframework.model.Dictionary;
import lombok.Data;
import org.apache.commons.lang3.StringUtils;
@Data

public class DictionaryDto {
    private String id;
    private String value;
    private String key;
    private String type;
    private Byte ordering;

    public Dictionary toModel(DictionaryDto dictionaryDto) {
        Dictionary dictionary=new Dictionary();
        if (StringUtils.isNotEmpty(dictionaryDto.getId())){
            dictionary.setId(Long.valueOf(dictionaryDto.getId()));
        }
        if (StringUtils.isNotEmpty(dictionaryDto.getValue())){
            dictionary.setValue(dictionaryDto.getValue());
        }
        if(StringUtils.isNotEmpty(dictionaryDto.getKey())){
            dictionary.setKey(dictionaryDto.getKey());
        }
        if (StringUtils.isNotEmpty(dictionaryDto.getType())) {
            dictionary.setType(dictionaryDto.getType());
        }
        if (dictionaryDto.getOrdering()!=null) {
            dictionary.setOrdering(Byte.valueOf(ordering));
        }
        return dictionary;
    }
}
