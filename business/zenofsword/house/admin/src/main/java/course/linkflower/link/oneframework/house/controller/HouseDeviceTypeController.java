package course.linkflower.link.oneframework.house.controller;

import course.linkflower.link.oneframework.common.model.Result;
import course.linkflower.link.oneframework.house.dto.housedevicetype.AddHouseDeviceTypeDto;
import course.linkflower.link.oneframework.house.dto.housedevicetype.DeleteHouseDeviceTypeDto;
import course.linkflower.link.oneframework.house.dto.housedevicetype.SearchHouseDeviceTypeDto;
import course.linkflower.link.oneframework.house.dto.housedevicetype.UpdateHouseDeviceTypeDto;
import course.linkflower.link.oneframework.house.service.HouseDeviceTypeService;
import course.linkflower.link.oneframework.house.vo.housedevicetype.HouseDeviceTypeVo;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@Slf4j
@RequestMapping("/housedevicetype")
@RefreshScope
public class HouseDeviceTypeController {
    @Autowired
    HouseDeviceTypeService houseDeviceTypeService;
    @PostMapping("/add")
    public Result<HouseDeviceTypeVo> add(@RequestBody AddHouseDeviceTypeDto addHouseDeviceTypeDto) {
        return houseDeviceTypeService.addHouseDeviceType(addHouseDeviceTypeDto);
    }

    @PostMapping("/delete")
    public Result delete(@RequestBody DeleteHouseDeviceTypeDto deleteHouseDeviceTypeDto) {
        return houseDeviceTypeService.deleteHouseDeviceType(deleteHouseDeviceTypeDto);
    }

    @PostMapping("/update")
    public Result<HouseDeviceTypeVo> update(@RequestBody UpdateHouseDeviceTypeDto updateHouseDeviceTypeDto) {
        return houseDeviceTypeService.updateHouseDeviceType(updateHouseDeviceTypeDto);
    }

    @PostMapping("/search")
    public Result<HouseDeviceTypeVo> search(@RequestBody SearchHouseDeviceTypeDto searchHouseDeviceTypeDto) {
        return houseDeviceTypeService.getHouseDeviceTypeById(searchHouseDeviceTypeDto);
    }
}
