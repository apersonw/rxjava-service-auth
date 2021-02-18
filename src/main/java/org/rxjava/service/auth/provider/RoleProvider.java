package org.rxjava.service.auth.provider;

import org.rxjava.service.auth.entity.Role;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageImpl;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("roles")
public class RoleProvider {

    /**
     * 查询角色信息
     */
    @GetMapping(value = "/{id}")
    @PreAuthorize("@el.check('roles:list')")
    public Role role(@PathVariable String id) {
        return new Role();
    }

    /**
     * 导出角色数据
     */
    @GetMapping(value = "/download")
    @PreAuthorize("@el.check('role:list')")
    public void download() {
    }

    /**
     * 查询所有角色
     */
    @GetMapping(value = "/allList")
    @PreAuthorize("@el.check('roles:list','user:add','user:edit')")
    public List<Role> allList() {
        return new ArrayList<>();
    }

    /**
     * 查询角色列表
     */
    @GetMapping
    @PreAuthorize("@el.check('roles:list')")
    public Page<Role> list() {
        return new PageImpl<>(new ArrayList<>());
    }

    /**
     * 获取用户级别
     */
    @GetMapping(value = "/level")
    public int level() {
        return 1;
    }

    /**
     * 新增角色
     */
    @PostMapping
    @PreAuthorize("@el.check('roles:add')")
    public Role postRole() {
        return new Role();
    }

    /**
     * 修改角色
     */
    @PutMapping
    @PreAuthorize("@el.check('roles:edit')")
    public Role putRole() {
        return new Role();
    }

    /**
     * 修改角色菜单
     */
    @PutMapping(value = "/menu")
    @PreAuthorize("@el.check('roles:edit')")
    public void updateMenu() {
    }

    /**
     * 删除角色
     */
    @DeleteMapping
    @PreAuthorize("@el.check('roles:del')")
    public void deleteRole() {

    }
}
