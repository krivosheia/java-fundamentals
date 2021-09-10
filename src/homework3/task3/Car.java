package homework3.task3;

public class Car extends Vehicle {

    public Car(Coordinates coordinates, int price, int speed, int year) {
        super(coordinates, price, speed, year);
    }

    @Override
    public String toString() {
        return "Car{} " + super.toString();
    }
}
