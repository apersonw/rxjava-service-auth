package org.rxjava.service.auth.provider;

import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("jobs")
public class JobController {
    /**
     * 导出岗位数据
     */
    @GetMapping(value = "/download")
    @PreAuthorize("@el.check('job:list')")
    public void download() {
    }

    /**
     * 查询岗位
     */
    @GetMapping
    @PreAuthorize("@el.check('job:list','user:list')")
    public void query() {
    }

    /**
     * 新增岗位
     */
    @PostMapping
    @PreAuthorize("@el.check('job:add')")
    public void create() {

    }

    /**
     * 修改岗位
     */
    @PutMapping
    @PreAuthorize("@el.check('job:edit')")
    public void update() {
    }

    /**
     * 删除岗位
     */
    @DeleteMapping
    @PreAuthorize("@el.check('job:del')")
    public void delete() {
    }
}
