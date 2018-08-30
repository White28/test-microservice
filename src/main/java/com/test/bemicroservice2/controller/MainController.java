package com.test.bemicroservice2.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@RestController
@RequestMapping("/")
public class MainController {

    @GetMapping
    public String getSpecificScheduleByDate(HttpServletRequest httpServletRequest, HttpServletResponse httpServletResponse) {
        return "It's working!!!";
    }
}
