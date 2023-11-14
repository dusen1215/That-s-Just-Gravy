package com.jordandusenbury.That.s.Just.Gravy.entity;

import jakarta.persistence.*;



@Entity
@Table(name="gravyRecipes")
public class GravyRecipe {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;
    @Column(name = "gravyRecipe")
    private String gravyRecipe;

    private boolean validated;

    public GravyRecipe(String gravyRecipe) {
        this.gravyRecipe = gravyRecipe;
    }

    public GravyRecipe() {

    }

    public String getGravyRecipe() {
        return gravyRecipe;
    }

    public void setGravyRecipe(String gravyRecipe) {
        this.gravyRecipe = gravyRecipe;
    }

    @Override
    public String toString() {
        return "Recipe=" + gravyRecipe + "]";
    }
}
