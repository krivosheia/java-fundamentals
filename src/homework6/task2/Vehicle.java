package homework6.task2;

public class Vehicle {

    public Wheel getWheel() {
        return new Wheel();
    }

    public Door getDoor() {
        return new Door();
    }

    private class Wheel {
        String color;

        Wheel() {
            this.color = "Black";
        }
    }

    private class Door {
        String color;

        Door() {
            this.color = "White";
        }
    }

    public void printWheelColor(Wheel wheel) {
        System.out.println(wheel.color);
    }

    public void printDoorColor(Door door) {
        System.out.println(door.color);
    }
}
