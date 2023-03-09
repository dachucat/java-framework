package course.linkflower.link.oneframework.service;

import course.linkflower.link.oneframework.common.dto.base.IdDto;
import course.linkflower.link.oneframework.common.dto.base.TypeDto;
import course.linkflower.link.oneframework.common.model.Result;
import course.linkflower.link.oneframework.dto.cardictionary.CarDictionaryDto;
import course.linkflower.link.oneframework.dto.cardictionary.CarDictionaryNoIdDto;
import course.linkflower.link.oneframework.vo.CarDictionary.CarDictionaryVo;

import java.util.List;

public interface CarDictionaryService {
    Result<CarDictionaryVo> add(CarDictionaryNoIdDto carDictionaryNoIdDto);

    Result deleteById(IdDto idDto);

    Result<CarDictionaryVo> update(CarDictionaryDto carDictionaryDto);

    Result<List<CarDictionaryVo>> listCarDictionaryByType(TypeDto typeDto);
}
