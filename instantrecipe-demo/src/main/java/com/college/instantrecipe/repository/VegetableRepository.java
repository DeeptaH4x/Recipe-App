package com.college.instantrecipe.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.college.instantrecipe.model.Vegetable;

public interface VegetableRepository extends JpaRepository<Vegetable, Long> {
}