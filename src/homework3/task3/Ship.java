package homework3.task3;

public class Ship extends Vehicle {
    private int passengersNumber;
    private String registryPort;

    public Ship(Coordinates coordinates, int price, int speed, int year, int passengersNumber, String registryPort) {
        super(coordinates, price, speed, year);
        this.passengersNumber = passengersNumber;
        this.registryPort = registryPort;
    }

    @Override
    public String toString() {
        return "Ship{" +
                "passengersNumber=" + passengersNumber +
                ", registryPort='" + registryPort + '\'' +
                "} " + super.toString();
    }
}
