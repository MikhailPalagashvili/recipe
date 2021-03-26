package com.csgrant.recipies.domain;

import lombok.Value;

import javax.persistence.*;

@Entity
@Value
public class Recipe {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Long id;
    String description;
    Integer prepTime;
    Integer cookTime;
    Integer servings;
    String source;
    String url;
    String directions;
    //    private Difficulty difficulty;
    @Lob
    Byte[] image;
    @OneToOne(cascade = CascadeType.ALL)
    Notes notes;

}
