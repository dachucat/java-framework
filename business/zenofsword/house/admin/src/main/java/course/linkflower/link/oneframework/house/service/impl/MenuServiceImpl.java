package course.linkflower.link.oneframework.house.service.impl;

import course.linkflower.link.oneframework.common.constant.BaseErrorContst;
import course.linkflower.link.oneframework.common.model.Result;
import course.linkflower.link.oneframework.house.dao.MenuMapper;
import course.linkflower.link.oneframework.house.dto.base.CodeDto;
import course.linkflower.link.oneframework.house.dto.menu.AddMenuDto;
import course.linkflower.link.oneframework.house.dto.menu.DeleteMenuDto;
import course.linkflower.link.oneframework.house.dto.menu.SearchMenuDto;
import course.linkflower.link.oneframework.house.dto.menu.UpdateMenuDto;
import course.linkflower.link.oneframework.house.model.Menu;
import course.linkflower.link.oneframework.house.service.MenuService;
import course.linkflower.link.oneframework.house.vo.menu.MenuTreeVo;
import course.linkflower.link.oneframework.house.vo.menu.MenuVo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class MenuServiceImpl implements MenuService {
    @Autowired
    MenuMapper menuMapper;

    @Override
    public Result<MenuVo> addMenu(AddMenuDto addMenuDto) {
        Menu menu = addMenuDto.toModel();
        if (addMenuDto.getCode()!=null){
            if (menuMapper.countByCode(addMenuDto.getCode())!=0){
                Result.of(null, BaseErrorContst.BaseErrorTimeParamDuplicateError,
                        BaseErrorContst.BaseMsgTimeParamsDuplicateError);
            }
        }
        menuMapper.save(menu);
        return Result.succeed(new MenuVo().loadFrom(menu));
    }

    @Override
    public Result<MenuVo> updateMenu(UpdateMenuDto updateMenuDto) {
        Menu m = updateMenuDto.toModel();
        menuMapper.update(m);
        return Result.succeed(new MenuVo().loadFrom(m));
    }

    @Override
    public Result deleteMenu(DeleteMenuDto deleteMenuDto) {
        return Result.succeed(menuMapper.delete(Long.parseLong(deleteMenuDto.getId())));
    }

    @Override
    public Result<MenuVo> getMenuById(SearchMenuDto searchMenuDto) {
        return Result.succeed(new MenuVo().loadFrom(menuMapper.getMenuById(Long.parseLong(searchMenuDto.getId()))));
    }

    @Override
    public Result<MenuTreeVo> listMenuTreeByCode(String code) {
        List<MenuTreeVo> topics = menuMapper.listMenuTreeByParentCode(code);
        return Result.succeed(MenuTreeVo.loadFromList(topics));
    }
}
