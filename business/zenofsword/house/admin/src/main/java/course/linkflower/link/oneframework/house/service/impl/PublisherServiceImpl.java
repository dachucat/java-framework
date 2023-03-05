package course.linkflower.link.oneframework.house.service.impl;

import course.linkflower.link.oneframework.house.dao.PublisherMapper;
import course.linkflower.link.oneframework.house.dto.borrowRequest.UpdateBorrowRequestDto;
import course.linkflower.link.oneframework.house.dto.publisher.AddPublisherDto;
import course.linkflower.link.oneframework.house.dto.publisher.DeletePublisherDto;
import course.linkflower.link.oneframework.house.dto.publisher.SearchPublisherDto;
import course.linkflower.link.oneframework.house.dto.publisher.UpdatePublisherDto;
import course.linkflower.link.oneframework.house.service.PublisherService;
import course.linkflower.link.oneframework.house.vo.publisher.PublisherVo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PublisherServiceImpl implements PublisherService {
    @Autowired
    PublisherMapper publisherMapper;

    @Override
    public void addPublisher(AddPublisherDto addPublisherDto) {
        publisherMapper.save(addPublisherDto.getName());
    }

    @Override
    public void updatePublisher(UpdatePublisherDto updatePublisherDto) {
        publisherMapper.update(updatePublisherDto.getName(), Long.parseLong(updatePublisherDto.getId()));
    }

    @Override
    public void deletePublisher(DeletePublisherDto deletePublisherDto) {
        publisherMapper.delete(Long.parseLong(deletePublisherDto.getId()));
    }

    @Override
    public PublisherVo getPublisherById(SearchPublisherDto searchPublisherDto) {
        return new PublisherVo().loadFrom(publisherMapper.publisherSearchById(Long.parseLong(searchPublisherDto.getId())));
    }
}
