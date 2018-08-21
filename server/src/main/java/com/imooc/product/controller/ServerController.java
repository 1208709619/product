package com.imooc.product.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ServerController {


    @GetMapping("/msg")
    public String getProductMsg(){
        return "this is products' msg";
    }
}
