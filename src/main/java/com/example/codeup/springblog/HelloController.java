package com.example.codeup.springblog;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class HelloController {
    @GetMapping("/hello")
    @ResponseBody
    public String hello() {
        return "Hello from Spring!";
    }

    @GetMapping("/test")
    @ResponseBody
    public String test() {
        return "this is a different mapping";
    }

    @GetMapping("/landing")
    @ResponseBody
    public String test2() {
        return "this is the landing page";
    }
}
