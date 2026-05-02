package com.college.instantrecipe.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.college.instantrecipe.model.Equipment;

public interface EquipmentRepository extends JpaRepository<Equipment, Long> {
}