package com.jordandusenbury.That.s.Just.Gravy.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class CustomRecipe {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;

    private String customRecipe;

    private boolean validated;
}
