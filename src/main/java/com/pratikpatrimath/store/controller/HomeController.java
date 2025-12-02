package com.pratikpatrimath.store.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@Controller
public class HomeController {

    @Value("${spring.application.name}")
    private String appName;

    @RequestMapping("/")
    public String index(){
        String viewName= getViewMessage();
        System.out.println("View Name: " + viewName);
        System.out.println("Application Name: " + appName);
        return viewName;
    }


    private String getViewMessage(){
        return "index";
    }
}
