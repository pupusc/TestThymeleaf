package com.psc;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("com.psc.dao")
public class TestThymeleafApplication {

    public static void main(String[] args) {
        SpringApplication.run(TestThymeleafApplication.class, args);
    }

}
