package org.example;

import java.util.ArrayList;
import java.util.List;

public class ZooManager {
    private List<Enclosure> enclosures = new ArrayList<>();

    public void readEnclosures() {
        for (Enclosure enclosure : enclosures) {
            enclosure.toString();
        }
    }

    public void addEnclosure(Enclosure enclosure) {
        enclosures.add(enclosure);
    }

    public void removeEnclosure(Enclosure enclosure) {
        enclosures.remove(enclosure);
    }

    public void addAnimal(int id, String name, String species, String type) {
        if (type.equals("mammal")) {
            Mammal mammal = new Mammal(id, name, species);
        }
        else {
            Bird bird = new Bird(id, name, species);
        }
    }

}
