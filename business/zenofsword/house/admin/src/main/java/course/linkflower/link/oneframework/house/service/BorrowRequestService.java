package course.linkflower.link.oneframework.house.service;

import course.linkflower.link.oneframework.house.dto.borrowRecord.AddBorrowRecordDto;
import course.linkflower.link.oneframework.house.dto.borrowRecord.DeleteBorrowRecordDto;
import course.linkflower.link.oneframework.house.dto.borrowRecord.SearchBorrowRecordDto;
import course.linkflower.link.oneframework.house.dto.borrowRecord.UpdateBorrowRecordDto;
import course.linkflower.link.oneframework.house.dto.borrowRequest.AddBorrowRequestDto;
import course.linkflower.link.oneframework.house.dto.borrowRequest.DeleteBorrowRequestDto;
import course.linkflower.link.oneframework.house.dto.borrowRequest.SearchBorrowRequestDto;
import course.linkflower.link.oneframework.house.dto.borrowRequest.UpdateBorrowRequestDto;
import course.linkflower.link.oneframework.house.vo.borrowRecord.BorrowRecordVo;
import course.linkflower.link.oneframework.house.vo.borrowRequest.BorrowRequestVo;

public interface BorrowRequestService {
    void addBorrowRequest (AddBorrowRequestDto addBorrowRequestDto);
    void updateBorrowRequest(UpdateBorrowRequestDto updateBorrowRequestDto);
    void deleteBorrowRequest (DeleteBorrowRequestDto deleteBorrowRequestDto);
    BorrowRequestVo getBorrowRequestById(SearchBorrowRequestDto searchBorrowRequestDto);
}
