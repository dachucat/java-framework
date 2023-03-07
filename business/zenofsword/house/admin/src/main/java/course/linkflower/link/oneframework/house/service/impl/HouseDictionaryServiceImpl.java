package course.linkflower.link.oneframework.house.service.impl;
import course.linkflower.link.oneframework.common.constant.BaseErrorContst;
import course.linkflower.link.oneframework.common.model.Result;
import course.linkflower.link.oneframework.house.dao.HouseDictionaryMapper;
import course.linkflower.link.oneframework.house.dto.housedictionary.AddHouseDictionaryDto;
import course.linkflower.link.oneframework.house.dto.housedictionary.DeleteHouseDicitionaryDto;
import course.linkflower.link.oneframework.house.dto.housedictionary.SearchHouseDicitionaryDto;
import course.linkflower.link.oneframework.house.dto.housedictionary.UpdateHouseDicitionaryDto;
import course.linkflower.link.oneframework.house.model.HouseDictionary;
import course.linkflower.link.oneframework.house.service.HouseDictionaryService;
import course.linkflower.link.oneframework.house.vo.housedictionary.HouseDictionaryVo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class HouseDictionaryServiceImpl implements HouseDictionaryService {
    @Autowired
    HouseDictionaryMapper houseDictionaryMapper;

    @Override
    public Result<HouseDictionaryVo> addDictionary(AddHouseDictionaryDto addHouseDictionaryDto) {
       HouseDictionary houseDictionary =  addHouseDictionaryDto.toModel();
       if (houseDictionary.getSortValue() == null) {
           houseDictionary.setSortValue(houseDictionaryMapper.lastSortValueByKey(addHouseDictionaryDto.getKey()) + 1);
       }
       if (houseDictionaryMapper.countByTypeKey(addHouseDictionaryDto.getType(),addHouseDictionaryDto.getKey())!=0){
            return Result.of(null, BaseErrorContst.BaseErrorTimeParamDuplicateError,BaseErrorContst.BaseMsgTimeParamsDuplicateError);
       }
       houseDictionaryMapper.save(houseDictionary);
       return Result.succeed(new HouseDictionaryVo().loadFrom(houseDictionary));
    }

    @Override
    public Result deleteDictionary(DeleteHouseDicitionaryDto deleteHouseDicitionaryDto) {
        houseDictionaryMapper.delete(Long.parseLong(deleteHouseDicitionaryDto.getId()));
        return Result.succeed();
    }

    @Override
    public Result<HouseDictionaryVo> updateDictionary(UpdateHouseDicitionaryDto updateHouseDicitionaryDto) {
        HouseDictionary houseDictionary = updateHouseDicitionaryDto.toModel();
        if (houseDictionary.getSortValue() == null) {
            houseDictionary.setSortValue(houseDictionaryMapper.lastSortValueByKey(updateHouseDicitionaryDto.getKey()) + 1);
        }
        if (houseDictionaryMapper.countByTypeKey(updateHouseDicitionaryDto.getType(),updateHouseDicitionaryDto.getKey())!=0){
            return Result.of(null, BaseErrorContst.BaseErrorTimeParamDuplicateError,BaseErrorContst.BaseMsgTimeParamsDuplicateError);
        }
        houseDictionaryMapper.update(houseDictionary);
        return Result.succeed(new HouseDictionaryVo().loadFrom(houseDictionary));
    }

    @Override
    public Result<HouseDictionaryVo> getDictionaryById(SearchHouseDicitionaryDto searchHouseDicitionaryDto) {
        return Result.succeed(new HouseDictionaryVo().loadFrom(houseDictionaryMapper.getHouseDictionaryById(Long.parseLong(searchHouseDicitionaryDto.getId()))));
    }
}
