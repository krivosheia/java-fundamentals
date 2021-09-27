package homework8;

import homework8.add_task.Calculator;
import homework8.task2.Worker;
import homework8.task3.Price;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Main main = new Main();
        main.startTask2();
        main.startTask3();
        main.add_task();
    }

    void startTask2() {
        System.out.println("\n\n/*----------TASK 2---------*/");

        // Ввод работников
        Scanner in = new Scanner(System.in);
        String previousSurnameAndInitials = "";
        Worker[] workers = new Worker[5];
        for (int i = 0; i < workers.length; i++) {
            System.out.print("Введите фамилию и инициалы " + (i + 1) + "-го работника: ");
            String surnameAndInitials = in.next();
            System.out.print("Введите название занимаемой должности: ");
            String position = in.next();
            System.out.print("Введите год поступления на работу (от 1900 года по текущий): ");
            int yearBeginningWork = in.nextInt();

            if (surnameAndInitials.compareTo(previousSurnameAndInitials) < 0) {
                try {
                    throw new Exception("Фамилии работников нужно вводить в алфавитном порядке!");
                } catch (Exception e) {
                    e.printStackTrace();
                    return;
                }
            }

            workers[i] = Worker.valueOf(surnameAndInitials, position, yearBeginningWork);
            previousSurnameAndInitials = workers[i].getSurnameAndInitials();
        }

        // Вывод работников, чей стаж больше заданного.
        System.out.print("\nВведите стаж (лет) работников для вывода на экран: ");
        int experience = in.nextInt();
        for (Worker worker: workers) {
            if (Worker.CURRENT_YEAR - worker.getYearBeginningWork() > experience) {
                System.out.println(worker);
            }
        }
    }

    void startTask3() {
        System.out.println("\n\n/*----------TASK 3---------*/");

        // Ввод товаров
        Scanner in = new Scanner(System.in);
        String previousShop = "";
        Price[] prices = new Price[2];
        for (int i = 0; i < prices.length; i++) {
            System.out.print("Введите название " + (i + 1) + "-го товара: ");
            String product = in.next();
            System.out.print("Введите название магазина: ");
            String shop = in.next();
            System.out.print("Введите цену: ");
            int price = in.nextInt();

            if (shop.compareTo(previousShop) < 0) {
                try {
                    throw new Exception("Магазины нужно вводить в алфавитном порядке!");
                } catch (Exception e) {
                    e.printStackTrace();
                    return;
                }
            }

            prices[i] = new Price(product, shop, price);
            previousShop = prices[i].getShop();
        }

        // вывод на экран информации о товарах, продающихся в магазине, название которого задано.
        System.out.print("\nВведите название магазина: ");
        String shop = in.next();
        boolean shopExists = false;
        for (Price price: prices) {
            if (price.getShop().equals(shop)) {
                System.out.println(price);
                shopExists = true;
            }
        }
        if (!shopExists) {
            try {
                throw new Exception("Такого магазина не существует!");
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }

    void add_task() {
        System.out.println("\n\n/*----------TASK 4---------*/");

        Scanner in = new Scanner(System.in);
        System.out.print("Введите первое число: ");
        double a1 = in.nextDouble();
        System.out.print("Введите второе число: ");
        double a2 = in.nextDouble();
        System.out.print("Введите название операции (add, mul, sub, div): ");
        String operation = in.next();
        switch (operation) {
            case "add": {
                System.out.println(Calculator.add(a1, a2));
                break;
            }
            case "sub": {
                System.out.println(Calculator.sub(a1, a2));
                break;
            }
            case "mul": {
                System.out.println(Calculator.mul(a1, a2));
                break;
            }
            case "div": {
                System.out.println(Calculator.div(a1, a2));
                break;
            }
            default: {
                throw new IllegalArgumentException("Введена неправильная операция!");
            }
        }
    }
}
