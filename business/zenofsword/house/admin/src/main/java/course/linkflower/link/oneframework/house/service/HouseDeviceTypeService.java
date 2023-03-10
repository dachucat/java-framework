package course.linkflower.link.oneframework.house.service;

import course.linkflower.link.oneframework.common.model.Result;
import course.linkflower.link.oneframework.house.dto.areainfo.AddAreaInfoDto;
import course.linkflower.link.oneframework.house.dto.areainfo.DeleteAreaInfoDto;
import course.linkflower.link.oneframework.house.dto.areainfo.SearchAreaInfoDto;
import course.linkflower.link.oneframework.house.dto.areainfo.UpdateAreaInfoDto;
import course.linkflower.link.oneframework.house.dto.housedevicetype.AddHouseDeviceTypeDto;
import course.linkflower.link.oneframework.house.dto.housedevicetype.DeleteHouseDeviceTypeDto;
import course.linkflower.link.oneframework.house.dto.housedevicetype.SearchHouseDeviceTypeDto;
import course.linkflower.link.oneframework.house.dto.housedevicetype.UpdateHouseDeviceTypeDto;
import course.linkflower.link.oneframework.house.vo.areainfo.AreaInfoVo;
import course.linkflower.link.oneframework.house.vo.housedevicetype.HouseDeviceTypeVo;

public interface HouseDeviceTypeService {
    Result<HouseDeviceTypeVo> addHouseDeviceType(AddHouseDeviceTypeDto addHouseDeviceTypeDto);
    Result deleteHouseDeviceType(DeleteHouseDeviceTypeDto deleteHouseDeviceTypeDto);
    Result<HouseDeviceTypeVo> updateHouseDeviceType(UpdateHouseDeviceTypeDto updateHouseDeviceTypeDto);
    Result<HouseDeviceTypeVo> getHouseDeviceTypeById(SearchHouseDeviceTypeDto searchHouseDeviceTypeDto);
}
