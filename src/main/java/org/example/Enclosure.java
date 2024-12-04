package org.example;

import java.util.ArrayList;
import java.util.List;

public class Enclosure {
    private int id;
    private String name;
    private List<Animal> animals = new ArrayList<>();

    public Enclosure( int id, String name ) {
        this.id = id;
        this.name = name;
    }

    public void addAnimal( Animal animal ) {
        animals.add( animal );
    }
    public void removeAnimal( Animal animal ) {
        animals.remove( animal );
    }

    public void printAnimals() {
        for ( Animal animal : animals ) {
            animal.getDetails();
        }
    }

    @Override
    public String toString() {
        return "Enclosure [id=" + id + ", name=" + name + "]";
    }
}
