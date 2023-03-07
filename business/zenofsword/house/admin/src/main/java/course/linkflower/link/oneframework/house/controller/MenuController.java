package course.linkflower.link.oneframework.house.controller;

import course.linkflower.link.oneframework.common.model.Result;
import course.linkflower.link.oneframework.house.dto.base.CodeDto;
import course.linkflower.link.oneframework.house.dto.menu.AddMenuDto;
import course.linkflower.link.oneframework.house.dto.menu.DeleteMenuDto;
import course.linkflower.link.oneframework.house.dto.menu.SearchMenuDto;
import course.linkflower.link.oneframework.house.dto.menu.UpdateMenuDto;
import course.linkflower.link.oneframework.house.service.MenuService;
import course.linkflower.link.oneframework.house.vo.menu.MenuTreeVo;
import course.linkflower.link.oneframework.house.vo.menu.MenuVo;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@Slf4j
@RequestMapping("/menu")
@RefreshScope
public class MenuController {
    @Autowired
    MenuService menuService;
//    @PostMapping("/listMenuTreeByCode")
//    public Result<MenuTreeVo> listMenuTreeByCode (@RequestBody CodeDto codeDto){
//        return menuService.listMenuTreeByCode(codeDto.getCode()) ;
//    }
    @PostMapping("/add")
    public Result<MenuVo> add(@Validated @RequestBody AddMenuDto addMenuDto) {
        return menuService.addMenu(addMenuDto);
    }

    @PostMapping("/delete")
    public Result delete(@RequestBody DeleteMenuDto deleteMenuDto) {
        return menuService.deleteMenu(deleteMenuDto);
    }

    @PostMapping("/update")
    public Result<MenuVo> update(@RequestBody UpdateMenuDto updateMenuDto) {
        return menuService.updateMenu(updateMenuDto);
    }

    @PostMapping("/search")
    public Result<MenuVo> search(@RequestBody SearchMenuDto searchMenuDto) {
        return menuService.getMenuById(searchMenuDto);
    }
}
