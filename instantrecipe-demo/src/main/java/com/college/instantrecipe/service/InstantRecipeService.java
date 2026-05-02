package com.college.instantrecipe.service;

import com.college.instantrecipe.model.InstantRecipe;
import com.college.instantrecipe.repository.InstantRecipeRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class InstantRecipeService {

    private final InstantRecipeRepository repository;

    public InstantRecipeService(InstantRecipeRepository repository) {
        this.repository = repository;
    }

    public List<InstantRecipe> findAll() {
        return repository.findAll();
    }

    public Optional<InstantRecipe> findById(Long id) {
        return repository.findById(id);
    }

    public InstantRecipe save(InstantRecipe recipe) {
        return repository.save(recipe);
    }

    public void deleteById(Long id) {
        repository.deleteById(id);
    }
}