package course.linkflower.link.oneframework.controller;

import course.linkflower.link.oneframework.common.constant.ApisConstant;
import course.linkflower.link.oneframework.common.dto.PageDto;
import course.linkflower.link.oneframework.common.dto.base.IdDto;
import course.linkflower.link.oneframework.common.model.PageResult;
import course.linkflower.link.oneframework.common.model.Result;
import course.linkflower.link.oneframework.dto.usedcarattrib.UsedCarAttribDto;
import course.linkflower.link.oneframework.dto.usedcarattrib.UsedCarAttribNoIdDto;
import course.linkflower.link.oneframework.service.UsedCarAttribService;
import course.linkflower.link.oneframework.vo.usedcarattrib.UsedCarAttribVo;
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
@RequestMapping(ApisConstant.ApiV1+"/usedcarattrib")
@RefreshScope
public class UsedCarAttribController {
    @Autowired
    private UsedCarAttribService usedCarAttribService;
    @PostMapping("/add")
    public Result<UsedCarAttribVo> add(@RequestBody UsedCarAttribNoIdDto usedCarAttribNoIdDto){
        return usedCarAttribService.add(usedCarAttribNoIdDto);
    }

    @PostMapping("/deletebyid")
    public Result deleteById(@RequestBody IdDto idDto){
        return usedCarAttribService.deleteById(idDto);
    }

    @PostMapping("/updatebyid")
    public Result<UsedCarAttribVo> updateById(@RequestBody UsedCarAttribDto usedCarAttribDto){
        return usedCarAttribService.updateById(usedCarAttribDto);
    }

    @PostMapping("/search")
    public PageResult<UsedCarAttribVo> search(@RequestBody PageDto pageDto){
        return usedCarAttribService.search(pageDto);
    }

    @PostMapping("/getcarattribbyid")
    public Result<UsedCarAttribVo> getCarAttribById(@RequestBody IdDto idDto){
        return usedCarAttribService.getCarAttribById(idDto);
    }
}
