package homework3.task3;

public class Plane extends Vehicle {
    private int height;
    private int passengersNumber;

    public Plane(Coordinates coordinates, int price, int speed, int year, int height, int passengersNumber) {
        super(coordinates, price, speed, year);
        this.height = height;
        this.passengersNumber = passengersNumber;
    }

    @Override
    public String toString() {
        return "Plane{" +
                "height=" + height +
                ", passengersNumber=" + passengersNumber +
                "} " + super.toString();
    }
}
