package course.linkflower.link.oneframework.house.service.impl;

import course.linkflower.link.oneframework.common.model.Result;
import course.linkflower.link.oneframework.house.dao.AreaInfoMapper;
import course.linkflower.link.oneframework.house.dto.areainfo.AddAreaInfoDto;
import course.linkflower.link.oneframework.house.dto.areainfo.DeleteAreaInfoDto;
import course.linkflower.link.oneframework.house.dto.areainfo.SearchAreaInfoDto;
import course.linkflower.link.oneframework.house.dto.areainfo.UpdateAreaInfoDto;
import course.linkflower.link.oneframework.house.model.AreaInfo;
import course.linkflower.link.oneframework.house.service.AreaInfoService;
import course.linkflower.link.oneframework.house.vo.areainfo.AreaInfoVo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class AreaInfoServiceImpl implements AreaInfoService {
    @Autowired
    AreaInfoMapper areaInfoMapper;

    @Override
    public Result<AreaInfoVo> addAreaInfo(AddAreaInfoDto addAreaInfoDto) {
        AreaInfo areaInfo = addAreaInfoDto.toModel();
        areaInfoMapper.save(areaInfo);
        return Result.succeed(new AreaInfoVo().loadFrom(areaInfo));
    }

    @Override
    public Result deleteAreaInfo(DeleteAreaInfoDto deleteAreaInfoDto) {
        areaInfoMapper.delete(Long.parseLong(deleteAreaInfoDto.getId()));
        return Result.succeed();
    }

    @Override
    public Result<AreaInfoVo> updateAreaInfo(UpdateAreaInfoDto updateAreaInfoDto) {
        AreaInfo areaInfo = updateAreaInfoDto.toModel();
        areaInfoMapper.update(areaInfo);
        return Result.succeed(new AreaInfoVo().loadFrom(areaInfo));
    }

    @Override
    public Result<AreaInfoVo> getAreaInfoById(SearchAreaInfoDto searchAreaInfoDto) {
        return Result.succeed(new AreaInfoVo().loadFrom(areaInfoMapper.getAreaInfoById(Long.parseLong(searchAreaInfoDto.getId()))));
    }
}
