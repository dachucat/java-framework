package course.linkflower.link.oneframework.house.controller;

import course.linkflower.link.oneframework.common.model.Result;
import course.linkflower.link.oneframework.house.dto.dictionary.AddDictionaryDto;
import course.linkflower.link.oneframework.house.dto.dictionary.DeleteDicitionaryDto;
import course.linkflower.link.oneframework.house.dto.dictionary.SearchDicitionaryDto;
import course.linkflower.link.oneframework.house.dto.dictionary.UpdateDicitionaryDto;
import course.linkflower.link.oneframework.house.dto.renthouseinfo.AddRentHouseInfoDto;
import course.linkflower.link.oneframework.house.dto.renthouseinfo.DeleteRentHouseInfoDto;
import course.linkflower.link.oneframework.house.dto.renthouseinfo.SearchRentHouseInfoDto;
import course.linkflower.link.oneframework.house.dto.renthouseinfo.UpdateRentHouseInfoDto;
import course.linkflower.link.oneframework.house.service.DictionaryService;
import course.linkflower.link.oneframework.house.service.RentHouseInfoService;
import course.linkflower.link.oneframework.house.vo.dictionary.DictionaryVo;
import course.linkflower.link.oneframework.house.vo.renthouseinfo.RentHouseInfoVo;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@Slf4j
@RequestMapping("/dictionary")
@RefreshScope
public class DictionaryController {
    @Autowired
    DictionaryService dictionaryService;
    @PostMapping("/add")
    public Result<DictionaryVo> add(@RequestBody AddDictionaryDto addDictionaryDto) {
        return dictionaryService.addDictionary(addDictionaryDto);
    }

    @PostMapping("/delete")
    public Result delete(@RequestBody DeleteDicitionaryDto deleteDicitionaryDto) {
        return dictionaryService.deleteDictionary(deleteDicitionaryDto);
    }

    @PostMapping("/update")
    public Result<DictionaryVo> update(@RequestBody UpdateDicitionaryDto updateDicitionaryDto) {
        return dictionaryService.updateDictionary(updateDicitionaryDto);
    }

    @PostMapping("/search")
    public Result<DictionaryVo> search(@RequestBody SearchDicitionaryDto searchDicitionaryDto) {
        return dictionaryService.getDictionaryById(searchDicitionaryDto);
    }
}
