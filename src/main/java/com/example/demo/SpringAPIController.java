package com.example.demo;

import com.example.demo.SERVICE.MenuService;
import com.example.demo.VO.MenuVo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class SpringAPIController {
    @Autowired
    private MenuService menuService;

    @GetMapping("api/v1/menulist")
    public ResponseEntity<List<MenuVo>> getAllMenu() {
        List<MenuVo> list = menuService.findAll();
        return new ResponseEntity<List<MenuVo>>(list, HttpStatus.OK);
    }
    @PostMapping("/api/v1/insert")
    public Long save(@RequestBody MenuVo menu) {
        return menuService.save(menu);
    }
    @GetMapping("api/v1/recommend")
    public ResponseEntity<List<MenuVo>> getRecommendMenu() {
        List<MenuVo> list = menuService.findRandMenu();
        return new ResponseEntity<List<MenuVo>>(list, HttpStatus.OK);
    }
}
