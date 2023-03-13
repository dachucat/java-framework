package course.linkflower.link.oneframework.service;

import course.linkflower.link.oneframework.common.dto.PageDto;
import course.linkflower.link.oneframework.common.dto.base.IdDto;
import course.linkflower.link.oneframework.common.model.PageResult;
import course.linkflower.link.oneframework.common.model.Result;
import course.linkflower.link.oneframework.dto.usedcar.PostDateDto;
import course.linkflower.link.oneframework.dto.usedcar.UsedCarDto;
import course.linkflower.link.oneframework.dto.usedcar.UsedCarNoIdDto;
import course.linkflower.link.oneframework.vo.usedcar.UsedCarShowVo;
import course.linkflower.link.oneframework.vo.usedcar.UsedCarVo;

import java.util.List;

public interface UsedCarService {

    Result<UsedCarVo> add(UsedCarNoIdDto usedCarNoIdDto);

    Result deleteById(IdDto idDto);

    Result<UsedCarVo> updateById(UsedCarDto usedCarDto);

    Result<UsedCarVo> getUsedCarById(IdDto idDto);

    Result<List<UsedCarVo>> listUsedCarByPostDate(PostDateDto postDateDto);

    PageResult<UsedCarShowVo> search(PageDto pageDto);
}
