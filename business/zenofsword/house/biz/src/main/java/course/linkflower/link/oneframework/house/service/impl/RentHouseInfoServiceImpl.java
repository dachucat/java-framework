package course.linkflower.link.oneframework.house.service.impl;

import course.linkflower.link.oneframework.common.model.Result;
import course.linkflower.link.oneframework.house.dao.RentHouseInfoMapper;
import course.linkflower.link.oneframework.house.dto.renthouseinfo.AddRentHouseInfoDto;
import course.linkflower.link.oneframework.house.dto.renthouseinfo.DeleteRentHouseInfoDto;
import course.linkflower.link.oneframework.house.dto.renthouseinfo.SearchRentHouseInfoDto;
import course.linkflower.link.oneframework.house.dto.renthouseinfo.UpdateRentHouseInfoDto;
import course.linkflower.link.oneframework.house.model.RentHouseInfo;
import course.linkflower.link.oneframework.house.service.RentHouseInfoService;
import course.linkflower.link.oneframework.house.vo.renthouseinfo.RentHouseInfoVo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class RentHouseInfoServiceImpl implements RentHouseInfoService {
    @Autowired
    RentHouseInfoMapper rentHouseInfoMapper;

    @Override
    public Result<RentHouseInfoVo> addRentHouseInfo(AddRentHouseInfoDto addRentHouseInfoDto) {
        RentHouseInfo rentHouseInfo = addRentHouseInfoDto.toModel();
        rentHouseInfoMapper.save(rentHouseInfo);
        return Result.succeed(new RentHouseInfoVo().loadFrom(rentHouseInfo));
    }

    @Override
    public Result deleteRentHouseInfo(DeleteRentHouseInfoDto deleteRentHouseInfoDto) {
        rentHouseInfoMapper.delete(Long.parseLong(deleteRentHouseInfoDto.getId()));
        return Result.succeed();
    }

    @Override
    public Result<RentHouseInfoVo> updateRentHouseInfo(UpdateRentHouseInfoDto updateRentHouseInfoDto) {
        RentHouseInfo rentHouseInfo = updateRentHouseInfoDto.toModel();
        rentHouseInfoMapper.update(rentHouseInfo);
        return Result.succeed(new RentHouseInfoVo().loadFrom(rentHouseInfo));
    }

    @Override
    public Result<RentHouseInfoVo> getRentHouseInfoById(SearchRentHouseInfoDto searchRentHouseInfoDto) {
        return Result.succeed(new RentHouseInfoVo().loadFrom(rentHouseInfoMapper.getRentHouseInfoById(Long.parseLong(searchRentHouseInfoDto.getId()))));
    }
}
