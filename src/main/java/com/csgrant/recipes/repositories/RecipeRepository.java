package com.csgrant.recipes.repositories;

import com.csgrant.recipes.domain.Recipe;
import org.springframework.data.repository.CrudRepository;

public interface RecipeRepository extends CrudRepository<Recipe, Long> {
}
