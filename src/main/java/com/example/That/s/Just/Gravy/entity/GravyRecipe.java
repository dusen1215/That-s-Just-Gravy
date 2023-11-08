package com.example.That.s.Just.Gravy.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Getter
@Setter
@NoArgsConstructor
public class GravyRecipe {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;

    private String gravyRecipe;
}
