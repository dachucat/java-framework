package course.linkflower.link.oneframework.house.service;

import course.linkflower.link.oneframework.common.model.Result;
import course.linkflower.link.oneframework.house.dto.commission.AddCommissionDto;
import course.linkflower.link.oneframework.house.dto.commission.DeleteCommissionDto;
import course.linkflower.link.oneframework.house.dto.commission.SearchCommissionDto;
import course.linkflower.link.oneframework.house.dto.commission.UpdateCommissionDto;
import course.linkflower.link.oneframework.house.vo.commission.CommissionVo;

public interface CommissionService {
    Result<CommissionVo> addCommission(AddCommissionDto addCommissionDto);
    Result deleteCommission(DeleteCommissionDto deleteCommissionDto);
    Result<CommissionVo> updateCommission(UpdateCommissionDto updateCommissionDto);
    Result<CommissionVo> getCommissionById(SearchCommissionDto searchCommissionDto);
}
