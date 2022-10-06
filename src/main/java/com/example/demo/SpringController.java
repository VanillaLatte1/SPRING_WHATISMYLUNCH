package com.example.demo;

import com.example.demo.DTO.TbMenu;
import com.example.demo.SERVICE.MenuService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.ResponseBody;


@Controller
public class SpringController {

    @Autowired
    private MenuService menuService;

    //index
    @GetMapping("/")
    public String index(){
        return "index";
    }

    //insert
    @GetMapping("/insert")
    public String insert(){
        return "insert";
    }
    @PostMapping("/insert_proc")        //form - method / 보내는 방식이 get인지 post인지 확인
    @ResponseBody
    public TbMenu insert_proc(@ModelAttribute TbMenu tbmenu){
        System.out.println(tbmenu.getMenu());
        System.out.println(tbmenu.getPrice());
        System.out.println(tbmenu.getImg());
        return tbmenu;
    }

    //select
    @GetMapping("/select")
    public String select(Model model) {
        model.addAttribute("list", menuService.findAll());
        return "select";
    }

    //recommand
    @GetMapping("/recommend")
    public String recommend(Model model) {
        return "recommend";
    }
}
