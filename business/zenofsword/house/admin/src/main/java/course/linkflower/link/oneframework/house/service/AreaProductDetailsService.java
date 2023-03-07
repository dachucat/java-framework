package course.linkflower.link.oneframework.house.service;

import course.linkflower.link.oneframework.common.model.Result;
import course.linkflower.link.oneframework.house.dto.areaproductdetails.AddAreaProductDetailsDto;
import course.linkflower.link.oneframework.house.dto.areaproductdetails.DeleteAreaProductDetailsDto;
import course.linkflower.link.oneframework.house.dto.areaproductdetails.SearchAreaProductDetailsDto;
import course.linkflower.link.oneframework.house.dto.areaproductdetails.UpdateAreaProductDetailsDto;
import course.linkflower.link.oneframework.house.vo.areaproductdetails.AreaProductDetailsVo;

public interface AreaProductDetailsService {
    Result<AreaProductDetailsVo> addAreaProductDetails(AddAreaProductDetailsDto addAreaProductDetailsDto);
    Result deleteAreaProductDetails(DeleteAreaProductDetailsDto deleteAreaProductDetailsDto);
    Result<AreaProductDetailsVo> updateAreaProductDetails(UpdateAreaProductDetailsDto updateAreaProductDetailsDto);
    Result<AreaProductDetailsVo> getAreaProductDetailsById(SearchAreaProductDetailsDto searchAreaProductDetailsDto);
}
