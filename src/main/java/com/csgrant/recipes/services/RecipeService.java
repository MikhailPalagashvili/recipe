package com.csgrant.recipes.services;

import com.csgrant.recipes.domain.Recipe;

import java.util.Set;

public interface RecipeService {

    Set<Recipe> getRecipes();
}