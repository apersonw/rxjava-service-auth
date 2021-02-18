package org.rxjava.service.auth.provider;

import org.rxjava.service.auth.entity.Menu;
import org.springframework.data.domain.Page;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

@RestController
@RequestMapping("menus")
public class MenuProvider {

    /**
     * 导出菜单数据
     */
    @GetMapping(value = "/download")
    @PreAuthorize("@el.check('menu:list')")
    public void download() {
    }

    /**
     * 获取前端所需菜单
     */
    @GetMapping(value = "/front")
    public List<Menu> frontMenus() {
        return new ArrayList<>();
    }

    /**
     * 返回当前全部的菜单
     */
    @GetMapping(value = "/childMenus")
    @PreAuthorize("@el.check('menu:list','roles:list')")
    public List<Menu> query(@RequestParam String parentId) {
        return new ArrayList<>();
    }

    /**
     * 根据菜单ID返回所有子节点ID，包含自身ID
     */
    @GetMapping(value = "/childIds")
    @PreAuthorize("@el.check('menu:list','roles:list')")
    public List<String> child(@RequestParam String parentId) {
        return new ArrayList<>();
    }

    /**
     * 查询菜单
     */
    @GetMapping
    @PreAuthorize("@el.check('menu:list')")
    public Page<Menu> list() {
        return Page.empty();
    }

    /**
     * 查询菜单:根据ID获取同级与上级数据
     */
    @PostMapping("/superior")
    @PreAuthorize("@el.check('menu:list')")
    public List<Menu> getSuperior(@RequestBody List<String> ids) {
        return new ArrayList<>();
    }

    /**
     * 新增菜单
     */
    @PostMapping
    @PreAuthorize("@el.check('menu:add')")
    public Menu create(@Validated @RequestBody Menu resources) {
        return new Menu();
    }

    /**
     * 修改菜单
     */
    @PutMapping
    @PreAuthorize("@el.check('menu:edit')")
    public Menu update() {
        return new Menu();
    }

    /**
     * 删除菜单
     */
    @DeleteMapping
    @PreAuthorize("@el.check('menu:del')")
    public void delete(@RequestBody Set<Long> ids) {
    }
}
