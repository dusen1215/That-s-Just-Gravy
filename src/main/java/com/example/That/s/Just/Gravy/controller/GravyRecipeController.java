package com.example.That.s.Just.Gravy.controller;

import com.example.That.s.Just.Gravy.DTO.GravyRecipeDTO;
import com.example.That.s.Just.Gravy.DTO.UserDTO;
import com.example.That.s.Just.Gravy.entity.GravyRecipe;
import com.example.That.s.Just.Gravy.entity.User;
import com.example.That.s.Just.Gravy.myservices.GravyRecipeServices;
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
public class GravyRecipeController {
    @Autowired
    private GravyRecipeServices gravyRecipeService;
    private Map<Long, GravyRecipe> gravyRecipeMap = new HashMap<>();

    @GetMapping("/gravy-blog")
    public String gravyForm(Model model) {


        model.addAttribute("gravyRecipe", new GravyRecipeDTO());

        return "gravy-blog";
    }

    @PostMapping("/addGravyRecipe")
    public String gravyprocessForm(@ModelAttribute("gravyRecipe") GravyRecipe gravyRecipe, ModelMap model) {

        gravyRecipeService.addGravyRecipe(gravyRecipe);
        return "gravy-blog";
    }

}
