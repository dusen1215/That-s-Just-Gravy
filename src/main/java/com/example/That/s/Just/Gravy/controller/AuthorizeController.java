package com.example.That.s.Just.Gravy.controller;

import org.springframework.web.bind.annotation.GetMapping;

public class AuthorizeController {
    @GetMapping("/userform")
    public String loginPage() {

        return "index";
    }

}