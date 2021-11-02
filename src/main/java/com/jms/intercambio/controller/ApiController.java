package com.jms.intercambio.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletResponse;

@Controller
public class ApiController {

    @GetMapping({"/","/login"})
    public String index() {
        return "index";
    }

    @PostMapping("/menu")
    public String menu() {
        return "menu";
    }



}
