package com.max.controller;

import org.springframework.util.StringUtils;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MyNameController {

    @RequestMapping("/myname")
    public String myName(@RequestParam(required = false, value = "name") String name) {
        if (!StringUtils.isEmpty(name)) {
            return "My name is " + name;
        } else return "I don't know your name";
    }
}
