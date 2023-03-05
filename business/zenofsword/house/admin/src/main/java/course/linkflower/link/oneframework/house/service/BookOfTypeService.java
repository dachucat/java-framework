package course.linkflower.link.oneframework.house.service;

import course.linkflower.link.oneframework.house.dto.bookoftype.BookOfTypeDto;
import course.linkflower.link.oneframework.house.vo.bookoftype.BookOfTypeVo;

public interface BookOfTypeService {
    BookOfTypeVo add(BookOfTypeDto bookOfTypeDto);
}
