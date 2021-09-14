package homework5;

import java.util.ArrayList;
import java.util.ListIterator;

public class Main {

    public static void main(String[] args) {

        Main main = new Main();
        main.startTask2();
        main.startTask3();
        main.startTask4();
    }

    void startTask2() {
        System.out.println("\n\n/*----------TASK 2---------*/");
        Zoo zoo = new Zoo();
        System.out.println(zoo.getAnimals());
    }

    void startTask3() {
        System.out.println("\n\n/*----------TASK 3---------*/");
        Zoo zoo = new Zoo();
        ArrayList<String> animals = zoo.getAnimals();
        animals.remove(6);
        animals.remove(4);
        animals.remove(2);
        System.out.println(animals);
        System.out.println("Размер списка: " + animals.size());
    }

    void startTask4() {
        System.out.println("\n\n/*----------TASK 4---------*/");
        ArrayList<Integer> arrayList = new ArrayList<>();
        int min = 10, max = 20;

        for (int i = 0; i < 10; i++) {
            int r = (int) (Math.random() * (max - min + 1)) + min;
            arrayList.add(r);
        }

        max = 10;
        min = 20;
        int min_i = 0, max_i = 0;
        for (int i = 0; i < arrayList.size(); i++) {
            int r = arrayList.get(i);
            if (r > max) {
                max_i = i;
                max = r;
            }
            if (r < min) {
                min_i = i;
                min = r;
            }
        }
        System.out.println(arrayList);
        System.out.println("max index = " + max_i);
        System.out.println("min index = " + min_i);

        System.out.println("Увеличение значений списка на +1");
        ListIterator<Integer> listIterator = arrayList.listIterator();
        while (listIterator.hasNext()) {
            int i = listIterator.nextIndex();
            arrayList.set(i, arrayList.get(i) + 1);
            listIterator.next();
        }
        System.out.println(arrayList);
    }
}
