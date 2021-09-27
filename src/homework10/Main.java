package homework10;

import homework10.task1.MyDictionary;
import homework10.task2.WhatIsBetween;
import homework10.task3.HexToDecimal;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {

        Main main = new Main();
        main.startTask1();
        main.startTask2();
        main.add_task();
    }

    void startTask1() {
        System.out.println("\n\n/*----------TASK 1---------*/");

        MyDictionary<String, String> myDictionary = new MyDictionary<>();
        myDictionary.addWord("пальто", "Верхняя одежда, обычно ниже колен.");
        myDictionary.addWord("чулок", "Вязаное, трикотажное изделие, облегающее ногу.");
        myDictionary.addWord("пальто", "Одежда");
        System.out.println(myDictionary);
        System.out.println();
        System.out.println(myDictionary.getValueById(1));
        System.out.println(myDictionary.size());
    }

    void startTask2() {
        System.out.println("\n\n/*----------TASK 2---------*/");
        System.out.println(Arrays.toString(WhatIsBetween.Between(2, 10)));
    }

    void add_task() {
        System.out.println("\n\n/*----------ADD TASK---------*/");
        System.out.println(HexToDecimal.hexToDec("ff"));
    }
}
