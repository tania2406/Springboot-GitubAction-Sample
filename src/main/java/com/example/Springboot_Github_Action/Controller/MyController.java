package com.example.Springboot_Github_Action.Controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MyController
{
    @RequestMapping("/test")
    public String test()
    {
        return "test for github action";
    }
}
