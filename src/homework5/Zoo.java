package homework5;

import java.util.ArrayList;

public class Zoo {
    private ArrayList<String> animals;

    public Zoo() {
        this.animals = new ArrayList<>();
        this.animals.add(0, "antelope");
        this.animals.add(1, "ram");
        this.animals.add(2, "squirrel");
        this.animals.add(3, "bull");
        this.animals.add(4, "gorilla");
        this.animals.add(5, "goose");
        this.animals.add(6, "zebra");
        this.animals.add(7, "fox");
    }

    public Zoo(ArrayList<String> animals) {
        this.animals = animals;
    }

    public ArrayList<String> getAnimals() {
        return animals;
    }
}
