package course.linkflower.link.oneframework.service;

import course.linkflower.link.oneframework.common.dto.PageDto;
import course.linkflower.link.oneframework.common.dto.base.IdDto;
import course.linkflower.link.oneframework.common.model.PageResult;
import course.linkflower.link.oneframework.common.model.Result;
import course.linkflower.link.oneframework.dto.usedcarattrib.UsedCarAttribDto;
import course.linkflower.link.oneframework.dto.usedcarattrib.UsedCarAttribNoIdDto;
import course.linkflower.link.oneframework.vo.usedcarattrib.UsedCarAttribVo;

public interface UsedCarAttribService {

    Result<UsedCarAttribVo> add(UsedCarAttribNoIdDto usedCarAttribNoIdDto);

    Result<UsedCarAttribVo> getCarAttribById(IdDto idDto);

    PageResult<UsedCarAttribVo> search(PageDto pageDto);

    Result<UsedCarAttribVo> updateById(UsedCarAttribDto usedCarAttribDto);

    Result deleteById(IdDto idDto);
}
