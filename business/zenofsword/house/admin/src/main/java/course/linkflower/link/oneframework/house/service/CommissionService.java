package course.linkflower.link.oneframework.house.service;

import course.linkflower.link.oneframework.common.model.Result;
import course.linkflower.link.oneframework.house.dto.commission.AddCommissionDto;
import course.linkflower.link.oneframework.house.dto.commission.DeleteCommissionDto;
import course.linkflower.link.oneframework.house.dto.commission.SearchCommissionDto;
import course.linkflower.link.oneframework.house.dto.commission.UpdateCommissionDto;
import course.linkflower.link.oneframework.house.dto.dictionary.AddDictionaryDto;
import course.linkflower.link.oneframework.house.dto.dictionary.DeleteDicitionaryDto;
import course.linkflower.link.oneframework.house.dto.dictionary.SearchDicitionaryDto;
import course.linkflower.link.oneframework.house.dto.dictionary.UpdateDicitionaryDto;
import course.linkflower.link.oneframework.house.vo.commission.CommissionVo;
import course.linkflower.link.oneframework.house.vo.dictionary.DictionaryVo;

public interface CommissionService {
    Result<CommissionVo> addCommission(AddCommissionDto addCommissionDto);
    Result deleteCommission(DeleteCommissionDto deleteCommissionDto);
    Result<CommissionVo> updateCommission(UpdateCommissionDto updateCommissionDto);
    Result<CommissionVo> getCommissionById(SearchCommissionDto searchCommissionDto);
}
