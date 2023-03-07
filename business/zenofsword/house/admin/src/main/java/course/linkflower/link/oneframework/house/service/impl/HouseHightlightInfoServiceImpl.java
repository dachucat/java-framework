package course.linkflower.link.oneframework.house.service.impl;

import course.linkflower.link.oneframework.common.constant.BaseErrorContst;
import course.linkflower.link.oneframework.common.model.Result;
import course.linkflower.link.oneframework.house.dao.HouseHightlightInfoMapper;
import course.linkflower.link.oneframework.house.dto.househighlightinfo.AddHouseHightlightInfoDto;
import course.linkflower.link.oneframework.house.dto.househighlightinfo.DeleteHouseHightlightInfoDto;
import course.linkflower.link.oneframework.house.dto.househighlightinfo.SearchHouseHightlightInfoDto;
import course.linkflower.link.oneframework.house.dto.househighlightinfo.UpdateHouseHightlightInfoDto;
import course.linkflower.link.oneframework.house.model.HouseHightlightInfo;
import course.linkflower.link.oneframework.house.service.HouseHightlightInfoService;
import course.linkflower.link.oneframework.house.vo.househightlightinfo.HouseHightlightInfoVo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class HouseHightlightInfoServiceImpl implements HouseHightlightInfoService {
    @Autowired
    HouseHightlightInfoMapper houseHightlightInfoMapper;
    @Override
    public Result<HouseHightlightInfoVo> addHouseHightlightInfo(AddHouseHightlightInfoDto addHouseHightlightInfoDto) {
        HouseHightlightInfo houseHightlightInfo = addHouseHightlightInfoDto.toModel();
        if (houseHightlightInfoMapper.countByName(addHouseHightlightInfoDto.getName())!=0){
            return Result.of(null, BaseErrorContst.BaseErrorTimeParamDuplicateError,BaseErrorContst.BaseMsgTimeParamsDuplicateError);
        }
        houseHightlightInfoMapper.save(houseHightlightInfo);
        return Result.succeed(new HouseHightlightInfoVo().loadFrom(houseHightlightInfo));
    }

    @Override
    public Result deleteHouseHightlightInfo(DeleteHouseHightlightInfoDto deleteHouseHightlightInfoDto) {
        houseHightlightInfoMapper.delete(Long.parseLong(deleteHouseHightlightInfoDto.getId()));
        return Result.succeed();
    }

    @Override
    public Result<HouseHightlightInfoVo> updateHouseHightlightInfo(UpdateHouseHightlightInfoDto updateHouseHightlightInfoDto) {
        HouseHightlightInfo houseHightlightInfo = updateHouseHightlightInfoDto.toModel();
        if (houseHightlightInfoMapper.countByName(updateHouseHightlightInfoDto.getName())!=0){
            return Result.of(null, BaseErrorContst.BaseErrorTimeParamDuplicateError,BaseErrorContst.BaseMsgTimeParamsDuplicateError);
        }
        houseHightlightInfoMapper.update(houseHightlightInfo);
        return Result.succeed(new HouseHightlightInfoVo().loadFrom(houseHightlightInfo));
    }

    @Override
    public Result<HouseHightlightInfoVo> getHouseHightlightInfoById(SearchHouseHightlightInfoDto searchHouseHightlightInfoDto) {
        return Result.succeed(new HouseHightlightInfoVo().loadFrom(houseHightlightInfoMapper.getHouseHightlightInfoById(Long.parseLong(searchHouseHightlightInfoDto.getId()))));
    }
}
