package com.college.instantrecipe.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.college.instantrecipe.model.Spice;

public interface SpiceRepository extends JpaRepository<Spice, Long> {
}