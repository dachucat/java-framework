package course.linkflower.link.oneframework.house.controller;

import course.linkflower.link.oneframework.common.model.Result;
import course.linkflower.link.oneframework.house.dto.housedevice.AddHouseDeviceDto;
import course.linkflower.link.oneframework.house.dto.housedevice.DeleteHouseDeviceDto;
import course.linkflower.link.oneframework.house.dto.housedevice.SearchHouseDeviceDto;
import course.linkflower.link.oneframework.house.dto.housedevice.UpdateHouseDeviceDto;
import course.linkflower.link.oneframework.house.service.HouseDeviceService;
import course.linkflower.link.oneframework.house.vo.housedevice.HouseDeviceVo;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@Slf4j
@RequestMapping("/housedevice")
@RefreshScope
public class HouseDeviceController {
    @Autowired
    HouseDeviceService houseDeviceService;

    @PostMapping("/add")
    public Result<HouseDeviceVo> add(@RequestBody AddHouseDeviceDto addHouseDeviceDto) {
        return houseDeviceService.addHouseDevice(addHouseDeviceDto);
    }

    @PostMapping("/delete")
    public Result delete(@RequestBody DeleteHouseDeviceDto deleteHouseDeviceDto) {
        return houseDeviceService.deleteHouseDevice(deleteHouseDeviceDto);
    }

    @PostMapping("/update")
    public Result<HouseDeviceVo> update(@RequestBody UpdateHouseDeviceDto updateHouseDeviceDto) {
        return houseDeviceService.updateHouseDevice(updateHouseDeviceDto);
    }

    @PostMapping("/search")
    public Result<HouseDeviceVo> search(@RequestBody SearchHouseDeviceDto searchHouseDeviceDto) {
        return houseDeviceService.getHouseDeviceById(searchHouseDeviceDto);
    }
}
