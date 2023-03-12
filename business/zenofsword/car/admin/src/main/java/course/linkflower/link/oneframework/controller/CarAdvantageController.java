package course.linkflower.link.oneframework.controller;

import course.linkflower.link.oneframework.common.constant.ApisConstant;
import course.linkflower.link.oneframework.common.dto.PageDto;
import course.linkflower.link.oneframework.common.dto.base.IdDto;
import course.linkflower.link.oneframework.common.model.PageResult;
import course.linkflower.link.oneframework.common.model.Result;
import course.linkflower.link.oneframework.dto.caradvantage.CarAdvantageDto;
import course.linkflower.link.oneframework.dto.caradvantage.CarAdvantageNoIdDto;
import course.linkflower.link.oneframework.model.CarAdvantage;
import course.linkflower.link.oneframework.service.CarAdvantageService;
import course.linkflower.link.oneframework.vo.caradvantage.CarAdvantageShowVo;
import course.linkflower.link.oneframework.vo.caradvantage.CarAdvantageVo;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.security.core.parameters.P;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@Slf4j
@RequestMapping(ApisConstant.ApiV1+"/Caradvantage")
@RefreshScope
public class     CarAdvantageController {
    @Autowired
    private CarAdvantageService carAdvantageService;
    @PostMapping("/add")
    public Result<CarAdvantageVo> add(@RequestBody CarAdvantageNoIdDto carAdvantageNoIdDto){
        return carAdvantageService.add(carAdvantageNoIdDto);
    }

    @PostMapping("/getcaradvantagebyId")
    public Result<CarAdvantageVo> getCarAdvantageById(@RequestBody IdDto idDto){
        return carAdvantageService.getCarAdvantageById(idDto);
    }

    @PostMapping("/deletebyid")
    public Result deleteById(@RequestBody IdDto idDto){
        return carAdvantageService.deleteById(idDto);
    }

    @PostMapping("/updatebyid")
    public Result<CarAdvantageVo> updateById(@RequestBody CarAdvantageDto carAdvantageDto){
        return carAdvantageService.updateById(carAdvantageDto);
    }

    @PostMapping("/search")
    public Result<PageResult<CarAdvantageShowVo>> search(PageDto pageDto){
        return carAdvantageService.search(pageDto);
    }
}
