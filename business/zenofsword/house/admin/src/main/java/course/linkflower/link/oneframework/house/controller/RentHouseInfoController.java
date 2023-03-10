package course.linkflower.link.oneframework.house.controller;

import course.linkflower.link.oneframework.common.model.Result;
import course.linkflower.link.oneframework.house.dto.menu.AddMenuDto;
import course.linkflower.link.oneframework.house.dto.menu.DeleteMenuDto;
import course.linkflower.link.oneframework.house.dto.menu.SearchMenuDto;
import course.linkflower.link.oneframework.house.dto.menu.UpdateMenuDto;
import course.linkflower.link.oneframework.house.dto.renthouseinfo.AddRentHouseInfoDto;
import course.linkflower.link.oneframework.house.dto.renthouseinfo.DeleteRentHouseInfoDto;
import course.linkflower.link.oneframework.house.dto.renthouseinfo.SearchRentHouseInfoDto;
import course.linkflower.link.oneframework.house.dto.renthouseinfo.UpdateRentHouseInfoDto;
import course.linkflower.link.oneframework.house.service.RentHouseInfoService;
import course.linkflower.link.oneframework.house.vo.menu.MenuVo;
import course.linkflower.link.oneframework.house.vo.renthouseinfo.RentHouseInfoVo;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@Slf4j
@RequestMapping("/renthouse")
@RefreshScope
public class RentHouseInfoController {
    @Autowired
    RentHouseInfoService rentHouseInfoService;
    @PostMapping("/add")
    public Result<RentHouseInfoVo> add(@RequestBody AddRentHouseInfoDto addRentHouseInfoDto) {
        return rentHouseInfoService.addRentHouseInfo(addRentHouseInfoDto);
    }

    @PostMapping("/delete")
    public Result delete(@RequestBody DeleteRentHouseInfoDto deleteRentHouseInfoDto) {
        return rentHouseInfoService.deleteRentHouseInfo(deleteRentHouseInfoDto);
    }

    @PostMapping("/update")
    public Result<RentHouseInfoVo> update(@RequestBody UpdateRentHouseInfoDto updateRentHouseInfoDto) {
        return rentHouseInfoService.updateRentHouseInfo(updateRentHouseInfoDto);
    }

    @PostMapping("/search")
    public Result<RentHouseInfoVo> search(@RequestBody SearchRentHouseInfoDto searchRentHouseInfoDto) {
        return rentHouseInfoService.getRentHouseInfoById(searchRentHouseInfoDto);
    }
}
