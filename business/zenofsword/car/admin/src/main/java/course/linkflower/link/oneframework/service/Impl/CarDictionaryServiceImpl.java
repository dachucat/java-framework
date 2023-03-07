package course.linkflower.link.oneframework.service.Impl;

import course.linkflower.link.oneframework.common.constant.BaseErrorContst;
import course.linkflower.link.oneframework.common.model.Result;
import course.linkflower.link.oneframework.dao.CarDictionaryMapper;
import course.linkflower.link.oneframework.dto.cardictionary.CarDictionaryNoIdDto;
import course.linkflower.link.oneframework.model.CarDictionary;
import course.linkflower.link.oneframework.service.CarDictionaryService;
import course.linkflower.link.oneframework.vo.CarDictionary.CarDictionaryVo;
import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CarDictionaryServiceImpl implements CarDictionaryService {
    @Autowired
    private CarDictionaryMapper carDictionaryMapper;
    @Override
    public Result<CarDictionaryVo> add(CarDictionaryNoIdDto carDictionaryNoIdDto) {
        if (carDictionaryMapper.countTypeValue(carDictionaryNoIdDto.getType(), carDictionaryNoIdDto.getValue()) != 0) {
            return Result.of(null, BaseErrorContst.BaseErrorTimeParamDuplicateError,
                    String.format(BaseErrorContst.BaseMsgTimeParamsDuplicateError, "type and value"));
        }
        if (StringUtils.isEmpty(carDictionaryNoIdDto.getOrdering())) {
            Integer integer=carDictionaryMapper.lastOrderingByType(carDictionaryNoIdDto.getType());
            if (integer == null){
                integer=0;
            }
                carDictionaryNoIdDto.setOrdering(String.valueOf(integer+1));
        }
        CarDictionary carDictionary = carDictionaryNoIdDto.toModel(carDictionaryNoIdDto);
        carDictionaryMapper.add(carDictionary);
        return Result.succeed(carDictionaryMapper.getCarDictById(carDictionary.getId()));
    }
}
