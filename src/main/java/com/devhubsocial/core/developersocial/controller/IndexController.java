package com.devhubsocial.core.developersocial.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import reactor.core.publisher.Flux;

@Controller
public class IndexController {


    @GetMapping("/")
    @ResponseBody
    public Flux<String> getRoot() {
        return Flux.just("Welecome to devhub social.");
    }

}
