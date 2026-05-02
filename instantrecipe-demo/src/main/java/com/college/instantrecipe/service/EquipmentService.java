package com.college.instantrecipe.service;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import com.college.instantrecipe.model.Equipment;
import com.college.instantrecipe.repository.EquipmentRepository;

@Service
public class EquipmentService {

    private final EquipmentRepository repository;

    public EquipmentService(EquipmentRepository repository) {
        this.repository = repository;
    }

    public List<Equipment> findAll() {
        return repository.findAll();
    }

    public Optional<Equipment> findById(Long id) {
        return repository.findById(id);
    }

    public Equipment save(Equipment equipment) {
        return repository.save(equipment);
    }

    public void deleteById(Long id) {
        repository.deleteById(id);
    }
}