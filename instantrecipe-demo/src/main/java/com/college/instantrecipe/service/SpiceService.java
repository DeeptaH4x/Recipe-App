package com.college.instantrecipe.service;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import com.college.instantrecipe.model.Spice;
import com.college.instantrecipe.repository.SpiceRepository;

@Service
public class SpiceService {

    private final SpiceRepository repository;

    public SpiceService(SpiceRepository repository) {
        this.repository = repository;
    }

    public List<Spice> findAll() {
        return repository.findAll();
    }

    public Optional<Spice> findById(Long id) {
        return repository.findById(id);
    }

    public Spice save(Spice spice) {
        return repository.save(spice);
    }

    public void deleteById(Long id) {
        repository.deleteById(id);
    }
}