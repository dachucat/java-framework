package course.linkflower.link.oneframework.house.service.impl;

import course.linkflower.link.oneframework.common.model.Result;
import course.linkflower.link.oneframework.house.dao.HouseDeviceTypeMapper;
import course.linkflower.link.oneframework.house.dto.housedevicetype.AddHouseDeviceTypeDto;
import course.linkflower.link.oneframework.house.dto.housedevicetype.DeleteHouseDeviceTypeDto;
import course.linkflower.link.oneframework.house.dto.housedevicetype.SearchHouseDeviceTypeDto;
import course.linkflower.link.oneframework.house.dto.housedevicetype.UpdateHouseDeviceTypeDto;
import course.linkflower.link.oneframework.house.model.HouseDeviceType;
import course.linkflower.link.oneframework.house.service.HouseDeviceTypeService;
import course.linkflower.link.oneframework.house.vo.housedevicetype.HouseDeviceTypeVo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class HouseDeviceTypeServiceImpl implements HouseDeviceTypeService {
    @Autowired
    HouseDeviceTypeMapper houseDeviceTypeMapper;

    @Override
    public Result<HouseDeviceTypeVo> addHouseDeviceType(AddHouseDeviceTypeDto addHouseDeviceTypeDto) {
        HouseDeviceType houseDeviceType = addHouseDeviceTypeDto.toModel();
        houseDeviceTypeMapper.save(houseDeviceType);
        return Result.succeed(new HouseDeviceTypeVo().loadFrom(houseDeviceType));
    }

    @Override
    public Result deleteHouseDeviceType(DeleteHouseDeviceTypeDto deleteHouseDeviceTypeDto) {
        houseDeviceTypeMapper.delete(Long.parseLong(deleteHouseDeviceTypeDto.getId()));
        return Result.succeed();
    }

    @Override
    public Result<HouseDeviceTypeVo> updateHouseDeviceType(UpdateHouseDeviceTypeDto updateHouseDeviceTypeDto) {
        HouseDeviceType houseDeviceType = updateHouseDeviceTypeDto.toModel();
        houseDeviceTypeMapper.update(houseDeviceType);
        return Result.succeed(new HouseDeviceTypeVo().loadFrom(houseDeviceType));
    }

    @Override
    public Result<HouseDeviceTypeVo> getHouseDeviceTypeById(SearchHouseDeviceTypeDto searchHouseDeviceTypeDto) {
        return Result.succeed(new HouseDeviceTypeVo().loadFrom(houseDeviceTypeMapper.getHouseDeviceTypeById(Long.parseLong(searchHouseDeviceTypeDto.getId()))));
    }
}
