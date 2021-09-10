package homework3.task3;

import java.util.Arrays;

public class Vehicle {
    private Coordinates coordinates;
    private int price;
    private int speed;
    private int year;

    public Vehicle(Coordinates coordinates, int price, int speed, int year) {
        this.coordinates = coordinates;
        this.price = price;
        this.speed = speed;
        this.year = year;
    }

    @Override
    public String toString() {
        return "Vehicle{" +
                coordinates +
                ", price=" + price +
                ", speed=" + speed +
                ", year=" + year +
                '}';
    }
}

