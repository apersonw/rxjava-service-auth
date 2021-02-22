package org.rxjava.service.auth.provider;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletResponse;
import java.util.*;

/**
 * 部门管理
 */
@RestController
@RequestMapping("departements")
public class DepartementProvider {
    /**
     * 导出部门数据
     */
    @GetMapping(value = "/download")
    @PreAuthorize("@el.check('dept:list')")
    public void download() throws Exception {
    }

    /**
     * 查询部门
     */
    @GetMapping
    @PreAuthorize("@el.check('user:list','dept:list')")
    public void query() {
    }

    /**
     * 查询部门:根据ID获取同级与上级数据
     */
    @PostMapping("/superior")
    @PreAuthorize("@el.check('user:list','dept:list')")
    public void getSuperior() {
    }

    /**
     * 新增部门
     */
    @PostMapping
    @PreAuthorize("@el.check('dept:add')")
    public void create(){

    }

    /**
     * 修改部门
     */
    @PutMapping
    @PreAuthorize("@el.check('dept:edit')")
    public void update(){
    }

    /**
     * 删除部门
     */
    @DeleteMapping
    @PreAuthorize("@el.check('dept:del')")
    public void delete(){
    }
}
