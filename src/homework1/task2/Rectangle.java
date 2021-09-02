package homework1.task2;

import java.util.Scanner;

public class Rectangle {
    private double side1;
    private double side2;

    public Rectangle() {
    }

    public Rectangle(double side1, double side2) {
        this.side1 = side1;
        this.side2 = side2;
    }

    public double areaCalculator() {
        return side1 * side2;
    }

    public double perimeterCalculator () {
        return 2 * (side1 + side2);
    }

    public void setRectangleSides(double side1, double side2) {
        this.side1 = side1;
        this.side2 = side2;
    }

    public void setRectangleSides() {
        Scanner in = new Scanner(System.in);
        System.out.print("Введите длину прямоугольника (side1): ");
        this.side1 = in.nextDouble();
        System.out.print("Введите ширину прямоугольника (side2): ");
        this.side2 = in.nextDouble();
    }
}
