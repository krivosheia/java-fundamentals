package homework6;

import homework6.add_task.Calculator;
import homework6.task2.Vehicle;
import homework6.task3.Distance;

public class Main {

    public static void main(String[] args) {

        Main main = new Main();
        main.startTask2();
        main.startTask3();
        main.add_task();
    }

    void startTask2() {
        System.out.println("\n\n/*----------TASK 2---------*/");
        Vehicle vehicle = new Vehicle();
        vehicle.printDoorColor(vehicle.getDoor());
        vehicle.printWheelColor(vehicle.getWheel());
    }

    void startTask3() {
        System.out.println("\n\n/*----------TASK 3---------*/");
        Distance distance = new Distance(1000);
        distance.print();

        Distance.Converter.convertMetresToKilometers(distance);
        distance.print();

        Distance.Converter.convertKilometersToMiles(distance);
        distance.print();

        Distance.Converter.convertMilesToKilometers(distance);
        Distance.Converter.convertKilometersToMetres(distance);
        distance.print();
    }

    void add_task() {
        System.out.println("\n\n/*----------TASK 4---------*/");
        System.out.println(Calculator.addition(5.6, 7.3));
        System.out.println(Calculator.subtraction(896, 4645));
        System.out.println(Calculator.multiplication(59.67, 45.893));
        System.out.println(Calculator.division(5685.234, 4565.56));
    }
}
