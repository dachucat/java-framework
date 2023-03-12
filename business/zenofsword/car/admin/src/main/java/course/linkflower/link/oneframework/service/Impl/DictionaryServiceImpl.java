package course.linkflower.link.oneframework.service.Impl;

import course.linkflower.link.oneframework.common.constant.BaseErrorContst;
import course.linkflower.link.oneframework.common.constant.DbConstant;
import course.linkflower.link.oneframework.common.dto.PageDto;
import course.linkflower.link.oneframework.common.dto.base.IdDto;
import course.linkflower.link.oneframework.common.dto.base.TypeDto;
import course.linkflower.link.oneframework.common.model.PageResult;
import course.linkflower.link.oneframework.common.model.Result;
import course.linkflower.link.oneframework.dao.DictionaryMapper;
import course.linkflower.link.oneframework.dto.dictionary.DictionaryDto;
import course.linkflower.link.oneframework.dto.dictionary.DictionaryNoIdDto;
import course.linkflower.link.oneframework.model.Dictionary;
import course.linkflower.link.oneframework.service.DictionaryService;
import course.linkflower.link.oneframework.vo.dictionary.DictionaryShowVo;
import course.linkflower.link.oneframework.vo.dictionary.DictionaryVo;
import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class DictionaryServiceImpl implements DictionaryService {
    @Autowired
    private DictionaryMapper dictionaryMapper;
    @Override
    public Result<DictionaryVo> add(DictionaryNoIdDto dictionaryNoIdDto) {
        if (dictionaryMapper.countTypeValue(dictionaryNoIdDto.getType(), dictionaryNoIdDto.getValue()) != 0) {
            return Result.of(null, BaseErrorContst.BaseErrorTimeParamDuplicateError,
                    String.format(BaseErrorContst.BaseMsgTimeParamsDuplicateError, "type and value"));
        }
        if (dictionaryNoIdDto.getOrdering()==null) {
            Byte aByte=dictionaryMapper.lastOrderingByType(dictionaryNoIdDto.getType());
            if (aByte == null){
                aByte=0;
            }
            dictionaryNoIdDto.setOrdering(Byte.valueOf((byte)(aByte+1)));
        }
        Dictionary dictionary = dictionaryNoIdDto.toModel(dictionaryNoIdDto);
        dictionaryMapper.add(dictionary);
        return Result.succeed(dictionaryMapper.getDictById(dictionary.getId()));
    }

    @Override
    public Result deleteById(IdDto idDto) {
        dictionaryMapper.deleteById(Long.parseLong(idDto.getId()));
        return Result.succeed();
    }

    @Override
    public Result<DictionaryVo> update(DictionaryDto dictionaryDto) {
        if (dictionaryMapper.countTypeValuediffId(dictionaryDto.getType(), dictionaryDto.getValue(), Long.parseLong(dictionaryDto.getId())) != 0) {
            return Result.of(null, BaseErrorContst.BaseErrorTimeParamDuplicateError,
                    String.format(BaseErrorContst.BaseMsgTimeParamsDuplicateError, "type and value"));
        }
        if (dictionaryDto.getOrdering()==null) {
            Byte aByte = dictionaryMapper.lastOrderingByType(dictionaryDto.getType());
            if (aByte == null) {
                aByte = 0;
            }
            dictionaryDto.setOrdering(Byte.valueOf((byte) (aByte + 1)));
        }
        dictionaryMapper.update(dictionaryDto.toModel(dictionaryDto));
        return Result.succeed(dictionaryMapper.getDictById(Long.parseLong(dictionaryDto.getId())));
    }

    @Override
    public PageResult<DictionaryShowVo> search(PageDto pageDto) {
        List<DictionaryShowVo> list=dictionaryMapper.search(pageDto.getPage()*pageDto.getPageSize(),pageDto.getPageSize());
        PageResult<DictionaryShowVo> pageResult=new PageResult<>();
        pageResult.setData(list);
        pageResult.setCount(dictionaryMapper.counAll());
        return pageResult;
    }

    @Override
    public Result<List<DictionaryVo>> listDictionaryByType(TypeDto typeDto) {
        return Result.succeed(dictionaryMapper.listDictionaryByType(typeDto.getType(), DbConstant.DefaultMaxCountLimit));
    }
}
