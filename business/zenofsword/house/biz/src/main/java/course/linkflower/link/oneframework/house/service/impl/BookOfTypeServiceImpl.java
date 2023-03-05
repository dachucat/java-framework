package course.linkflower.link.oneframework.house.service.impl;

import course.linkflower.link.oneframework.house.dao.BookOfTypeMapper;
import course.linkflower.link.oneframework.house.dto.bookoftype.BookOfTypeDto;
import course.linkflower.link.oneframework.house.service.BookOfTypeService;
import course.linkflower.link.oneframework.house.vo.bookoftype.BookOfTypeVo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class BookOfTypeServiceImpl implements BookOfTypeService {
    @Autowired
    private BookOfTypeMapper bookOfTypeMapper;

    @Override
    public BookOfTypeVo add(BookOfTypeDto bookOfTypeDto) {
        bookOfTypeMapper.add(bookOfTypeDto);
        return bookOfTypeMapper.getBookOfTypeById(Long.parseLong(bookOfTypeDto.getBookInforId()),Long.parseLong(bookOfTypeDto.getBookTypeId()));
    }
}
