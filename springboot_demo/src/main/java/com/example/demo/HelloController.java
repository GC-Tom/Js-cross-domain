package com.example.demo;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletResponse;

@RestController
public class HelloController {
    @RequestMapping(value = "/hello", method = RequestMethod.GET)
    public String hello(HttpServletResponse response, Integer advancedApplyId) {
        response.setHeader("Access-Control-Allow-Origin", "*");
        return "Hello Spring Boot!!";
    }
}
