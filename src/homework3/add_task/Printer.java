package homework3.add_task;

public class Printer {
    public static final String RESET = "\033[0m";       // Text Reset
    public static final String RED = "\033[0;31m";      // RED

    public void print(String value) {
        if (this.getClass().isAssignableFrom(Printer.class)) {
            System.out.println(value);}
        else {
            System.out.println(RED + value);
            System.out.print(RESET);
        }

    }
}

