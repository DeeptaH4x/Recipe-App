package com.college.instantrecipe.controller;

import com.college.instantrecipe.model.Vegetable;
import com.college.instantrecipe.service.VegetableService;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api/vegetables")
public class VegetableController {

    private final VegetableService service;

    public VegetableController(VegetableService service) {
        this.service = service;
    }

    @GetMapping
    public List<Vegetable> getAllVegetables() {
        return service.findAll();
    }

    @GetMapping("/{id}")
    public Optional<Vegetable> getVegetableById(@PathVariable Long id) {
        return service.findById(id);
    }

    @PostMapping
    public Vegetable createVegetable(@RequestBody Vegetable vegetable) {
        return service.save(vegetable);
    }

    @PutMapping("/{id}")
    public Vegetable updateVegetable(@PathVariable Long id, @RequestBody Vegetable vegetable) {
        vegetable.setId(id);
        return service.save(vegetable);
    }

    @DeleteMapping("/{id}")
    public void deleteVegetable(@PathVariable Long id) {
        service.deleteById(id);
    }
}