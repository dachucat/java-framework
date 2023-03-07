package course.linkflower.link.oneframework.house.controller;

import course.linkflower.link.oneframework.common.model.Result;
import course.linkflower.link.oneframework.house.dto.househighlightinfo.AddHouseHightlightInfoDto;
import course.linkflower.link.oneframework.house.dto.househighlightinfo.DeleteHouseHightlightInfoDto;
import course.linkflower.link.oneframework.house.dto.househighlightinfo.SearchHouseHightlightInfoDto;
import course.linkflower.link.oneframework.house.dto.househighlightinfo.UpdateHouseHightlightInfoDto;
import course.linkflower.link.oneframework.house.service.HouseHightlightInfoService;
import course.linkflower.link.oneframework.house.vo.househightlightinfo.HouseHightlightInfoVo;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@Slf4j
@RequestMapping("/househighlightinfo")
@RefreshScope
public class HouseHightlightInfoController {
    @Autowired
    HouseHightlightInfoService houseHightlightInfoService;

    @PostMapping("/add")
    public Result<HouseHightlightInfoVo> add(@RequestBody AddHouseHightlightInfoDto addHouseHightlightInfoDto) {
        return houseHightlightInfoService.addHouseHightlightInfo(addHouseHightlightInfoDto);
    }

    @PostMapping("/delete")
    public Result delete(@RequestBody DeleteHouseHightlightInfoDto deleteHouseHightlightInfoDto) {
        return houseHightlightInfoService.deleteHouseHightlightInfo(deleteHouseHightlightInfoDto);
    }

    @PostMapping("/update")
    public Result<HouseHightlightInfoVo> update(@RequestBody UpdateHouseHightlightInfoDto updateHouseHightlightInfoDto) {
        return houseHightlightInfoService.updateHouseHightlightInfo(updateHouseHightlightInfoDto);
    }

    @PostMapping("/search")
    public Result<HouseHightlightInfoVo> search(@RequestBody SearchHouseHightlightInfoDto searchHouseHightlightInfoDto) {
        return houseHightlightInfoService.getHouseHightlightInfoById(searchHouseHightlightInfoDto);
    }
}
