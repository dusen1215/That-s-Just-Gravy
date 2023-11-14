package com.example.That.s.Just.Gravy.controller;

import com.example.That.s.Just.Gravy.DTO.GravyRecipeDTO;
import com.example.That.s.Just.Gravy.entity.GravyRecipe;
import com.example.That.s.Just.Gravy.myservices.GravyRecipeServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import java.util.HashMap;
import java.util.Map;

//allows confirmation and saves the user's input for their found Gravy recipes
@Controller
public class GravyRecipeController {
    @Autowired
    private GravyRecipeServices gravyRecipeService;
    private Map<Long, GravyRecipe> gravyRecipeMap = new HashMap<>();

   @GetMapping("/gravyBlog")
    public String gravyForm(Model model) {


        model.addAttribute("gravyRecipe", new GravyRecipeDTO());

        return "gravyBlog";
    }

    @PostMapping("/addGravyRecipe")
    public String gravyProcessForm(@ModelAttribute("cr") GravyRecipe gravyRecipe, ModelMap model) {


        gravyRecipeService.addGravyRecipe(gravyRecipe);
        return "index";
    }

}
