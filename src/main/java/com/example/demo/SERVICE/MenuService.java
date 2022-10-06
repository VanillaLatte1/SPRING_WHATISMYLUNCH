package com.example.demo.SERVICE;

import com.example.demo.REPO.MenuRepository;
import com.example.demo.VO.MenuVo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class MenuService {
    //전체 데이터 조회

    @Autowired
    private MenuRepository menuRepository;

    public List<MenuVo> findAll() {
        List<MenuVo> menu = new ArrayList<>();
        menuRepository.findAll().forEach(e -> menu.add(e));
        return menu;
    }

    //데이터 넣기(insert)
    public Long save(MenuVo menu)
    {
        return menuRepository.save(menu).getId();
    }
    public List<MenuVo> findRandMenu()
    {
        return menuRepository.findRandMenu();
    }
}
