package homework2.task3;

public class Car {
    private int year;
    private double speed;
    private int weight;
    private String color;

    public Car() {
        this.year = 10;
        this.speed = 210.0;
        this.weight = 950;
        this.color = "blue";
    }

    public Car(int year) {
        this.year = year;
        this.speed = 210.0;
        this.weight = 950;
        this.color = "blue";
    }

    public Car(int year, double speed) {
        this.year = year;
        this.speed = speed;
        this.weight = 950;
        this.color = "blue";
    }

    public Car(int year, double speed, int weight) {
        this.year = year;
        this.speed = speed;
        this.weight = weight;
        this.color = "blue";
    }

    public Car(int year, double speed, int weight, String color) {
        this.year = year;
        this.speed = speed;
        this.weight = weight;
        this.color = color;
    }

    @Override
    public String toString() {
        return "Car{" +
                "year=" + year +
                ", speed=" + speed +
                ", weight=" + weight +
                ", color='" + color + '\'' +
                '}';
    }
}
