package com.seonghyun.blog.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class IndexController {

    @GetMapping("/")
    public String index() {
        return "blogindex";
    }

    @GetMapping("/post")
    public String post(){
        return "post";
    }
}
