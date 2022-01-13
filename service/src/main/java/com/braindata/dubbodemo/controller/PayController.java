package com.braindata.dubbodemo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;


@RestController
@RequestMapping(value = "/pay")
public class PayController {

    @GetMapping(value = "/toPay")
    public String pay(){
        return "success!";
    }
}
