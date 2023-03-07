package course.linkflower.link.oneframework.house.service;

import course.linkflower.link.oneframework.common.model.Result;
import course.linkflower.link.oneframework.house.dto.housedictionary.AddHouseDictionaryDto;
import course.linkflower.link.oneframework.house.dto.housedictionary.DeleteHouseDicitionaryDto;
import course.linkflower.link.oneframework.house.dto.housedictionary.SearchHouseDicitionaryDto;
import course.linkflower.link.oneframework.house.dto.housedictionary.UpdateHouseDicitionaryDto;
import course.linkflower.link.oneframework.house.vo.housedictionary.HouseDictionaryVo;

public interface HouseDictionaryService {

//    Result<List<HouseDictionaryVo>> listDictionaryByKey(String key);

    Result<HouseDictionaryVo> addDictionary(AddHouseDictionaryDto addHouseDictionaryDto);
    Result deleteDictionary(DeleteHouseDicitionaryDto deleteHouseDicitionaryDto);
    Result<HouseDictionaryVo> updateDictionary(UpdateHouseDicitionaryDto updateHouseDicitionaryDto);
    Result<HouseDictionaryVo> getDictionaryById(SearchHouseDicitionaryDto searchHouseDicitionaryDto);
}
