package com.example.That.s.Just.Gravy.entity;

import jakarta.persistence.*;
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

    private boolean validated;
}
