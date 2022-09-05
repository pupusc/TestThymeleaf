package com.psc.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created with IntelliJ IDEA.
 *
 * @Author: pushicheng
 * @Date: 2022/08/24/17:11
 * @Description:
 */
@RestController
public class LoginController {
    @PostMapping("/login")
    public String login() {
        return "index";
    }
    @GetMapping("/error")
    public String error() {
        return "error";
    }
}
