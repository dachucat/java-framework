package course.linkflower.link.oneframework.house.service;

import course.linkflower.link.oneframework.common.model.Result;
import course.linkflower.link.oneframework.house.dto.dictionary.AddDictionaryDto;
import course.linkflower.link.oneframework.house.dto.dictionary.DeleteDicitionaryDto;
import course.linkflower.link.oneframework.house.dto.dictionary.SearchDicitionaryDto;
import course.linkflower.link.oneframework.house.dto.dictionary.UpdateDicitionaryDto;
import course.linkflower.link.oneframework.house.dto.picture.AddPictureDto;
import course.linkflower.link.oneframework.house.dto.picture.DeletePictureDto;
import course.linkflower.link.oneframework.house.dto.picture.SearchPictureDto;
import course.linkflower.link.oneframework.house.dto.picture.UpdatePictureDto;
import course.linkflower.link.oneframework.house.vo.dictionary.DictionaryVo;
import course.linkflower.link.oneframework.house.vo.picture.PictureVo;

public interface PictureService {
    Result<PictureVo> addPicture(AddPictureDto addPictureDto);
    Result deletePicture(DeletePictureDto deletePictureDto);
    Result<PictureVo> updatePicture(UpdatePictureDto updatePictureDto);
    Result<PictureVo> getPictureById(SearchPictureDto searchPictureDto);
}
