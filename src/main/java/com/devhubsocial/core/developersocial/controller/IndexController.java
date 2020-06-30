package com.devhubsocial.core.developersocial.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class IndexController {

    @GetMapping("/test")
    @ResponseBody
    public String welcome() {
        return "Welcome to Devhub Social";
    }
}
