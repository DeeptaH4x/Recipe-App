package com.college.instantrecipe.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.college.instantrecipe.model.InstantRecipe;

public interface InstantRecipeRepository extends JpaRepository<InstantRecipe, Long> {
}