package course.linkflower.link.oneframework.house.controller;

import course.linkflower.link.oneframework.common.model.Result;
import course.linkflower.link.oneframework.house.dto.areainfo.AddAreaInfoDto;
import course.linkflower.link.oneframework.house.dto.areainfo.DeleteAreaInfoDto;
import course.linkflower.link.oneframework.house.dto.areainfo.SearchAreaInfoDto;
import course.linkflower.link.oneframework.house.dto.areainfo.UpdateAreaInfoDto;
import course.linkflower.link.oneframework.house.service.AreaInfoService;
import course.linkflower.link.oneframework.house.vo.areainfo.AreaInfoVo;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@Slf4j
@RequestMapping("/areainfo")
@RefreshScope
public class AreaInfoController {
    @Autowired
    AreaInfoService areaInfoService;

    @PostMapping("/add")
    public Result<AreaInfoVo> add(@RequestBody AddAreaInfoDto addAreaInfoDto) {

        return areaInfoService.addAreaInfo(addAreaInfoDto);
    }

    @PostMapping("/delete")
    public Result delete(@RequestBody DeleteAreaInfoDto deleteAreaInfoDto) {
        return areaInfoService.deleteAreaInfo(deleteAreaInfoDto);
    }

    @PostMapping("/update")
    public Result<AreaInfoVo> update(@RequestBody UpdateAreaInfoDto updateAreaInfoDto) {
        return areaInfoService.updateAreaInfo(updateAreaInfoDto);
    }

    @PostMapping("/search")
    public Result<AreaInfoVo> search(@RequestBody SearchAreaInfoDto searchAreaInfoDto) {
        return areaInfoService.getAreaInfoById(searchAreaInfoDto);
    }
}
