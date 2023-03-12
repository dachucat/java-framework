package course.linkflower.link.oneframework.service;

import course.linkflower.link.oneframework.common.dto.PageDto;
import course.linkflower.link.oneframework.common.dto.base.IdDto;
import course.linkflower.link.oneframework.common.dto.base.TypeDto;
import course.linkflower.link.oneframework.common.model.PageResult;
import course.linkflower.link.oneframework.common.model.Result;
import course.linkflower.link.oneframework.dto.dictionary.DictionaryDto;
import course.linkflower.link.oneframework.dto.dictionary.DictionaryNoIdDto;
import course.linkflower.link.oneframework.vo.dictionary.DictionaryShowVo;
import course.linkflower.link.oneframework.vo.dictionary.DictionaryVo;

import java.util.List;

public interface DictionaryService {
    Result<DictionaryVo> add(DictionaryNoIdDto dictionaryNoIdDto);

    Result deleteById(IdDto idDto);

    Result<DictionaryVo> update(DictionaryDto dictionaryDto);

    Result<List<DictionaryVo>> listDictionaryByType(TypeDto typeDto);

    PageResult<DictionaryShowVo> search(PageDto pageDto);
}
