package com.college.instantrecipe.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.college.instantrecipe.model.InstantRecipe;
import com.college.instantrecipe.service.InstantRecipeService;

@RestController
@RequestMapping("/api/recipes")
public class InstantRecipeController {

    private final InstantRecipeService service;

    public InstantRecipeController(InstantRecipeService service) {
        this.service = service;
    }

    @GetMapping
    public List<InstantRecipe> getAllRecipes() {
        return service.findAll();
    }

    @GetMapping("/{id}")
    public Optional<InstantRecipe> getRecipeById(@PathVariable Long id) {
        return service.findById(id);
    }

    @PostMapping
    public InstantRecipe createRecipe(@RequestBody InstantRecipe recipe) {
        return service.save(recipe);
    }

    @PutMapping("/{id}")
    public InstantRecipe updateRecipe(@PathVariable Long id, @RequestBody InstantRecipe recipe) {
        recipe.setId(id);
        return service.save(recipe);
    }

    @DeleteMapping("/{id}")
    public void deleteRecipe(@PathVariable Long id) {
        service.deleteById(id);
    }
}