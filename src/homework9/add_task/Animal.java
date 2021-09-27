package homework9.add_task;

import java.util.Objects;

public class Animal {
    String name;
    int age;
    Boolean tail;

    public Animal(String name, int age, Boolean tail) {
        this.name = name;
        this.age = age;
        this.tail = tail;
    }

    @Override
    public String toString() {
        return "Animal{" +
                "Имя: '" + name + '\'' +
                ", возаст: " + age +
                ", хвост: " + ((tail = true) ? "есть" : "нет") +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Animal)) return false;
        Animal animal = (Animal) o;
        return age == animal.age && Objects.equals(name, animal.name) && Objects.equals(tail, animal.tail);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, age, tail);
    }
}
