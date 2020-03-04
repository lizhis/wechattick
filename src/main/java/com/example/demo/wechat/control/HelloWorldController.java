package com.example.demo.wechat.control;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/wechat")
public class HelloWorldController {
    @PostMapping("/hello")
    public String index() {
        return "Hello World!!!";
    }
}
