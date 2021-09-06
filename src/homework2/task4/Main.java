package homework2.task4;

public class Main {
    public static void main(String[] args) {

        Car myCar1 = new Car();
        Car myCar2 = new Car(10);
        Car myCar3 = new Car(9, 180);
        Car myCar4 = new Car(8, 160, 970);
        Car myCar5 = new Car(12, 190, 1040);
        Car myCar6 = new Car(15, 210, 850, "pink");

        System.out.println(myCar1);
        System.out.println(myCar2);
        System.out.println(myCar3);
        System.out.println(myCar4);
        System.out.println(myCar5);
        System.out.println(myCar6);
    }
}
