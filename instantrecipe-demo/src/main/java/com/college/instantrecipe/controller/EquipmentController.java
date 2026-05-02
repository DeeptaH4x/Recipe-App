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

import com.college.instantrecipe.model.Equipment;
import com.college.instantrecipe.service.EquipmentService;

@RestController
@RequestMapping("/api/equipment")
public class EquipmentController {

    private final EquipmentService service;

    public EquipmentController(EquipmentService service) {
        this.service = service;
    }

    @GetMapping
    public List<Equipment> getAllEquipment() {
        return service.findAll();
    }

    @GetMapping("/{id}")
    public Optional<Equipment> getEquipmentById(@PathVariable Long id) {
        return service.findById(id);
    }

    @PostMapping
    public Equipment createEquipment(@RequestBody Equipment equipment) {
        return service.save(equipment);
    }

    @PutMapping("/{id}")
    public Equipment updateEquipment(@PathVariable Long id, @RequestBody Equipment equipment) {
        equipment.setId(id);
        return service.save(equipment);
    }

    @DeleteMapping("/{id}")
    public void deleteEquipment(@PathVariable Long id) {
        service.deleteById(id);
    }
}