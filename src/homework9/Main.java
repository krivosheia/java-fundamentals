package homework9;

import homework9.add_task.Animal;
import homework9.task2.Device;
import homework9.task2.EthernetAdapter;
import homework9.task2.Monitor;

public class Main {

    public static void main(String[] args) {

        Main main = new Main();
        main.startTask3();
        main.startTask4();
        main.add_task();
    }

    void startTask3() {
        System.out.println("\n\n/*----------TASK 3---------*/");

        Device device = new Device("Samsung", 22.5f, "MF34543544564565656");
        Monitor monitor = new Monitor("Samsung", 22.5f, "MF34543544564565656",
                2000, 3000);
        System.out.println(device);
        System.out.println(monitor);
    }

    void startTask4() {
        System.out.println("\n\n/*----------TASK 2---------*/");

        Device device = new Device("Samsung", 22.5f, "MF34543544564565656");
        Monitor monitor1 = new Monitor("Samsung", 22.5f, "MF34543544564565656",
                2000, 3000);
        Monitor monitor2 = new Monitor("Samsung", 22.5f, "MF34543544564565656",
                2000, 3000);
        Monitor monitor3 = new Monitor("Dell", 22.5f, "MF34543544564565656",
                2000, 3000);
        EthernetAdapter ethernetAdapter1 = new EthernetAdapter("Dell", 22.5f, "KR35345345",
                100, "VW454FR2424");
        EthernetAdapter ethernetAdapter2 = new EthernetAdapter("Dell", 22.5f, "KR35345345",
                100, "VW454FR2424");

        System.out.println(device.hashCode());
        System.out.println(monitor1.hashCode());
        System.out.println(monitor2.hashCode());
        System.out.println(monitor3.hashCode());
        System.out.println(ethernetAdapter1.hashCode());
        System.out.println(ethernetAdapter2.hashCode());

        System.out.println(monitor1.equals(monitor2));
        System.out.println(monitor1.equals(monitor3));
        System.out.println(ethernetAdapter1.equals(ethernetAdapter2));
    }

    void add_task() {
        System.out.println("\n\n/*----------ADD TASK---------*/");

        Animal animal = new Animal("Ванька", 7, true);
        System.out.println(animal);
        System.out.println(animal.hashCode());
    }
}
