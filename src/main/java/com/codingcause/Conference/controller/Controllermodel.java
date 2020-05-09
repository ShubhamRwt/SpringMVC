package com.codingcause.Conference.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.Map;
@Controller
public class Controllermodel {
    @GetMapping("greeting")
    public String greeting(Map<String, Object> model){

        model.put("message","Shubham");
        return "greeting";
    }

}
