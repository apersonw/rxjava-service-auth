package org.rxjava.service.auth.provider;

import org.rxjava.service.auth.entity.Resource;
import org.rxjava.service.auth.repository.ResourceRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class ResourceProvider {
    @Autowired
    private ResourceRepository resourceRepository;

    @GetMapping("resourceList")
    public List<Resource> getList() {
        return resourceRepository.findAll();
    }

    @GetMapping("resource")
    public Resource save() {
        Resource resource = new Resource();
        return resourceRepository.save(resource);
    }
}
