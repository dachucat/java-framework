package course.linkflower.link.oneframework.service.Impl;

import course.linkflower.link.oneframework.common.dto.PageDto;
import course.linkflower.link.oneframework.common.dto.base.IdDto;
import course.linkflower.link.oneframework.common.model.PageResult;
import course.linkflower.link.oneframework.common.model.Result;
import course.linkflower.link.oneframework.dao.UsedCarPhotoMapper;
import course.linkflower.link.oneframework.dto.usedcarphoto.UsedCarPhotoDto;
import course.linkflower.link.oneframework.dto.usedcarphoto.UsedCarPhotoNoIdDto;
import course.linkflower.link.oneframework.model.UsedCarPhoto;
import course.linkflower.link.oneframework.service.UsedCarPhotoService;
import course.linkflower.link.oneframework.vo.usedcarphoto.UsedCarPhotoShowVo;
import course.linkflower.link.oneframework.vo.usedcarphoto.UsedCarPhotoVo;
import jdk.internal.dynalink.linker.LinkerServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Objects;

@Service
public class UsedCarPhotoServiceImpl implements UsedCarPhotoService {
    @Autowired
    private UsedCarPhotoMapper usedCarPhotoMapper;

    @Override
    public Result<UsedCarPhotoVo> add(UsedCarPhotoNoIdDto usedCarPhotoNoIdDto) {
        if (usedCarPhotoNoIdDto.getOrdering()==null){
            Byte aByte =usedCarPhotoMapper.lastOrderingByUsedCarId(Long.valueOf(usedCarPhotoNoIdDto.getUsedCarId()));
            if (aByte==null){
                aByte=0;
            }
            usedCarPhotoNoIdDto.setOrdering((byte) (aByte+1));
        }
        UsedCarPhoto usedCarPhoto=usedCarPhotoNoIdDto.toModel(usedCarPhotoNoIdDto);
        usedCarPhotoMapper.add(usedCarPhoto);
        return Result.succeed(new UsedCarPhotoVo().loadFrom(usedCarPhoto));
    }

    @Override
    public Result<UsedCarPhotoVo> updateById(UsedCarPhotoDto usedCarPhotoDto) {
        UsedCarPhoto usedCarPhoto=usedCarPhotoDto.toModel(usedCarPhotoDto);
        usedCarPhotoMapper.updateById(usedCarPhoto);
        return Result.succeed(new UsedCarPhotoVo().loadFrom(usedCarPhoto));
    }

    @Override
    public Result deleteById(IdDto idDto) {
        usedCarPhotoMapper.deleteById(Long.parseLong(idDto.getId()));
        return Result.succeed();
    }

    @Override
    public Result<List<UsedCarPhotoVo>> listPhotoByUsedCarId(IdDto idDto) {
        return Result.succeed(usedCarPhotoMapper.listPhotoByUsedCarId(Long.parseLong(idDto.getId())));
    }

    @Override
    public PageResult<UsedCarPhotoShowVo> search(PageDto pageDto) {
        List<UsedCarPhotoShowVo> usedCarPhotoShowVos=usedCarPhotoMapper.search(pageDto.getPageSize()*(pageDto.getPage()-1),pageDto.getPageSize());
        PageResult<UsedCarPhotoShowVo> pageResult=new PageResult<>(usedCarPhotoMapper.countAll(),0,usedCarPhotoShowVos);
        return pageResult;
    }
}
