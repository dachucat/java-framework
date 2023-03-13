package course.linkflower.link.oneframework.service.Impl;

import course.linkflower.link.oneframework.common.constant.DbConstant;
import course.linkflower.link.oneframework.common.dto.PageDto;
import course.linkflower.link.oneframework.common.dto.base.IdDto;
import course.linkflower.link.oneframework.common.model.PageResult;
import course.linkflower.link.oneframework.common.model.Result;
import course.linkflower.link.oneframework.dao.UsedCarMapper;
import course.linkflower.link.oneframework.dto.usedcar.PostDateDto;
import course.linkflower.link.oneframework.dto.usedcar.UsedCarDto;
import course.linkflower.link.oneframework.dto.usedcar.UsedCarNoIdDto;
import course.linkflower.link.oneframework.model.UsedCar;
import course.linkflower.link.oneframework.service.UsedCarService;
import course.linkflower.link.oneframework.vo.usedcar.UsedCarShowVo;
import course.linkflower.link.oneframework.vo.usedcar.UsedCarVo;
import jdk.internal.dynalink.linker.LinkerServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class UsedCarServiceImpl implements UsedCarService {
    @Autowired
    private UsedCarMapper usedCarMapper;
    @Override
    public Result<UsedCarVo> add(UsedCarNoIdDto usedCarNoIdDto) {
        UsedCar usedCar=usedCarNoIdDto.toModel();
        usedCarMapper.add(usedCar);
        return Result.succeed(new UsedCarVo().loadFrom(usedCar));
    }

    @Override
    public Result deleteById(IdDto idDto) {
        usedCarMapper.deleteById(Long.parseLong(idDto.getId()));
        return Result.succeed();
    }

    @Override
    public Result<UsedCarVo> updateById(UsedCarDto usedCarDto) {
        UsedCar usedCar=usedCarDto.toModel();
        usedCarMapper.updateById(usedCar);
        return Result.succeed(new UsedCarVo().loadFrom(usedCar));
    }

    @Override
    public Result<UsedCarVo> getUsedCarById(IdDto idDto) {
        return Result.succeed(usedCarMapper.getUsedCarById(Long.parseLong(idDto.getId())));
    }

    @Override
    public Result<List<UsedCarVo>> listUsedCarByPostDate(PostDateDto postDateDto) {
        return Result.succeed(usedCarMapper.listUsedCarByPostDate(postDateDto.getPostDate(), DbConstant.DefaultMaxCountLimit));
    }

    @Override
    public PageResult<UsedCarShowVo> search(PageDto pageDto) {
        List<UsedCarShowVo> list=usedCarMapper.search(pageDto.getPageSize()*(pageDto.getPage()-1),pageDto.getPageSize());
        PageResult<UsedCarShowVo> pageResult=new PageResult<>(usedCarMapper.countAll(),0,list);
        return pageResult;
    }
}
