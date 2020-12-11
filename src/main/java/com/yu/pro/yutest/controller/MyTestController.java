package com.yu.pro.yutest.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author YULY
 * @version 1.0
 * @date 2020/12/10 0010 下午 3:56
 */

@RestController
public class MyTestController {
    @GetMapping(value = {"/hello"})
    public String greetion(){
        return "Hello,World";
    }
}
