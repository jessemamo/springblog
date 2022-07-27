package com.example.codeup.springblog;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class MathController {
//             /add/3/and/4
//            /subtract/3/from/10
//            /multiply/4/and/5
//            /divide/6/by/3

    @RequestMapping(path = "/add/{num1}/and/{num2}")
    @ResponseBody
    public int add(@PathVariable int num1, @PathVariable int num2) {
        return num1 + num2;
    }
    @RequestMapping(path = "/subtract/{num2}/from/{num1}")
    @ResponseBody
    public int subtract(@PathVariable int num1, @PathVariable int num2) {
        return num1 - num2;
    }
    @RequestMapping(path = "/multiply/{num1}/and/{num2}")
    @ResponseBody
    public int multiply(@PathVariable int num1, @PathVariable int num2) {
        return num1 * num2;
    }
    @RequestMapping(path = "/divide/{num1}/by/{num2}")
    @ResponseBody
    public int divide(@PathVariable int num1, @PathVariable int num2) {
        return num1 / num2;
    }
}
