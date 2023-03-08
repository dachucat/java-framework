package course.linkflower.link.oneframeworkweb.house.service.impl;

import course.linkflower.link.oneframework.common.model.Result;
import course.linkflower.link.oneframework.house.model.*;
import course.linkflower.link.oneframework.house.vo.areainfo.AreaInfoVo;
import course.linkflower.link.oneframework.house.vo.commission.CommissionVo;
import course.linkflower.link.oneframework.house.vo.communityinfo.CommunityInfoVo;
import course.linkflower.link.oneframework.house.vo.housedevicetype.HouseDeviceTypeVo;
import course.linkflower.link.oneframework.house.vo.housedictionary.HouseDictionaryVo;
import course.linkflower.link.oneframework.house.vo.househighlight.HouseHighlightVo;
import course.linkflower.link.oneframework.house.vo.househightlightinfo.HouseHightlightInfoVo;
import course.linkflower.link.oneframework.house.vo.renthouserequestinfo.RentHouseRequestInfoVo;
import course.linkflower.link.oneframeworkweb.house.dao.RentHouseWholeInfoMapper;
import course.linkflower.link.oneframeworkweb.house.dto.AddID;
import course.linkflower.link.oneframeworkweb.house.service.RentHouseWholeInfoService;
import course.linkflower.link.oneframeworkweb.house.vo.RentHouseWholeInfoVo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class RentHouseWholeInfoServiceImpl implements RentHouseWholeInfoService {
    @Autowired
    RentHouseWholeInfoMapper rentHouseWholeInfoMapper;

    @Override
    public Result<RentHouseWholeInfoVo> loadInfo(AddID addID) {
        RentHouseWholeInfoVo rentHouseWholeInfoVo = new RentHouseWholeInfoVo();
        //获得租房信息
        RentHouseInfo rentHouseInfo = rentHouseWholeInfoMapper.getRentHouseInfoById(Long.parseLong(addID.getInfoId()));
        List<Long> dictionaryIds = new ArrayList<>();
        //装载字典id,Todo 有没有简写？
        dictionaryIds.add(rentHouseInfo.getDepositTypeId());
        dictionaryIds.add(rentHouseInfo.getRentHouseTypeId());
        dictionaryIds.add(rentHouseInfo.getDecorateTypeId());
        dictionaryIds.add(rentHouseInfo.getOrientationId());
        dictionaryIds.add(rentHouseInfo.getStoreyId());
        // 装载字典数据
        List<HouseDictionaryVo> houseDictionaryVo = new ArrayList<>();
        List<HouseDictionary> houseDictionaries = rentHouseWholeInfoMapper.searchHouseDictionaryByIds(dictionaryIds);
        for (HouseDictionary houseDictionary : houseDictionaries){
            houseDictionaryVo.add(new HouseDictionaryVo().loadFrom(houseDictionary));
        }
        List<AreaProductDetails> areaDetailsIds = rentHouseWholeInfoMapper.getAreaInfoId(rentHouseInfo.getId());
        List<Long> areaInfoIds = new ArrayList<>();
        for (AreaProductDetails apd : areaDetailsIds){
            areaInfoIds.add(apd.getAreaInfoId());
        }
        //装载小区数据
        List<AreaInfo> areaInfos = rentHouseWholeInfoMapper.searchAreaInfoByIds(areaInfoIds);
        List<AreaInfoVo> hfo = new ArrayList<>();
        for (AreaInfo areaInfo : areaInfos){
            hfo.add(new AreaInfoVo().loadFrom(areaInfo));
        }
        List<HouseDevice> houseDevices = rentHouseWholeInfoMapper.getHouseDeviceId(rentHouseInfo.getId());
        List<Long> houseDeviceTypeIds = new ArrayList<>();
        for (HouseDevice hd : houseDevices){
            houseDeviceTypeIds.add(hd.getHouseDeviceTypeId());
        }
        //装载房屋设备信息
        List<HouseDeviceType> houseDeviceTypes = rentHouseWholeInfoMapper.searchHouseDeviceTypeByIds(houseDeviceTypeIds);
        List<HouseDeviceTypeVo> houseDeviceTypeVo = new ArrayList<>();
        for (HouseDeviceType houseDeviceType : houseDeviceTypes){
                houseDeviceTypeVo.add(new HouseDeviceTypeVo().loadFrom(houseDeviceType));
        }
        List<HouseHighlight> houseHighlights = rentHouseWholeInfoMapper.getHouseHighlightId(rentHouseInfo.getId());
        List<Long> houseHighlightInfoIds = new ArrayList<>();
        for (HouseHighlight houseHighlight : houseHighlights){
                houseHighlightInfoIds.add(houseHighlight.getHighlightId());
        }
        //装载亮点信息
        List<HouseHightlightInfo> houseHightlightInfos = rentHouseWholeInfoMapper.searchHouseHightlightInfoByIds(houseHighlightInfoIds);
        List<HouseHightlightInfoVo> houseHightlightInfoVos = new ArrayList<>();
        for (HouseHightlightInfo h : houseHightlightInfos){
            houseHightlightInfoVos.add(new HouseHightlightInfoVo().loadFrom(h));
        }
        List<RentHouseRequest> houseRequests = rentHouseWholeInfoMapper.getRentHouseRequestId(rentHouseInfo.getId());
        List<Long> rentHouseRequestInfoIds = new ArrayList<>();
        for (RentHouseRequest rentHouseRequest : houseRequests){
            rentHouseRequestInfoIds.add(rentHouseRequest.getRentHouseRequestInfoId());
        }
        //装载出租要求
        List<RentHouseRequestInfo> rentHouseRequestInfos = rentHouseWholeInfoMapper.searchRentHouseRequestInfoByIds(rentHouseRequestInfoIds);
        List<RentHouseRequestInfoVo> rentHouseRequestInfoVos = new ArrayList<>();
        for (RentHouseRequestInfo rentHouseRequestInfo : rentHouseRequestInfos){
            rentHouseRequestInfoVos.add(new RentHouseRequestInfoVo().loadFrom(rentHouseRequestInfo));
        }
        rentHouseWholeInfoVo.setRentHouseRequestInfoVos(rentHouseRequestInfoVos);
        rentHouseWholeInfoVo.setHouseHightlightInfoVos(houseHightlightInfoVos);
        rentHouseWholeInfoVo.setHouseDeviceTypeVos(houseDeviceTypeVo);
        rentHouseWholeInfoVo.setCommunityInfoVo(new CommunityInfoVo().loadFrom(rentHouseWholeInfoMapper.getCommunityInfoById(rentHouseInfo.getCommunityInfoId())));
        rentHouseWholeInfoVo.setCommissionVo(new CommissionVo().loadFrom(rentHouseWholeInfoMapper.getCommissionById(rentHouseInfo.getCommissionId())));
        rentHouseWholeInfoVo.setHouseDictionaryVos(houseDictionaryVo);
        rentHouseWholeInfoVo.setHouseAreaInfoVos(hfo);
        rentHouseWholeInfoVo.loadFrom(rentHouseInfo);
        return Result.succeed(rentHouseWholeInfoVo);
    }
}
