package course.linkflower.link.oneframework.controller;

import course.linkflower.link.oneframework.common.dto.base.IdDto;
import course.linkflower.link.oneframework.common.dto.base.TypeDto;
import course.linkflower.link.oneframework.common.model.Result;
import course.linkflower.link.oneframework.dto.dictionary.DictionaryDto;
import course.linkflower.link.oneframework.dto.dictionary.DictionaryNoIdDto;
import course.linkflower.link.oneframework.service.DictionaryService;
import course.linkflower.link.oneframework.vo.dictionary.DictionaryVo;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
@RestController
@Slf4j
@RequestMapping("/dictionary")
@RefreshScope
public class DictionaryController {
    @Autowired
    private DictionaryService dictionaryService;
    @PostMapping("/add")
    public Result<DictionaryVo> add(@RequestBody DictionaryNoIdDto dictionaryNoIdDto){
        return dictionaryService.add(dictionaryNoIdDto);
    }

    @PostMapping("/deleteById")
    public Result deleteById(@RequestBody IdDto idDto){
        return dictionaryService.deleteById(idDto);
    }

    @PostMapping("/update")
    public Result<DictionaryVo> update(@RequestBody DictionaryDto dictionaryDto){
        return dictionaryService.update(dictionaryDto);
    }

    @PostMapping("/listKeyByType")
    public Result<List<DictionaryVo>> listKeyByType(@RequestBody TypeDto typeDto){
        return dictionaryService.listKeyByType(typeDto);
    }
}
