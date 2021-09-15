package homework6.add_task;

public class Calculator {

    public static double addition(double a1, double a2) {
        return a1 + a2;
    }

    public static double subtraction(double a1, double a2) {
        return a1 - a2;
    }

    public static double multiplication(double a1, double a2) {
        return a1 * a2;
    }

    public static double division(double a1, double a2) {
        if (a2 == 0) {
            return 0.0;
        }
        return a1 / a2;
    }
}
