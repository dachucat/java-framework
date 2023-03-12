package course.linkflower.link.oneframework.service.Impl;

import course.linkflower.link.oneframework.common.dto.PageDto;
import course.linkflower.link.oneframework.common.dto.base.IdDto;
import course.linkflower.link.oneframework.common.model.PageResult;
import course.linkflower.link.oneframework.common.model.Result;
import course.linkflower.link.oneframework.dao.CarInforPhotoMapper;
import course.linkflower.link.oneframework.dto.CarInfor.CarInforNoIdDto;
import course.linkflower.link.oneframework.dto.carinforphoto.CarInforPhotoDto;
import course.linkflower.link.oneframework.dto.carinforphoto.CarInforPhotoNoIdDto;
import course.linkflower.link.oneframework.model.CarInforPhoto;
import course.linkflower.link.oneframework.service.CarInforPhotoService;
import course.linkflower.link.oneframework.service.CarInforService;
import course.linkflower.link.oneframework.vo.carinfor.CarInforVo;
import course.linkflower.link.oneframework.vo.carinforphoto.CarInforPhotoShowVo;
import course.linkflower.link.oneframework.vo.carinforphoto.CarInforPhotoVo;
import org.apache.commons.lang3.StringUtils;
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
        if (carInforPhotoNoIdDto.getOrdering()==null) {
            Byte aByte=carInforPhotoMapper.lastOrderingByCarInforId(Long.parseLong(carInforPhotoNoIdDto.getCarInforId()));
            if (aByte==null){
                    aByte=1;
            }
            carInforPhotoNoIdDto.setOrdering(aByte);
        }
        CarInforPhoto carInforPhoto=carInforPhotoNoIdDto.toModel(carInforPhotoNoIdDto);
        carInforPhotoMapper.add(carInforPhoto);
        return Result.succeed(new CarInforPhotoVo().loadFrom(carInforPhoto));

    }

    @Override
    public Result<CarInforPhotoVo> updateById(CarInforPhotoDto carInforPhotoDto) {
        if (carInforPhotoDto.getOrdering()==null) {

        }
        CarInforPhoto carInforPhoto=carInforPhotoDto.toModel();
        carInforPhotoMapper.updateById(carInforPhoto);
        return Result.succeed(carInforPhotoMapper.getCarInforPhotoById(carInforPhoto.getId()));
    }

    @Override
    public Result deleteById(IdDto idDto) {
        carInforPhotoMapper.deleteById(Long.parseLong(idDto.getId()));
        return Result.succeed();
    }

    @Override
    public Result<List<CarInforPhotoVo>> listPhotoByCarInforId(IdDto idDto) {
        return Result.succeed(carInforPhotoMapper.listPhotoByCarInforId(Long.parseLong(idDto.getId())));
    }

    @Override
    public PageResult<CarInforPhotoShowVo> search(PageDto pageDto) {
        List<CarInforPhotoShowVo> carInforPhotoShowVos=carInforPhotoMapper.search(pageDto.getPageSize()*pageDto.getPage(),
                pageDto.getPageSize());
        PageResult<CarInforPhotoShowVo> pageResult=new PageResult<>();
        pageResult.setData(carInforPhotoShowVos);
        pageResult.setCount(carInforPhotoMapper.countAll());
        return pageResult;
    }
}
