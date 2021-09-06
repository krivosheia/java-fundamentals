package homework2.task4;

public class Car {
    private int year;
    private double speed;
    private int weight;
    private String color;

    public Car() {
        this(10, 210.0, 950, "blue");
    }

    public Car(int year) {
        this(year, 210.0, 950, "blue");
    }

    public Car(int year, double speed) {
        this(year, speed, 950, "blue");
    }

    public Car(int year, double speed, int weight) {
        this(year, speed, weight, "blue");
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
