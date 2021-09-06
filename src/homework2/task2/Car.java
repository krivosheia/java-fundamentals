package homework2.task2;

public class Car {
    private int year;
    private String color;

    public Car() {
        this.year = 10;
        this.color = "blue";
    }

    public Car(int year) {
        this.year = year;
        this.color = "blue";
    }

    public Car(int year, String color) {
        this.year = year;
        this.color = color;
    }

    @Override
    public String toString() {
        return "Car{" +
                "year=" + year +
                ", color='" + color + '\'' +
                '}';
    }
}
