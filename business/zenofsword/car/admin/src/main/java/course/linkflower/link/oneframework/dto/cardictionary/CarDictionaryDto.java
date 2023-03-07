package course.linkflower.link.oneframework.dto.cardictionary;

import course.linkflower.link.oneframework.model.CarDictionary;
import lombok.Data;
import org.apache.commons.lang3.StringUtils;

@Data
public class CarDictionaryDto {
    private String id;
    private String value;
    private String key;
    private String type;
    private String ordering;

    public CarDictionary toModel(CarDictionaryDto carDictionaryDto) {
        CarDictionary carDictionary=new CarDictionary();
        if (StringUtils.isNotEmpty(carDictionaryDto.getId())){
            carDictionary.setId(Long.valueOf(carDictionaryDto.getId()));
        }
        if (StringUtils.isNotEmpty(carDictionaryDto.getValue())){
            carDictionary.setValue(carDictionaryDto.getValue());
        }
        if(StringUtils.isNotEmpty(carDictionaryDto.getKey())){
            carDictionary.setKey(carDictionaryDto.getKey());
        }
        if (StringUtils.isNotEmpty(carDictionaryDto.getType())) {
            carDictionary.setType(carDictionaryDto.getType());
        }
        if (StringUtils.isNotEmpty(carDictionaryDto.getOrdering())) {
            carDictionary.setOrdering(Long.valueOf(ordering));
        }
        return carDictionary;
    }
}
