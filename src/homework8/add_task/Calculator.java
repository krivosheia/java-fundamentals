package homework8.add_task;

public class Calculator {

    public static double add(double a1, double a2) {
        return a1 + a2;
    }

    public static double sub(double a1, double a2) {
        return a1 - a2;
    }

    public static double mul(double a1, double a2) {
        return a1 * a2;
    }

    public static double div(double a1, double a2) {
        if (a2 == 0) {
            throw new ArithmeticException("Деление на ноль!");
        }
        return a1 / a2;
    }
}
