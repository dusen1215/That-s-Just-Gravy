package com.jordandusenbury.That.s.Just.Gravy.controller;


import com.jordandusenbury.That.s.Just.Gravy.DTO.CustomRecipeDTO;
import com.jordandusenbury.That.s.Just.Gravy.entity.CustomRecipe;
import com.jordandusenbury.That.s.Just.Gravy.myservices.CustomRecipeServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import java.util.HashMap;
import java.util.Map;

//allows confirmation and saves the user's input for their custom recipes
@Controller
public class CustomRecipeController {
    @Autowired
    private CustomRecipeServices customRecipeService;
    private Map<Long, CustomRecipe> customRecipeMap = new HashMap<>();

    @GetMapping("/gravyTime")
    public String customForm(Model model) {


        model.addAttribute("customRecipe", new CustomRecipeDTO());

        return "gravyTime";
    }

    @PostMapping("/addCustomRecipe")
    public String customProcessForm(@ModelAttribute("cr") CustomRecipe customRecipe, ModelMap model) {


        customRecipeService.addCustomRecipe(customRecipe);
        return "index";
    }
}
