package homework1;

import homework1.add_task.Address;
import homework1.task2.Rectangle;
import homework1.task4.Computer;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        /*----------ADDITIONAL TASK---------*/
        System.out.println("\n/*----------ADDITIONAL TASK---------*/");
        Address address = new Address();
        address.setIndex(21036);
        address.setCountry("UKR");
        address.setCity("Vinnitsa");
        address.setStreet("Kyivska");
        address.setHouse("4343");
        address.setApartment("67");
        System.out.println(address);


        /*----------TASK 2---------*/
        System.out.println("\n/*----------TASK 2---------*/");
        Rectangle rectangle = new Rectangle();
        rectangle.setRectangleSides();
        System.out.println("Площадь прямоугольника: " + rectangle.areaCalculator());
        System.out.println("Периметр прямоугольника: " + rectangle.perimeterCalculator());


        /*----------TASK 4---------*/
        System.out.println("\n/*----------TASK 4---------*/");
        Computer[] arrComputers = new Computer[5];
        for (int i = 0; i < arrComputers.length; i++) {
            arrComputers[i] = new Computer();
        }
        System.out.println(Arrays.deepToString(arrComputers));
    }
}
