package course.linkflower.link.oneframework.service.Impl;

import course.linkflower.link.oneframework.common.dto.base.IdDto;
import course.linkflower.link.oneframework.common.model.Result;
import course.linkflower.link.oneframework.dao.CarInforPhotoMapper;
import course.linkflower.link.oneframework.dto.CarInfor.CarInforNoIdDto;
import course.linkflower.link.oneframework.dto.carinforphoto.CarInforPhotoDto;
import course.linkflower.link.oneframework.dto.carinforphoto.CarInforPhotoNoIdDto;
import course.linkflower.link.oneframework.model.CarInforPhoto;
import course.linkflower.link.oneframework.service.CarInforPhotoService;
import course.linkflower.link.oneframework.service.CarInforService;
import course.linkflower.link.oneframework.vo.carinfor.CarInforVo;
import course.linkflower.link.oneframework.vo.carinforphoto.CarInforPhotoVo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Objects;
@Service
public class CarInforPhotoServiceImpl implements CarInforPhotoService {
    @Autowired
    private CarInforPhotoMapper carInforPhotoMapper;
    @Override
    public Result<CarInforPhotoVo> add(CarInforPhotoNoIdDto carInforPhotoNoIdDto) {
        Byte aByte=carInforPhotoNoIdDto.getOrdering();
        if (Objects.isNull(aByte)){
            carInforPhotoNoIdDto.setOrdering(carInforPhotoMapper.lastOrderingByCarInforId(((byte)(Byte.parseByte(carInforPhotoNoIdDto.getCarInforId())+1))));
        }
        CarInforPhoto carInforPhoto=carInforPhotoNoIdDto.toModel(carInforPhotoNoIdDto);
        carInforPhotoMapper.add(carInforPhoto);
        return Result.succeed(new CarInforPhotoVo().loadFrom(carInforPhoto));
    }

    @Override
    public Result<CarInforPhotoVo> updateById(CarInforPhotoDto carInforPhotoDto) {
        CarInforPhoto carInforPhoto=carInforPhotoDto.toModel();
        carInforPhotoMapper.updateById(carInforPhoto);
        return Result.succeed(new CarInforPhotoVo().loadFrom(carInforPhoto));
    }

    @Override
    public Result deleteById(IdDto idDto) {
        carInforPhotoMapper.deleteById(Long.parseLong(idDto.getId()));
        return Result.succeed();
    }

    @Override
    public Result<List<CarInforPhotoVo>> listPhotoById(IdDto idDto) {
        return Result.succeed(carInforPhotoMapper.listPhotoById(Long.parseLong(idDto.getId())));
    }
}
