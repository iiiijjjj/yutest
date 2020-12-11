package com.yu.pro.yutest;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.ServletComponentScan;

@SpringBootApplication
@ServletComponentScan
public class YutestApplication {

    public static void main(String[] args) {
        SpringApplication.run(YutestApplication.class, args);
    }

}
