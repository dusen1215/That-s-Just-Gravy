package com.example.That.s.Just.Gravy.myservices;

import com.example.That.s.Just.Gravy.entity.CustomRecipe;
import com.example.That.s.Just.Gravy.entity.User;
import com.example.That.s.Just.Gravy.repository.CustomRecipeRepository;
import com.example.That.s.Just.Gravy.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service
public class CustomRecipeServices {
    @Autowired
    private CustomRecipeRepository customRecipeRepository;

    public List<CustomRecipe> getCustomRecipes() {
        List<CustomRecipe> customRecipes = new ArrayList<CustomRecipe>();
        customRecipeRepository.findAll().forEach(customRecipes::add);
        return customRecipes;
    }

    public Optional<CustomRecipe> getCustomRecipeById(Long id) {
        return customRecipeRepository.findById(id);
    }


    public void addCustomRecipe(CustomRecipe customRecipe) {
        customRecipeRepository.save(customRecipe);
    }

    public void updateCustomRecipe(long id, CustomRecipe customRecipe) {
        Optional<CustomRecipe> customRecipeData = customRecipeRepository.findById(id);

        if (customRecipeData.isPresent()) {
            CustomRecipe _custom = customRecipeData.get();
            _custom.setCustomRecipe(customRecipe.getCustomRecipe());
            customRecipeRepository.save(_custom);
        }
    }

    public void deleteUser(long id) {
        customRecipeRepository.deleteById(id);
    }

    public void deleteAllUsers() {
        customRecipeRepository.deleteAll();
    }
}
