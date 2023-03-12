package course.linkflower.link.oneframework.controller;

import course.linkflower.link.oneframework.common.constant.ApisConstant;
import course.linkflower.link.oneframework.common.dto.PageDto;
import course.linkflower.link.oneframework.common.dto.base.IdDto;
import course.linkflower.link.oneframework.common.dto.base.TypeDto;
import course.linkflower.link.oneframework.common.model.PageResult;
import course.linkflower.link.oneframework.common.model.Result;
import course.linkflower.link.oneframework.dto.cardictionary.CarDictionaryDto;
import course.linkflower.link.oneframework.dto.cardictionary.CarDictionaryNoIdDto;
import course.linkflower.link.oneframework.service.CarDictionaryService;
import course.linkflower.link.oneframework.vo.CarDictionary.CarDictionaryShowVo;
import course.linkflower.link.oneframework.vo.CarDictionary.CarDictionaryVo;
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
@RequestMapping(ApisConstant.ApiV1+"/cardictionary")
@RefreshScope
public class CarDictionaryController {
    @Autowired
    private CarDictionaryService carDictionaryService;
    @PostMapping("/add")
    public Result<CarDictionaryVo> add(@RequestBody CarDictionaryNoIdDto carDictionaryNoIdDto){
        return carDictionaryService.add(carDictionaryNoIdDto);
    }

    @PostMapping("/deletebyid")
    public Result deleteById(@RequestBody IdDto idDto){
        return carDictionaryService.deleteById(idDto);
    }

    @PostMapping("/update")
    public Result<CarDictionaryVo> update(@RequestBody CarDictionaryDto carDictionaryDto){
        return carDictionaryService.update(carDictionaryDto);
    }

    @PostMapping("/listcardictionarybytype")
    public Result<List<CarDictionaryVo>> listCarDictionaryByType(@RequestBody TypeDto typeDto){
        return carDictionaryService.listCarDictionaryByType(typeDto);
    }

    @PostMapping("/search")
    public PageResult<CarDictionaryShowVo> search(@RequestBody PageDto pageDto){
        return carDictionaryService.search(pageDto);
    }
}
