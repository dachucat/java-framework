package course.linkflower.link.oneframework.service.Impl;

import course.linkflower.link.oneframework.common.constant.BaseErrorContst;
import course.linkflower.link.oneframework.common.dto.base.IdDto;
import course.linkflower.link.oneframework.common.model.Result;
import course.linkflower.link.oneframework.dao.CarInforMapper;
import course.linkflower.link.oneframework.dto.CarInfor.CarInforDto;
import course.linkflower.link.oneframework.dto.CarInfor.CarInforNoIdDto;
import course.linkflower.link.oneframework.model.CarInfor;
import course.linkflower.link.oneframework.service.CarInforService;
import course.linkflower.link.oneframework.vo.carinfor.CarInforVo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CarInforServiceImpl implements CarInforService {
    @Autowired
    private CarInforMapper carInforMapper;

    @Override
    public Result<CarInforVo> add(CarInforNoIdDto carInforNoIdDto) {
        if (carInforMapper.countCarPatternId(Long.parseLong(carInforNoIdDto.getCarPatternId()))!=0){
            return Result.of(null, BaseErrorContst.BaseErrorTimeParamDuplicateError,
                    String.format(BaseErrorContst.BaseMsgTimeParamsDuplicateError,"carPatternId"));
        }
        CarInfor carInfor=carInforNoIdDto.toModel();
        carInforMapper.add(carInfor);
        return Result.succeed(new CarInforVo().loadFrom(carInfor));
    }

    @Override
    public Result deleteById(IdDto idDto) {
        carInforMapper.deleteById(Long.parseLong(idDto.getId()));
        return Result.succeed();
    }

    @Override
    public Result<CarInforVo> updateById(CarInforDto carInforDto) {
        if (carInforMapper.countCarPatternIdDiffId(Long.parseLong(carInforDto.getCarPatternId()),
                Long.parseLong(carInforDto.getId()))!=0){
            return Result.of(null, BaseErrorContst.BaseErrorTimeParamDuplicateError,
                    String.format(BaseErrorContst.BaseMsgTimeParamsDuplicateError,"carPatternId"));
        }
        CarInfor carInfor=carInforDto.toModel();
        carInforMapper.updateById(carInfor);
        return Result.succeed(new CarInforVo().loadFrom(carInfor));
    }

    @Override
    public Result<CarInforVo> getCarInforById(IdDto idDto) {
        return Result.succeed(carInforMapper.getCarInforById(Long.parseLong(idDto.getId())));
    }
}