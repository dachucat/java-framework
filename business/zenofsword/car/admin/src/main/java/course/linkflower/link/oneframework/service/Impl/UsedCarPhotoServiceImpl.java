package course.linkflower.link.oneframework.service.Impl;

import course.linkflower.link.oneframework.common.dto.base.IdDto;
import course.linkflower.link.oneframework.common.model.Result;
import course.linkflower.link.oneframework.dao.UsedCarPhotoMapper;
import course.linkflower.link.oneframework.dto.usedcarphoto.UsedCarPhotoDto;
import course.linkflower.link.oneframework.dto.usedcarphoto.UsedCarPhotoNoIdDto;
import course.linkflower.link.oneframework.model.UsedCarPhoto;
import course.linkflower.link.oneframework.service.UsedCarPhotoService;
import course.linkflower.link.oneframework.vo.usedcarphoto.UsedCarPhotoVo;
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
        Byte aByte=usedCarPhotoNoIdDto.getOrdering();
        if (Objects.isNull(aByte)){
            usedCarPhotoNoIdDto.setOrdering(usedCarPhotoMapper.lastOrderingByUsedCarId(((byte)(Byte.parseByte(usedCarPhotoNoIdDto.getUsedCarId())+1))));
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
    public Result<List<UsedCarPhotoVo>> listPhotoById(IdDto idDto) {
        return Result.succeed(usedCarPhotoMapper.listPhotoById(Long.parseLong(idDto.getId())));
    }
}
