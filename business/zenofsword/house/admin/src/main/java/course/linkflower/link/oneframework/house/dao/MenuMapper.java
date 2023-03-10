package course.linkflower.link.oneframework.house.dao;

import course.linkflower.link.oneframework.house.model.Menu;
import course.linkflower.link.oneframework.house.vo.menu.MenuTreeVo;
import course.linkflower.link.oneframework.house.vo.topic.TopicTreeVo;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;

@Mapper
public interface MenuMapper {
    int save(Menu menu);
    int update(Menu menu);
    int delete(@Param("id") long id);
    Menu getMenuById(@Param("id") long id);
    int countByCode(@Param("code") String code);
    int countByCodeAndId(@Param("code") String code);
    List<MenuTreeVo> listMenuTreeByParentCode(@Param("code") String code);
}
