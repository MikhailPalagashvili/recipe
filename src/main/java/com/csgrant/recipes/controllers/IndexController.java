package com.csgrant.recipes.controllers;

import com.csgrant.recipes.domain.Category;
import com.csgrant.recipes.repositories.CategoryRepository;
import com.csgrant.recipes.repositories.UnitOfMeasureRepository;
import com.csgrant.recipes.services.RecipeService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.Optional;

@Controller
public class IndexController {

    private final RecipeService recipeService;

    public IndexController(RecipeService recipeService) {
        this.recipeService = recipeService;
    }

    @RequestMapping({"", "/", "/index"})
    public String getIndexPage(Model model) {

        model.addAttribute("recipes", recipeService.getRecipes());

        return "index";
    }
}