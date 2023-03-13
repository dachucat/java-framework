package course.linkflower.link.oneframework.service.Impl;

import course.linkflower.link.oneframework.common.constant.BaseErrorContst;
import course.linkflower.link.oneframework.common.dto.PageDto;
import course.linkflower.link.oneframework.common.dto.base.IdDto;
import course.linkflower.link.oneframework.common.model.PageResult;
import course.linkflower.link.oneframework.common.model.Result;
import course.linkflower.link.oneframework.dao.UsedCarAttribMapper;
import course.linkflower.link.oneframework.dto.usedcarattrib.UsedCarAttribDto;
import course.linkflower.link.oneframework.dto.usedcarattrib.UsedCarAttribNoIdDto;
import course.linkflower.link.oneframework.model.UsedCarAttrib;
import course.linkflower.link.oneframework.service.UsedCarAttribService;
import course.linkflower.link.oneframework.vo.usedcarattrib.UsedCarAttribVo;
import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class UsedCarAttribServiceImpl implements UsedCarAttribService {
    @Autowired
    private UsedCarAttribMapper usedCarAttribMapper;
    @Override
    public Result<UsedCarAttribVo> add(UsedCarAttribNoIdDto usedCarAttribNoIdDto) {
        if (StringUtils.isNotEmpty(usedCarAttribNoIdDto.getValue())) {
            if (usedCarAttribMapper.countUsedCarIdAttribKeyValue(Long.parseLong(usedCarAttribNoIdDto.getUsedCarId()),
                    usedCarAttribNoIdDto.getAttribKey(), Long.parseLong(usedCarAttribNoIdDto.getValue())) != 0) {
                return Result.of(null, BaseErrorContst.BaseErrorTimeParamDuplicateError,
                        String.format(BaseErrorContst.BaseMsgTimeParamsDuplicateError + "usedCarId与attribKey与value建立了唯一索引，该索引的参数重复"));
            }
        }else {
            if (usedCarAttribMapper.countUsedCarIdAttribKey(Long.parseLong(usedCarAttribNoIdDto.getUsedCarId()),
                    usedCarAttribNoIdDto.getAttribKey()) != 0) {
                return Result.of(null, BaseErrorContst.BaseErrorTimeParamDuplicateError,
                        String.format(BaseErrorContst.BaseMsgTimeParamsDuplicateError + "usedCarId与attribKey与value建立了唯一索引，该索引的参数重复"));
            }
        }
        UsedCarAttrib usedCarAttrib=usedCarAttribNoIdDto.toModel();
        usedCarAttribMapper.add(usedCarAttrib);
        return Result.succeed(usedCarAttribMapper.getUsedCarAttribById(usedCarAttrib.getId()));
    }

    @Override
    public Result<UsedCarAttribVo> getCarAttribById(IdDto idDto) {
        return Result.succeed(usedCarAttribMapper.getUsedCarAttribById(Long.parseLong(idDto.getId())));
    }

    @Override
    public PageResult<UsedCarAttribVo> search(PageDto pageDto) {
        List<UsedCarAttribVo> usedCarAttribVos=usedCarAttribMapper.search(pageDto.getPageSize()*(pageDto.getPage()-1),pageDto.getPageSize());
        PageResult<UsedCarAttribVo> pageResult = new PageResult<>();
        pageResult.setData(usedCarAttribVos);
        pageResult.setCount(usedCarAttribMapper.countAll());
        return pageResult;
    }

    @Override
    public Result<UsedCarAttribVo> updateById(UsedCarAttribDto usedCarAttribDto) {
        if (StringUtils.isNotEmpty(usedCarAttribDto.getValue())) {
            if (usedCarAttribMapper.countUsedCarIdAttribKeyValueDiffId(Long.parseLong(usedCarAttribDto.getUsedCarId()),
                    usedCarAttribDto.getAttribKey(), Long.parseLong(usedCarAttribDto.getValue()),
                    Long.parseLong(usedCarAttribDto.getId())) != 0) {
                return Result.of(null, BaseErrorContst.BaseErrorTimeParamDuplicateError,
                        String.format(BaseErrorContst.BaseMsgTimeParamsDuplicateError + "usedCarId与attribKey与value建立了唯一索引，该索引的参数重复"));
            }
        }else {
                if (usedCarAttribMapper.countUsedCarIdAttribKeyDiffId(Long.parseLong(usedCarAttribDto.getUsedCarId()),
                        usedCarAttribDto.getAttribKey(),Long.valueOf(usedCarAttribDto.getId())) != 0) {
                    return Result.of(null, BaseErrorContst.BaseErrorTimeParamDuplicateError,
                            String.format(BaseErrorContst.BaseMsgTimeParamsDuplicateError + "usedCarId与attribKey与value建立了唯一索引，该索引的参数重复"));
                }
        }
        UsedCarAttrib usedCarAttrib=usedCarAttribDto.toModel();
        usedCarAttribMapper.updateById(usedCarAttrib);
        return Result.succeed(usedCarAttribMapper.getUsedCarAttribById(usedCarAttrib.getId()));
    }

    @Override
    public Result deleteById(IdDto idDto) {
        usedCarAttribMapper.deleteById(Long.parseLong(idDto.getId()));
        return Result.succeed();
    }
}
