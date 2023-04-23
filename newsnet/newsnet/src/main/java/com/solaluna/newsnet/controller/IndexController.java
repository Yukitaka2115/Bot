package com.solaluna.newsnet.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/main")
public class IndexController {
//    @GetMapping
//    public String getIndex(){
//        return "main";
//    }
    @RequestMapping
    public String getIndex1(){
        return "index";
    }
}
