package course.linkflower.link.oneframework.dto.cardictionary;

import course.linkflower.link.oneframework.model.CarDictionary;
import lombok.Data;
import org.apache.commons.lang3.StringUtils;

@Data
public class CarDictionaryNoIdDto {
    private String value;
    private String key;
    private String type;
    private String ordering;

    public CarDictionary toModel(CarDictionaryNoIdDto carDictionaryNoIdDto) {
        CarDictionary carDictionary=new CarDictionary();
        if (StringUtils.isNotEmpty(carDictionaryNoIdDto.getValue())){
            carDictionary.setValue(carDictionaryNoIdDto.getValue());
        }
        if(StringUtils.isNotEmpty(carDictionaryNoIdDto.getKey())){
            carDictionary.setKey(carDictionaryNoIdDto.getKey());
        }
        if (StringUtils.isNotEmpty(carDictionaryNoIdDto.getType())) {
            carDictionary.setType(carDictionaryNoIdDto.getType());
        }
        if (StringUtils.isNotEmpty(carDictionaryNoIdDto.getOrdering())) {
            carDictionary.setOrdering(Long.valueOf(ordering));
        }
        return carDictionary;
    }
}
