package course.linkflower.link.oneframework.house.service;

import course.linkflower.link.oneframework.house.dto.publisher.AddPublisherDto;
import course.linkflower.link.oneframework.house.dto.publisher.DeletePublisherDto;
import course.linkflower.link.oneframework.house.dto.publisher.SearchPublisherDto;
import course.linkflower.link.oneframework.house.dto.publisher.UpdatePublisherDto;
import course.linkflower.link.oneframework.house.dto.thirdAuth.AddThirdAuthDto;
import course.linkflower.link.oneframework.house.dto.thirdAuth.DeleteThirdAuthDto;
import course.linkflower.link.oneframework.house.dto.thirdAuth.SearchThirdAuthDto;
import course.linkflower.link.oneframework.house.dto.thirdAuth.UpdateThirdAuthDto;
import course.linkflower.link.oneframework.house.vo.publisher.PublisherVo;

public interface ThirdAuthService {
    void addThirdAuth (AddThirdAuthDto addThirdAuthDto);
    void updateThirdAuth(UpdateThirdAuthDto updateThirdAuthDto);
    void deleteThirdAuth (DeleteThirdAuthDto deleteThirdAuthDto);
    PublisherVo getThirdAuthById(SearchThirdAuthDto searchThirdAuthDto);
}
