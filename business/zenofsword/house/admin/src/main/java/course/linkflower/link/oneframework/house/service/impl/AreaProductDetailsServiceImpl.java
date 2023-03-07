package course.linkflower.link.oneframework.house.service.impl;

import course.linkflower.link.oneframework.common.constant.BaseErrorContst;
import course.linkflower.link.oneframework.common.model.Result;
import course.linkflower.link.oneframework.house.dao.AreaProductDetailsMapper;
import course.linkflower.link.oneframework.house.dto.areaproductdetails.AddAreaProductDetailsDto;
import course.linkflower.link.oneframework.house.dto.areaproductdetails.DeleteAreaProductDetailsDto;
import course.linkflower.link.oneframework.house.dto.areaproductdetails.SearchAreaProductDetailsDto;
import course.linkflower.link.oneframework.house.dto.areaproductdetails.UpdateAreaProductDetailsDto;
import course.linkflower.link.oneframework.house.model.AreaProductDetails;
import course.linkflower.link.oneframework.house.service.AreaProductDetailsService;
import course.linkflower.link.oneframework.house.vo.areaproductdetails.AreaProductDetailsVo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class AreaProductDetailsServiceImpl implements AreaProductDetailsService {
    @Autowired
    AreaProductDetailsMapper areaProductDetailsMapper;

    @Override
    public Result<AreaProductDetailsVo> addAreaProductDetails(AddAreaProductDetailsDto addAreaProductDetailsDto) {
        AreaProductDetails areaProductDetails = addAreaProductDetailsDto.toModel();
        if (areaProductDetailsMapper.countByAreaTargetType(areaProductDetails) != 0){
            return Result.of(null, BaseErrorContst.BaseErrorTimeParamDuplicateError,BaseErrorContst.BaseMsgTimeParamsDuplicateError);
        }
        areaProductDetailsMapper.save(areaProductDetails);
        return Result.succeed(new AreaProductDetailsVo().loadFrom(areaProductDetails));
    }

    @Override
    public Result deleteAreaProductDetails(DeleteAreaProductDetailsDto deleteAreaProductDetailsDto) {
        return null;
    }

    @Override
    public Result<AreaProductDetailsVo> updateAreaProductDetails(UpdateAreaProductDetailsDto updateAreaProductDetailsDto) {
        AreaProductDetails areaProductDetails = updateAreaProductDetailsDto.toModel();
        if (areaProductDetailsMapper.countByAreaTargetType(areaProductDetails) != 0){
            return Result.of(null, BaseErrorContst.BaseErrorTimeParamDuplicateError,BaseErrorContst.BaseMsgTimeParamsDuplicateError);
        }
        areaProductDetailsMapper.update(areaProductDetails);
        return Result.succeed(new AreaProductDetailsVo().loadFrom(areaProductDetails));
    }

    @Override
    public Result<AreaProductDetailsVo> getAreaProductDetailsById(SearchAreaProductDetailsDto searchAreaProductDetailsDto) {
        return null;
    }
}
