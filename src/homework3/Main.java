package homework3;

import homework3.add_task.Printer;
import homework3.add_task.RedPrinter;
import homework3.task2.*;
import homework3.task3.Car;
import homework3.task3.Coordinates;
import homework3.task3.Plane;
import homework3.task3.Ship;
import homework3.task4.DocumentWorker;
import homework3.task4.ExpertDocumentWorker;
import homework3.task4.ProDocumentWorker;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Main main = new Main();

        main.startTask2();
        main.startTask3();
        main.startTask4();
        main.startAddTask();
    }

    void startTask2() {
        System.out.println("\n===== Task2 =====");
        Pupil[] arrPupils = new Pupil[4];
        arrPupils[0] = new Pupil();
        arrPupils[1] = new BadPupil();
        arrPupils[2] = new GoodPupil();
        arrPupils[3] = new ExcelentPupil();

        ClassRoom classroom = new ClassRoom(arrPupils);

        for (Pupil pupil : classroom.getArrPupils()) {
            pupil.read();
            pupil.relax();
            pupil.study();
            pupil.write();
            System.out.println();
        }
        System.out.println(classroom);
    }

    void startTask3() {
        System.out.println("\n===== Task3 =====");

        Car car = new Car(new Coordinates(11.0, 12.3), 340000, 450, 2014);
        System.out.println(car);

        Plane plane = new Plane(new Coordinates(1456.67, 245), 56770, 470, 2018, 2800,
                130);
        System.out.println(plane);

        Ship ship = new Ship(new Coordinates(4566.78, 5677.234), 45467, 72, 2007, 457,
                "Odessa");
        System.out.println(ship);

    }

    void startTask4() {
        System.out.println("\n===== Task4 =====");

        Scanner in = new Scanner(System.in);
        System.out.print("Введите ключ доступа к программе: ");
        String key = in.next();

        DocumentWorker doc;
        switch (key) {
            case "pro": {
                doc = new ProDocumentWorker();
                break;
            }
            case "exp": {
                doc = new ExpertDocumentWorker();
                break;
            }
            default: {
                doc = new DocumentWorker();
                break;
            }
        }

        doc.openDocument();
        doc.editDocument();
        doc.saveDocument();
    }

    void startAddTask() {
        System.out.println("\n===== AddTask =====");
        new Printer().print("Hello!");
        new RedPrinter().print("Hello! (red colors)");
    }
}
