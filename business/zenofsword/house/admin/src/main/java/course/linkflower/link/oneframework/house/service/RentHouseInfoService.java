package course.linkflower.link.oneframework.house.service;

import course.linkflower.link.oneframework.common.model.Result;
import course.linkflower.link.oneframework.house.dto.renthouseinfo.AddRentHouseInfoDto;
import course.linkflower.link.oneframework.house.dto.renthouseinfo.DeleteRentHouseInfoDto;
import course.linkflower.link.oneframework.house.dto.renthouseinfo.SearchRentHouseInfoDto;
import course.linkflower.link.oneframework.house.dto.renthouseinfo.UpdateRentHouseInfoDto;
import course.linkflower.link.oneframework.house.vo.renthouseinfo.RentHouseInfoVo;

public interface RentHouseInfoService {
    Result<RentHouseInfoVo> addRentHouseInfo(AddRentHouseInfoDto addRentHouseInfoDto);
    Result deleteRentHouseInfo(DeleteRentHouseInfoDto deleteRentHouseInfoDto);
    Result<RentHouseInfoVo> updateRentHouseInfo(UpdateRentHouseInfoDto updateRentHouseInfoDto);
    Result<RentHouseInfoVo> getRentHouseInfoById(SearchRentHouseInfoDto searchRentHouseInfoDto);
}
