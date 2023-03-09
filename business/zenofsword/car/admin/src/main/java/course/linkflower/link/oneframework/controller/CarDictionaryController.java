package course.linkflower.link.oneframework.controller;

import course.linkflower.link.oneframework.common.dto.base.IdDto;
import course.linkflower.link.oneframework.common.dto.base.TypeDto;
import course.linkflower.link.oneframework.common.model.Result;
import course.linkflower.link.oneframework.dto.cardictionary.CarDictionaryDto;
import course.linkflower.link.oneframework.dto.cardictionary.CarDictionaryNoIdDto;
import course.linkflower.link.oneframework.service.CarDictionaryService;
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
@RequestMapping("/carDictionary")
@RefreshScope
public class CarDictionaryController {
    @Autowired
    private CarDictionaryService carDictionaryService;
    @PostMapping("/add")
    public Result<CarDictionaryVo> add(@RequestBody CarDictionaryNoIdDto carDictionaryNoIdDto){
        return carDictionaryService.add(carDictionaryNoIdDto);
    }

    @PostMapping("/deleteById")
    public Result deleteById(@RequestBody IdDto idDto){
        return carDictionaryService.deleteById(idDto);
    }

    @PostMapping("/update")
    public Result<CarDictionaryVo> update(@RequestBody CarDictionaryDto carDictionaryDto){
        return carDictionaryService.update(carDictionaryDto);
    }

    @PostMapping("/listCarDictionaryByType")
    public Result<List<CarDictionaryVo>> listCarDictionaryByType(@RequestBody TypeDto typeDto){
        return carDictionaryService.listCarDictionaryByType(typeDto);
    }
}
