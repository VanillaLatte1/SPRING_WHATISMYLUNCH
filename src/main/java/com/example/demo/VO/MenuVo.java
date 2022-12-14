package com.example.demo.VO;

import lombok.*;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Data
@AllArgsConstructor
@NoArgsConstructor(access = AccessLevel.PROTECTED)
@Entity(name="tb_menu")
public class MenuVo {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String menu;
    private int price;
    private String img;

    @Builder
    public MenuVo(String menu, int price, String img){
        this.menu = menu;
        this.price = price;
        this.img = img;
    }
}
