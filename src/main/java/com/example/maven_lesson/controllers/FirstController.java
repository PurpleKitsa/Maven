package com.example.maven_lesson.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class FirstController {
    @GetMapping
    public String infoApp() {
        return "Приложение запущено";
    }

    @GetMapping("/info")
    public String info() {
        return "Ученик: Дмитрий" + " Название проекта: Maven Lesson" + " 17.02.2023" + "Описание проекта: Практика по работе с Maven";
    }
}