package course.linkflower.link.oneframework.service;

import course.linkflower.link.oneframework.common.model.Result;
import course.linkflower.link.oneframework.dto.cardictionary.CarDictionaryNoIdDto;
import course.linkflower.link.oneframework.vo.CarDictionary.CarDictionaryVo;

public interface CarDictionaryService {
    Result<CarDictionaryVo> add(CarDictionaryNoIdDto carDictionaryNoIdDto);
}
