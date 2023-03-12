package course.linkflower.link.oneframework.service.Impl;

import course.linkflower.link.oneframework.common.constant.BaseErrorContst;
import course.linkflower.link.oneframework.common.constant.DbConstant;
import course.linkflower.link.oneframework.common.dto.PageDto;
import course.linkflower.link.oneframework.common.dto.base.IdDto;
import course.linkflower.link.oneframework.common.model.PageResult;
import course.linkflower.link.oneframework.common.model.Result;
import course.linkflower.link.oneframework.dto.carpattern.CarPatternDto;
import course.linkflower.link.oneframework.dto.carpattern.CarPatternNoIdDto;
import course.linkflower.link.oneframework.model.CarPattern;
import course.linkflower.link.oneframework.dao.CarPatternMapper;
import course.linkflower.link.oneframework.service.CarPatternService;
import course.linkflower.link.oneframework.vo.carpattern.CarPatternShowVo;
import course.linkflower.link.oneframework.vo.carpattern.CarPatternVo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CarPatternServiceImpl implements CarPatternService {
    @Autowired
    private CarPatternMapper carPatternMapper;

    @Override
    public Result<CarPatternVo> add(CarPatternNoIdDto carPatternDto) {
        if (carPatternMapper.countBrandPatternTimeKey(Long.parseLong(carPatternDto.getCarBrandId()),
                carPatternDto.getCarPattern(),carPatternDto.getTimePattern(),carPatternDto.getPatternKey())!=0){
            return Result.of(null, BaseErrorContst.BaseErrorTimeParamDuplicateError,
                    String.format(BaseErrorContst.BaseMsgTimeParamsDuplicateError,
                            "carPattern与carBrandId与timePattern与patternKey建立了唯一索引"));
        }
        CarPattern carPattern=carPatternDto.toModel();
        carPatternMapper.add(carPattern);
        return Result.succeed(new CarPatternVo().loadFrom(carPattern));
    }

    @Override
    public Result deleteById(IdDto idDto) {
        carPatternMapper.deleteById(Long.parseLong(idDto.getId()));
        return Result.succeed();
    }

    @Override
    public Result<CarPatternVo> updateById(CarPatternDto carPatternDto) {
        if (carPatternMapper.countBrandPatternTimeKeyDiffId(Long.parseLong(carPatternDto.getCarBrandId()),
                carPatternDto.getCarPattern(),carPatternDto.getTimePattern(),carPatternDto.getPatternKey(),
                Long.parseLong(carPatternDto.getId()))!=0) {
            return Result.of(null, BaseErrorContst.BaseErrorTimeParamDuplicateError,
                    String.format(BaseErrorContst.BaseMsgTimeParamsDuplicateError,
                            "carPattern与carBrandId与timePattern与patternKey建立了唯一索引"));
        }
            CarPattern carPattern=carPatternDto.toModel();
            carPatternMapper.updateById(carPattern);
            return Result.succeed(carPatternMapper.getCarPatternById(carPattern.getId()));
    }

    @Override
    public Result<List<CarPatternVo>> listCarPatternByCarBrandId(IdDto idDto) {
        return Result.succeed(carPatternMapper.listCarPatternByCarBrandId(Long.parseLong(idDto.getId()), DbConstant.DefaultMaxCountLimit));
    }

    @Override
    public Result<CarPatternVo> getCarPatternById(IdDto idDto) {
        return Result.succeed(carPatternMapper.getCarPatternById(Long.parseLong(idDto.getId())));
    }

    @Override
    public PageResult<CarPatternShowVo> search(PageDto pageDto) {
        List<CarPatternShowVo> carPatternShowVos=carPatternMapper.search(pageDto.getPage()*pageDto.getPageSize(),pageDto.getPageSize());
        PageResult<CarPatternShowVo> pageResult=new PageResult<>();
        pageResult.setData(carPatternShowVos);
        pageResult.setCount(carPatternMapper.countAll());
        return pageResult;
    }
}
