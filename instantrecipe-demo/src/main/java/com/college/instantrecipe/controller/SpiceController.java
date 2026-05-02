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

import com.college.instantrecipe.model.Spice;
import com.college.instantrecipe.service.SpiceService;

@RestController
@RequestMapping("/api/spices")
public class SpiceController {

    private final SpiceService service;

    public SpiceController(SpiceService service) {
        this.service = service;
    }

    @GetMapping
    public List<Spice> getAllSpices() {
        return service.findAll();
    }

    @GetMapping("/{id}")
    public Optional<Spice> getSpiceById(@PathVariable Long id) {
        return service.findById(id);
    }

    @PostMapping
    public Spice createSpice(@RequestBody Spice spice) {
        return service.save(spice);
    }

    @PutMapping("/{id}")
    public Spice updateSpice(@PathVariable Long id, @RequestBody Spice spice) {
        spice.setId(id);
        return service.save(spice);
    }

    @DeleteMapping("/{id}")
    public void deleteSpice(@PathVariable Long id) {
        service.deleteById(id);
    }
}