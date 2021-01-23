package org.rxjava.service.auth.provider;

import org.rxjava.service.auth.entity.Menu;
import org.rxjava.service.auth.repository.MenuRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class MenuProvider {
    @Autowired
    private MenuRepository menuRepository;

    @GetMapping("menuList")
    public List<Menu> getList() {
        return menuRepository.findAll();
    }

    @GetMapping("menu")
    public Menu save() {
        Menu menu = new Menu();
        return menuRepository.save(menu);
    }
}
