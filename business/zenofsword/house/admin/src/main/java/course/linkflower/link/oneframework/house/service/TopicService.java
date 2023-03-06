package course.linkflower.link.oneframework.house.service;

import course.linkflower.link.oneframework.common.model.Result;
import course.linkflower.link.oneframework.house.dto.base.IdDto;

import course.linkflower.link.oneframework.house.dto.topic.AddTopicDto;
import course.linkflower.link.oneframework.house.dto.topic.DeleteTopicDto;
import course.linkflower.link.oneframework.house.dto.topic.SearchTopicDto;
import course.linkflower.link.oneframework.house.dto.topic.UpdateTopicDto;
import course.linkflower.link.oneframework.house.vo.topic.TopicTreeVo;
import course.linkflower.link.oneframework.house.vo.topic.TopicVo;


public interface TopicService {
    Result<TopicVo> addTopic (AddTopicDto addTopicDto);
    Result<TopicVo> updateTopic(UpdateTopicDto updateTopicDto);
    Result deleteTopic (DeleteTopicDto deleteTopicDto);
    Result<TopicVo> getTopicById(long id);
    Result<TopicTreeVo> listTopicTreeByCode(String code);
    TopicVo getTopicByIdIn(long id);
}
