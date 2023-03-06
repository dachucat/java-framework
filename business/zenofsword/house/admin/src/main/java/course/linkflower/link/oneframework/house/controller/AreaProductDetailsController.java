package course.linkflower.link.oneframework.house.controller;

import course.linkflower.link.oneframework.common.model.Result;
import course.linkflower.link.oneframework.house.dto.areainfo.AddAreaInfoDto;
import course.linkflower.link.oneframework.house.dto.areainfo.DeleteAreaInfoDto;
import course.linkflower.link.oneframework.house.dto.areainfo.SearchAreaInfoDto;
import course.linkflower.link.oneframework.house.dto.areainfo.UpdateAreaInfoDto;
import course.linkflower.link.oneframework.house.dto.areaproductdetails.AddAreaProductDetailsDto;
import course.linkflower.link.oneframework.house.dto.areaproductdetails.DeleteAreaProductDetailsDto;
import course.linkflower.link.oneframework.house.dto.areaproductdetails.SearchAreaProductDetailsDto;
import course.linkflower.link.oneframework.house.dto.areaproductdetails.UpdateAreaProductDetailsDto;
import course.linkflower.link.oneframework.house.service.AreaProductDetailsService;
import course.linkflower.link.oneframework.house.vo.areainfo.AreaInfoVo;
import course.linkflower.link.oneframework.house.vo.areaproductdetails.AreaProductDetailsVo;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@Slf4j
@RequestMapping("/areadetails")
@RefreshScope
public class AreaProductDetailsController {
    @Autowired
    AreaProductDetailsService areaProductDetailsService;
    @PostMapping("/add")
    public Result<AreaProductDetailsVo> add(@RequestBody AddAreaProductDetailsDto addAreaProductDetailsDto) {
        return areaProductDetailsService.addAreaProductDetails(addAreaProductDetailsDto);
    }

    @PostMapping("/delete")
    public Result delete(@RequestBody DeleteAreaProductDetailsDto deleteAreaProductDetailsDto) {
        return areaProductDetailsService.deleteAreaProductDetails(deleteAreaProductDetailsDto);
    }

    @PostMapping("/update")
    public Result<AreaProductDetailsVo> update(@RequestBody UpdateAreaProductDetailsDto updateAreaProductDetailsDto) {
        return areaProductDetailsService.updateAreaProductDetails(updateAreaProductDetailsDto);
    }

    @PostMapping("/search")
    public Result<AreaProductDetailsVo> search(@RequestBody SearchAreaProductDetailsDto searchAreaProductDetailsDto) {
        return areaProductDetailsService.getAreaProductDetailsById(searchAreaProductDetailsDto);
    }
}
