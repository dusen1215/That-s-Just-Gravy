package com.jordandusenbury.That.s.Just.Gravy.myservices;

import com.jordandusenbury.That.s.Just.Gravy.entity.GravyRecipe;
import com.jordandusenbury.That.s.Just.Gravy.repository.GravyRecipeRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service
public class GravyRecipeServices {
    @Autowired
    private GravyRecipeRepository gravyRecipeRepository;

    public java.util.List<GravyRecipe> getGravyRecipes() {
        List<GravyRecipe> gravyRecipes = new ArrayList<GravyRecipe>();
        gravyRecipeRepository.findAll().forEach(gravyRecipes::add);
        return gravyRecipes;
    }

    /*public java.util.List<User> getUsers() {
        List<User> users = new ArrayList<User>();
        userRepository.findAll().forEach(users::add);
        return users;
    }*/

    public Optional<GravyRecipe> getGravyRecipeById(Long id) {
        return gravyRecipeRepository.findById(id);
    }


    public void addGravyRecipe(GravyRecipe gravyRecipe) {
        gravyRecipeRepository.save(gravyRecipe);
    }

    public void updateGravyRecipe(long id, GravyRecipe gravyRecipe) {
        Optional<GravyRecipe> gravyRecipeData = gravyRecipeRepository.findById(id);

        if (gravyRecipeData.isPresent()) {
            GravyRecipe _gravy = gravyRecipeData.get();
            _gravy.setGravyRecipe(gravyRecipe.getGravyRecipe());
            gravyRecipeRepository.save(_gravy);
        }
    }


    public void deleteGravyRecipe(long id) {
        gravyRecipeRepository.deleteById(id);
    }

    public void deleteAllGravyRecipe() {
        gravyRecipeRepository.deleteAll();
    }


}
