package course.linkflower.link.oneframework.house.service;

import course.linkflower.link.oneframework.house.dto.borrowRequest.AddBorrowRequestDto;
import course.linkflower.link.oneframework.house.dto.borrowRequest.DeleteBorrowRequestDto;
import course.linkflower.link.oneframework.house.dto.borrowRequest.SearchBorrowRequestDto;
import course.linkflower.link.oneframework.house.dto.borrowRequest.UpdateBorrowRequestDto;
import course.linkflower.link.oneframework.house.dto.publisher.AddPublisherDto;
import course.linkflower.link.oneframework.house.dto.publisher.DeletePublisherDto;
import course.linkflower.link.oneframework.house.dto.publisher.SearchPublisherDto;
import course.linkflower.link.oneframework.house.dto.publisher.UpdatePublisherDto;
import course.linkflower.link.oneframework.house.vo.borrowRequest.BorrowRequestVo;
import course.linkflower.link.oneframework.house.vo.publisher.PublisherVo;

public interface PublisherService {
    void addPublisher (AddPublisherDto addPublisherDto);
    void updatePublisher(UpdatePublisherDto updatePublisherDto);
    void deletePublisher (DeletePublisherDto deletePublisherDto);
    PublisherVo getPublisherById(SearchPublisherDto searchPublisherDto);
}
