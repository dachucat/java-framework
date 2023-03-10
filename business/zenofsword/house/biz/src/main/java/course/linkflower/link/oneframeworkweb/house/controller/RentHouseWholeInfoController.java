package course.linkflower.link.oneframeworkweb.house.controller;

import course.linkflower.link.oneframework.common.model.Result;
import course.linkflower.link.oneframeworkweb.house.dto.AddID;
import course.linkflower.link.oneframeworkweb.house.service.RentHouseWholeInfoService;
import course.linkflower.link.oneframeworkweb.house.vo.RentHouseWholeInfoVo;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@Slf4j
@RequestMapping("/housewholeinfo")
@RefreshScope
public class RentHouseWholeInfoController {
    @Autowired
    RentHouseWholeInfoService rentHouseWholeInfoService;

    @PostMapping("/search")
    public Result<RentHouseWholeInfoVo> add(@RequestBody AddID addID) {
        return rentHouseWholeInfoService.loadInfo(addID);
    }
}
