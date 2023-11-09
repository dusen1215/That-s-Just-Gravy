package com.example.That.s.Just.Gravy.repository;
import com.example.That.s.Just.Gravy.entity.GravyRecipe;
import com.example.That.s.Just.Gravy.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface GravyRecipeRepository extends JpaRepository<GravyRecipe, Long> {

    List<GravyRecipe> findByValidated(boolean validated);
}
