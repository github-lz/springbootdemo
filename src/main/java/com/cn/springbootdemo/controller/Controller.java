package com.cn.springbootdemo.controller;

import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@org.springframework.stereotype.Controller
public class Controller {
    @GetMapping("hello")
    public String hello(@RequestParam(name="name")String name, Model model){
        model.addAttribute("name",name);
        return "greeting";
    }

}
