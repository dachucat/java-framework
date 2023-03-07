package course.linkflower.link.oneframework.house.service;

import course.linkflower.link.oneframework.common.model.Result;
import course.linkflower.link.oneframework.house.dto.housedevice.AddHouseDeviceDto;
import course.linkflower.link.oneframework.house.dto.housedevice.DeleteHouseDeviceDto;
import course.linkflower.link.oneframework.house.dto.housedevice.SearchHouseDeviceDto;
import course.linkflower.link.oneframework.house.dto.housedevice.UpdateHouseDeviceDto;
import course.linkflower.link.oneframework.house.vo.housedevice.HouseDeviceVo;

public interface HouseDeviceService {
    Result<HouseDeviceVo> addHouseDevice(AddHouseDeviceDto addHouseDeviceDto);
    Result deleteHouseDevice(DeleteHouseDeviceDto deleteHouseDeviceDto);
    Result<HouseDeviceVo> updateHouseDevice(UpdateHouseDeviceDto updateHouseDeviceDto);
    Result<HouseDeviceVo> getHouseDeviceById(SearchHouseDeviceDto searchHouseDeviceDto);
}
