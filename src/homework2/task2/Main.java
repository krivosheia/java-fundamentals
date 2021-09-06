package homework2.task2;

public class Main {
    public static void main(String[] args) {

        Car myCar1 = new Car();
        Car myCar2 = new Car(12);
        Car myCar3 = new Car(15, "grey");

        System.out.println(myCar1);
        System.out.println(myCar2);
        System.out.println(myCar3);
    }
}