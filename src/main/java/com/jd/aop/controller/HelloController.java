package com.jd.aop.controller;

import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@Slf4j
public class HelloController {


    @ResponseBody
    @GetMapping({"/index", "/"})
    public String index() {
        log.info("index fist");
        return "index";
    }

}
