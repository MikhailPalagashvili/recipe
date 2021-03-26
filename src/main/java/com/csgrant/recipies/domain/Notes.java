package com.csgrant.recipies.domain;

import lombok.Value;

import javax.persistence.*;

@Value
@Entity
public class Notes {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Long id;
    @OneToOne
    Recipe recipe;
    @Lob
    String recipeNotes;
}
