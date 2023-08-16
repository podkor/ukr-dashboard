package com.podkor.ukrdashboard.controller;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/app")
@RequiredArgsConstructor
public class CommonController {

    @GetMapping("/login")
    public String login() {
        return "login";
    }
}