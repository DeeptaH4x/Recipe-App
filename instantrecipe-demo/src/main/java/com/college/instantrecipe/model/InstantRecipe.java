package com.college.instantrecipe.model;


import java.util.List;

import jakarta.persistence.ElementCollection;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class InstantRecipe {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private final Long id;
    private final String name;

    @ElementCollection
    private final List<String> vegetables;

    @ElementCollection
    private List<String> spices;

    @ElementCollection
    private List<String> equipment;

    // Constructors, Getters, and Setters

    public InstantRecipe(List<String> equipment, Long id, String name, List<String> spices, List<String> vegetables) {
        this.equipment = equipment;
        this.id = id;
        this.name = name;
        this.spices = spices;
        this.vegetables = vegetables;
    }

    public InstantRecipe(String name, List<String> vegetables) {
        this.name = name;
        this.vegetables = vegetables;
        this.id = null;
    }

    public Long getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public List<String> getVegetables() {
        return vegetables;
    }

    public List<String> getSpices() {
        return spices;
    }

    public List<String> getEquipment() {
        return equipment;
    }

    public void setId(Long id) {
        throw new UnsupportedOperationException("Not supported yet.");
    }
}
