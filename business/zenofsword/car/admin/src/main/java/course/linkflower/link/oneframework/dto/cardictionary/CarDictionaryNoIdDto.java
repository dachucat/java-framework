package course.linkflower.link.oneframework.dto.cardictionary;

import course.linkflower.link.oneframework.model.CarDictionary;
import lombok.Data;

@Data
public class CarDictionaryNoIdDto {
    private String value;
    private String key;
    private String type;
    private String ordering;

    public CarDictionary toModel(CarDictionaryNoIdDto carDictionaryNoIdDto) {
        CarDictionary carDictionary=new CarDictionary();
        carDictionary.setValue(carDictionaryNoIdDto.getValue());
        carDictionary.setKey(carDictionaryNoIdDto.getKey());
        carDictionary.setType(carDictionaryNoIdDto.getType());
        carDictionary.setOrdering(Long.valueOf(ordering));
        return carDictionary;
    }
}
