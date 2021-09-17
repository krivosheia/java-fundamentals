package homework7;

import homework7.add_task.Vehicles;
import homework7.task2.ErrorPrinter;
import homework7.task3.Animals;

public class Main {

    public static void main(String[] args) {

        Main main = new Main();
        main.startTask2();
        main.startTask3();
        main.add_task();
    }

    void startTask2() {
        System.out.println("\n\n/*----------TASK 2---------*/");
        ErrorPrinter errorPrinter = new ErrorPrinter() {
            @Override
            public void printError(String error) {
                System.out.println("\u001B[31m" + error + "\u001B[0m");
            }
        };
        errorPrinter.printError("err");
    }

    void startTask3() {
        System.out.println("\n\n/*----------TASK 3---------*/");
        System.out.println(Animals.fox);
    }

    void add_task() {
        System.out.println("\n\n/*----------TASK 4---------*/");

        Vehicles.audi.setColor("red");
        System.out.println(Vehicles.audi.getColor());
        System.out.println(Vehicles.audi);
    }
}
