package com.example.accountdemo.controller;

import com.example.accountdemo.dto.ExecutiveDto;
import com.example.accountdemo.model.User;
import com.example.accountdemo.service.ExecutiveService;
import com.example.accountdemo.service.UserService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import java.util.Optional;

@Slf4j
@Controller
public class LoginController {

    private final UserService userService;

    public LoginController(UserService userService) {
        this.userService = userService;
    }

    @Value("${spring.application.name}")
    String appName;

    @GetMapping("/")
    public String homePage(Model model) {
        model.addAttribute("appName", appName);
        log.info("login page loaded");
        return "home";
    }

    @PostMapping("/login")
    public String homePage(ExecutiveDto logInData, Model model) {

        return  userService.validateLogIn(logInData, model);
    }
}
