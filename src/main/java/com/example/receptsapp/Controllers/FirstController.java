package com.example.receptsapp.Controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class FirstController {

    @GetMapping
    public String txt(){
        return "Приложение запущено.";
    }

    @GetMapping("/info")
    public String info(){
        return "Меня зовут Алиса. Проект ReceptsApplication. Дата создания 16.12.2022. Приложение для хранения рецептов.";
    }
}
