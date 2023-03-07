package course.linkflower.link.oneframework.house.service.impl;

import course.linkflower.link.oneframework.common.constant.BaseErrorContst;
import course.linkflower.link.oneframework.common.model.Result;
import course.linkflower.link.oneframework.house.dao.HouseHighlightMapper;
import course.linkflower.link.oneframework.house.dto.househightlight.AddHouseHighlightDto;
import course.linkflower.link.oneframework.house.dto.househightlight.DeleteHouseHighlightDto;
import course.linkflower.link.oneframework.house.dto.househightlight.SearchHouseHighlightDto;
import course.linkflower.link.oneframework.house.dto.househightlight.UpdateHouseHighlightDto;
import course.linkflower.link.oneframework.house.model.HouseHighlight;
import course.linkflower.link.oneframework.house.service.HouseHighlightService;
import course.linkflower.link.oneframework.house.vo.househighlight.HouseHighlightVo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class HouseHighlightServiceImpl implements HouseHighlightService {
    @Autowired
    HouseHighlightMapper houseHighlightMapper;

    @Override
    public Result<HouseHighlightVo> addHouseHighlight(AddHouseHighlightDto addHouseHighlightDto) {
        HouseHighlight houseHighlight = addHouseHighlightDto.toModel();
        if (houseHighlightMapper.countByHouseHighlight(Long.parseLong(addHouseHighlightDto.getRentHouseInfoId()),Long.parseLong(addHouseHighlightDto.getHighlightId()))!=0) {
            return Result.of(null, BaseErrorContst.BaseErrorTimeParamDuplicateError,BaseErrorContst.BaseMsgTimeParamsDuplicateError);
        }
        houseHighlightMapper.save(houseHighlight);
        return Result.succeed(new HouseHighlightVo().loadFrom(houseHighlight));
    }

    @Override
    public Result deleteHouseHighlight(DeleteHouseHighlightDto deleteHouseHighlightDto) {
        houseHighlightMapper.delete(Long.parseLong(deleteHouseHighlightDto.getId()));
        return Result.succeed();
    }

    @Override
    public Result<HouseHighlightVo> updateHouseHighlight(UpdateHouseHighlightDto updateHouseHighlightDto) {
        HouseHighlight houseHighlight = updateHouseHighlightDto.toModel();
        if (houseHighlightMapper.countByHouseHighlight(Long.parseLong(updateHouseHighlightDto.getRentHouseInfoId()),Long.parseLong(updateHouseHighlightDto.getHighlightId()))!=0) {
            return Result.of(null, BaseErrorContst.BaseErrorTimeParamDuplicateError,BaseErrorContst.BaseMsgTimeParamsDuplicateError);
        }
        houseHighlightMapper.update(houseHighlight);
        return Result.succeed(new HouseHighlightVo().loadFrom(houseHighlight));
    }

    @Override
    public Result<HouseHighlightVo> getHouseHighlight(SearchHouseHighlightDto searchHouseHighlightDto) {
        return Result.succeed(new HouseHighlightVo().loadFrom(houseHighlightMapper.getHouseHighlightById(Long.parseLong(searchHouseHighlightDto.getId()))));
    }
}
