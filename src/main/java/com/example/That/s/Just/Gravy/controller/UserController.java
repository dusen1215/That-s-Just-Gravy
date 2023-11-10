package com.example.That.s.Just.Gravy.controller;

import com.example.That.s.Just.Gravy.DTO.UserDTO;
import com.example.That.s.Just.Gravy.entity.User;
import com.example.That.s.Just.Gravy.myservices.UserServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import java.util.HashMap;
import java.util.Map;

@Controller
public class UserController {
    @Autowired
    private UserServices userService;
    private Map<Long, User> userMap = new HashMap<>();

    @GetMapping("/userform")
    public String userForm(Model model) {


        model.addAttribute("user", new UserDTO());

        return "userform";
    }

    @PostMapping("/addUser")
    public String processForm(@ModelAttribute("user") User user, ModelMap model) {


            userService.addUser(user);
            return "index";
    }
}
