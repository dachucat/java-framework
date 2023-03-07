package course.linkflower.link.oneframework.house.controller;

import course.linkflower.link.oneframework.common.model.Result;
import course.linkflower.link.oneframework.house.dto.househightlight.AddHouseHighlightDto;
import course.linkflower.link.oneframework.house.dto.househightlight.DeleteHouseHighlightDto;
import course.linkflower.link.oneframework.house.dto.househightlight.SearchHouseHighlightDto;
import course.linkflower.link.oneframework.house.dto.househightlight.UpdateHouseHighlightDto;
import course.linkflower.link.oneframework.house.service.HouseHighlightService;
import course.linkflower.link.oneframework.house.vo.househighlight.HouseHighlightVo;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@Slf4j
@RequestMapping("/househighlight")
@RefreshScope
public class HouseHighlightController {
    @Autowired
    HouseHighlightService houseHighlightService;

    @PostMapping("/add")
    public Result<HouseHighlightVo> add(@RequestBody AddHouseHighlightDto addHouseHighlightDto) {
        return houseHighlightService.addHouseHighlight(addHouseHighlightDto);
    }

    @PostMapping("/delete")
    public Result delete(@RequestBody DeleteHouseHighlightDto deleteHouseHighlightDto) {
        return houseHighlightService.deleteHouseHighlight(deleteHouseHighlightDto);
    }

    @PostMapping("/update")
    public Result<HouseHighlightVo> update(@RequestBody UpdateHouseHighlightDto updateHouseHighlightDto) {
        return houseHighlightService.updateHouseHighlight(updateHouseHighlightDto);
    }

    @PostMapping("/search")
    public Result<HouseHighlightVo> search(@RequestBody SearchHouseHighlightDto searchHouseHighlightDto) {
        return houseHighlightService.getHouseHighlight(searchHouseHighlightDto);
    }
}
