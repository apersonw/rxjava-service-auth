package org.rxjava.service.auth.provider;

import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.*;

/**
 * 字典
 */
@RestController
@RequestMapping("dicts")
public class DictProvider {
    /**
     * 导出字典数据
     */
    @GetMapping(value = "/download")
    @PreAuthorize("@el.check('dict:list')")
    public void download() {
    }

    /**
     * 查询字典
     */
    @GetMapping(value = "/all")
    @PreAuthorize("@el.check('dict:list')")
    public void queryAll() {
    }

    /**
     * 查询字典分页
     */
    @GetMapping
    @PreAuthorize("@el.check('dict:list')")
    public void query() {
    }

    /**
     * 新增字典
     */
    @PostMapping
    @PreAuthorize("@el.check('dict:add')")
    public void create() {
    }

    /**
     * 修改字典
     */
    @PutMapping
    @PreAuthorize("@el.check('dict:edit')")
    public void update() {
    }

    /**
     * 删除字典
     */
    @DeleteMapping
    @PreAuthorize("@el.check('dict:del')")
    public void delete() {
    }

    /**
     * 查询字典详情
     */
    @GetMapping
    public void queryDetail() {
    }

    /**
     * 查询多个字典详情
     */
    @GetMapping(value = "/map")
    public void getDictDetailMaps() {
    }

    /**
     * 新增字典详情
     */
    @PostMapping
    @PreAuthorize("@el.check('dict:add')")
    public void createDetail() {

    }

    /**
     * 修改字典详情
     */
    @PutMapping
    @PreAuthorize("@el.check('dict:edit')")
    public void updateDetail() {
    }

    /**
     * 删除字典详情
     */
    @DeleteMapping(value = "/{id}")
    @PreAuthorize("@el.check('dict:del')")
    public void deleteDetail() {
    }
}
