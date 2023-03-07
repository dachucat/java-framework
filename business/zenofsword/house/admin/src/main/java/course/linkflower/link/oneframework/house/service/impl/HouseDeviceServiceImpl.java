package course.linkflower.link.oneframework.house.service.impl;

import course.linkflower.link.oneframework.common.constant.BaseErrorContst;
import course.linkflower.link.oneframework.common.model.Result;
import course.linkflower.link.oneframework.house.dao.HouseDeviceMapper;
import course.linkflower.link.oneframework.house.dto.housedevice.AddHouseDeviceDto;
import course.linkflower.link.oneframework.house.dto.housedevice.DeleteHouseDeviceDto;
import course.linkflower.link.oneframework.house.dto.housedevice.SearchHouseDeviceDto;
import course.linkflower.link.oneframework.house.dto.housedevice.UpdateHouseDeviceDto;
import course.linkflower.link.oneframework.house.model.HouseDevice;
import course.linkflower.link.oneframework.house.service.HouseDeviceService;
import course.linkflower.link.oneframework.house.vo.housedevice.HouseDeviceVo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class HouseDeviceServiceImpl implements HouseDeviceService {
    @Autowired
    HouseDeviceMapper houseDeviceMapper;

    @Override
    public Result<HouseDeviceVo> addHouseDevice(AddHouseDeviceDto addHouseDeviceDto) {
        HouseDevice houseDevice = addHouseDeviceDto.toModel();
        if (houseDeviceMapper.countByHouseDeviceTypeId(Long.parseLong(addHouseDeviceDto.getRentHouseInfoId()),Long.parseLong(addHouseDeviceDto.getHouseDeviceTypeId()))!=0){
            return Result.of(null, BaseErrorContst.BaseErrorTimeParamDuplicateError,BaseErrorContst.BaseMsgTimeParamsDuplicateError);
        }
        houseDeviceMapper.save(houseDevice);
        return Result.succeed(new HouseDeviceVo().loadFrom(houseDevice));
    }

    @Override
    public Result deleteHouseDevice(DeleteHouseDeviceDto deleteHouseDeviceDto) {
        houseDeviceMapper.delete(Long.parseLong(deleteHouseDeviceDto.getId()));
        return Result.succeed();
    }

    @Override
    public Result<HouseDeviceVo> updateHouseDevice(UpdateHouseDeviceDto updateHouseDeviceDto) {
        HouseDevice houseDevice = updateHouseDeviceDto.toModel();
        if (houseDeviceMapper.countByHouseDeviceTypeId(Long.parseLong(updateHouseDeviceDto.getRentHouseInfoId()),Long.parseLong(updateHouseDeviceDto.getHouseDeviceTypeId()))!=0){
            return Result.of(null, BaseErrorContst.BaseErrorTimeParamDuplicateError,BaseErrorContst.BaseMsgTimeParamsDuplicateError);
        }
        houseDeviceMapper.update(houseDevice);
        return Result.succeed(new HouseDeviceVo().loadFrom(houseDevice));
    }

    @Override
    public Result<HouseDeviceVo> getHouseDeviceById(SearchHouseDeviceDto searchHouseDeviceDto) {
        return Result.succeed(new HouseDeviceVo().loadFrom(houseDeviceMapper.getHouseDeviceById(Long.parseLong(searchHouseDeviceDto.getId()))));
    }
}
