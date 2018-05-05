package com.gowhich.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;;

@Controller
public class WelcomeController {
    @RequestMapping("/")
    public String home() {
        return "Welcome Spring Boot With Maven Class!";
    }

    @RequestMapping("/web/user")
    public String webUser(Model model) {
        model.addAttribute("title", "A User");
        return "web/user";
    }
    
    @RequestMapping("/web/user/detail")
    public String webUserDetail() {
    	return "web/user/detail";
    }
}
