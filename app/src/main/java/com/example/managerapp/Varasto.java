package com.example.managerapp;


import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class Varasto<T extends JalkapalloEntiteetti> {
    private List<T> kohteet;

    public Varasto() {
        kohteet = new ArrayList<>();
    }

    public void lisaa(T kohde) {
        if (kohde != null) {
            kohteet.add(kohde);
        } else {
            throw new IllegalArgumentException("Kohde ei voi olla null");
        }
    }

    public List<T> haeKaikki() {
        return kohteet;
    }

    public List<T> suodata(Predicate<T> ehto) {
        return kohteet.stream().filter(ehto).collect(Collectors.toList());
    }
}

