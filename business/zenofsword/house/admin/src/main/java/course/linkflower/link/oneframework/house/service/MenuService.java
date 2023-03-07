package course.linkflower.link.oneframework.house.service;

import course.linkflower.link.oneframework.common.model.Result;
import course.linkflower.link.oneframework.house.dto.menu.AddMenuDto;
import course.linkflower.link.oneframework.house.dto.menu.DeleteMenuDto;
import course.linkflower.link.oneframework.house.dto.menu.SearchMenuDto;
import course.linkflower.link.oneframework.house.dto.menu.UpdateMenuDto;
import course.linkflower.link.oneframework.house.vo.menu.MenuTreeVo;
import course.linkflower.link.oneframework.house.vo.menu.MenuVo;

public interface MenuService {
    Result<MenuVo> addMenu(AddMenuDto addMenuDto);
    Result<MenuVo> updateMenu(UpdateMenuDto updateMenuDto);
    Result deleteMenu(DeleteMenuDto deleteMenuDto);
    Result<MenuVo> getMenuById(SearchMenuDto searchMenuDto);
//    Result<MenuTreeVo> listMenuTreeByCode(String code);
}
