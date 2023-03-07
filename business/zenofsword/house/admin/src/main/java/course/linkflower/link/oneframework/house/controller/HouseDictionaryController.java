package course.linkflower.link.oneframework.house.controller;

import course.linkflower.link.oneframework.common.model.Result;
import course.linkflower.link.oneframework.house.dto.housedictionary.AddHouseDictionaryDto;
import course.linkflower.link.oneframework.house.dto.housedictionary.DeleteHouseDicitionaryDto;
import course.linkflower.link.oneframework.house.dto.housedictionary.SearchHouseDicitionaryDto;
import course.linkflower.link.oneframework.house.dto.housedictionary.UpdateHouseDicitionaryDto;
import course.linkflower.link.oneframework.house.service.HouseDictionaryService;
import course.linkflower.link.oneframework.house.vo.housedictionary.HouseDictionaryVo;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@Slf4j
@RequestMapping("/housedictionary")
@RefreshScope
public class HouseDictionaryController {
    @Autowired
    HouseDictionaryService houseDictionaryService;
    @PostMapping("/add")
    public Result<HouseDictionaryVo> add(@RequestBody AddHouseDictionaryDto addHouseDictionaryDto) {
        return houseDictionaryService.addDictionary(addHouseDictionaryDto);
    }

    @PostMapping("/delete")
    public Result delete(@RequestBody DeleteHouseDicitionaryDto deleteHouseDicitionaryDto) {
        return houseDictionaryService.deleteDictionary(deleteHouseDicitionaryDto);
    }

    @PostMapping("/update")
    public Result<HouseDictionaryVo> update(@RequestBody UpdateHouseDicitionaryDto updateHouseDicitionaryDto) {
        return houseDictionaryService.updateDictionary(updateHouseDicitionaryDto);
    }

    @PostMapping("/search")
    public Result<HouseDictionaryVo> search(@RequestBody SearchHouseDicitionaryDto searchHouseDicitionaryDto) {
        return houseDictionaryService.getDictionaryById(searchHouseDicitionaryDto);
    }
}
