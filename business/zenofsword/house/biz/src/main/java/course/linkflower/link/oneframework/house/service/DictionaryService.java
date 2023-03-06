package course.linkflower.link.oneframework.house.service;

import course.linkflower.link.oneframework.common.model.Result;
import course.linkflower.link.oneframework.house.dto.dictionary.AddDictionaryDto;
import course.linkflower.link.oneframework.house.dto.dictionary.DeleteDicitionaryDto;
import course.linkflower.link.oneframework.house.dto.dictionary.SearchDicitionaryDto;
import course.linkflower.link.oneframework.house.dto.dictionary.UpdateDicitionaryDto;
import course.linkflower.link.oneframework.house.dto.renthouseinfo.AddRentHouseInfoDto;
import course.linkflower.link.oneframework.house.dto.renthouseinfo.DeleteRentHouseInfoDto;
import course.linkflower.link.oneframework.house.dto.renthouseinfo.SearchRentHouseInfoDto;
import course.linkflower.link.oneframework.house.dto.renthouseinfo.UpdateRentHouseInfoDto;
import course.linkflower.link.oneframework.house.vo.dictionary.DictionaryVo;
import course.linkflower.link.oneframework.house.vo.renthouseinfo.RentHouseInfoVo;

public interface DictionaryService {

    Result<DictionaryVo> addDictionary(AddDictionaryDto addDictionaryDto);
    Result deleteDictionary(DeleteDicitionaryDto deleteDicitionaryDto);
    Result<DictionaryVo> updateDictionary(UpdateDicitionaryDto updateDicitionaryDto);
    Result<DictionaryVo> getDictionaryById(SearchDicitionaryDto searchDicitionaryDto);
}
