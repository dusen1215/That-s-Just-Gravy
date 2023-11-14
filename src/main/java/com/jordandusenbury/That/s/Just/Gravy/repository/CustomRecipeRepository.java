package com.jordandusenbury.That.s.Just.Gravy.repository;

import com.jordandusenbury.That.s.Just.Gravy.entity.CustomRecipe;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface CustomRecipeRepository extends JpaRepository<CustomRecipe, Long> {
    List<CustomRecipe> findByValidated(boolean validated);
}
