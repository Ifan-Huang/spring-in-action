package com.codeforc.spring.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

/**
 * The default url mapping in this project. supply a default homepage for website.
 * @author: Ifan·Huang
 **/
@Controller
public class HomeController {

    @GetMapping("/")
    public String home() {
        return "login";
    }
}
