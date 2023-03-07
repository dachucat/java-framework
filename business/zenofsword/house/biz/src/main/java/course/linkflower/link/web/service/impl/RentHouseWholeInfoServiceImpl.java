package course.linkflower.link.web.service.impl;

import course.linkflower.link.oneframework.common.model.Result;
import course.linkflower.link.oneframework.house.model.RentHouseInfo;
import course.linkflower.link.oneframework.house.service.RentHouseInfoService;
import course.linkflower.link.web.dao.RentHouseWholeInfoMapper;
import course.linkflower.link.web.service.RentHouseWholeInfoService;
import course.linkflower.link.web.vo.RentHouseWholeInfoVo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class RentHouseWholeInfoServiceImpl implements RentHouseWholeInfoService {
    @Autowired
    RentHouseWholeInfoMapper rentHouseWholeInfoMapper;

    @Override
    public Result<RentHouseWholeInfoVo> loadInfo(Long id) {
        RentHouseWholeInfoVo rentHouseWholeInfoVo = new RentHouseWholeInfoVo();
        RentHouseInfo rentHouseInfo = rentHouseWholeInfoMapper.getRentHouseInfoById(id);
        return Result.succeed(rentHouseWholeInfoVo);
    }
}
