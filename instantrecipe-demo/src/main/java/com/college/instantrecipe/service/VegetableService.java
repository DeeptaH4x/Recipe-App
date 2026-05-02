package com.college.instantrecipe.service;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import com.college.instantrecipe.model.Vegetable;
import com.college.instantrecipe.repository.VegetableRepository;

@Service
public class VegetableService {

    private final VegetableRepository repository;

    public VegetableService(VegetableRepository repository) {
        this.repository = repository;
    }

    public List<Vegetable> findAll() {
        return repository.findAll();
    }

    public Optional<Vegetable> findById(Long id) {
        return repository.findById(id);
    }

    public Vegetable save(Vegetable vegetable) {
        return repository.save(vegetable);
    }

    public void deleteById(Long id) {
        repository.deleteById(id);
    }
}