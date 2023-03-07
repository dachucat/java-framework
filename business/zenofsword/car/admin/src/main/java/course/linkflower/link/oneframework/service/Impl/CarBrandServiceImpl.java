package course.linkflower.link.oneframework.service.Impl;

import course.linkflower.link.oneframework.common.constant.BaseErrorContst;
import course.linkflower.link.oneframework.common.constant.DbConstant;
import course.linkflower.link.oneframework.common.dto.base.IdDto;
import course.linkflower.link.oneframework.common.model.Result;
import course.linkflower.link.oneframework.dao.CarBrandMapper;
import course.linkflower.link.oneframework.dto.carbrand.CarBrandDto;
import course.linkflower.link.oneframework.dto.carbrand.CarBrandNoIdDto;
import course.linkflower.link.oneframework.model.CarBrand;
import course.linkflower.link.oneframework.service.CarBrandService;
import course.linkflower.link.oneframework.vo.carbrand.CarBrandVo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CarBrandServiceImpl implements CarBrandService {
    @Autowired
    private CarBrandMapper carBrandMapper;

    @Override
    public Result<CarBrandVo> add(CarBrandNoIdDto carBrandNoIdDto) {
        if (carBrandMapper.countCompanyIdBrandName(Long.parseLong(carBrandNoIdDto.getCarCompanyId()),
                carBrandNoIdDto.getName())!=0){
            return Result.of(null, BaseErrorContst.BaseErrorTimeParamDuplicateError,
                    String.format(BaseErrorContst.BaseMsgTimeParamsDuplicateError,
                            "carCompanyId and name"));
        }
        CarBrand carBrand= carBrandNoIdDto.toModel(carBrandNoIdDto);
        carBrandMapper.add(carBrand);
        return Result.succeed(new CarBrandVo().loadFrom(carBrand));
    }

    @Override
    public Result deleteById(IdDto idDto) {
        carBrandMapper.deleteById(Long.parseLong(idDto.getId()));
        return Result.succeed();
    }

    @Override
    public Result<List<CarBrandVo>> listNameByCarCompanyId(IdDto idDto) {
        return Result.succeed(carBrandMapper.listNameByCarCompanyId(Long.parseLong(idDto.getId()), DbConstant.DefaultMaxCountLimit));
    }

    @Override
    public Result<CarBrandVo> getCarBrandById(IdDto idDto) {
        return Result.succeed(carBrandMapper.getCarBrandById(Long.parseLong(idDto.getId())));

    }

    @Override
    public Result<CarBrandVo> update(CarBrandDto carBrandDto) {
        if (carBrandMapper.countCompanyIdBrandNamediffId(Long.parseLong(carBrandDto.getCarCompanyId()),
                carBrandDto.getName(),Long.parseLong(carBrandDto.getId()))!=0){
            return Result.of(null,BaseErrorContst.BaseErrorTimeParamDuplicateError,
                    String.format(BaseErrorContst.BaseMsgTimeParamsDuplicateError,"carCompanyId and Name"));
        }
        CarBrand carBrand=carBrandDto.toModel(carBrandDto);
        carBrandMapper.update(carBrand);
        return Result.succeed(new CarBrandVo().loadFrom(carBrand));
    }
}
