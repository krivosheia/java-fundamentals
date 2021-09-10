package homework4;

import homework4.task2.AbstractHandler;
import homework4.task2.DOCHandler;
import homework4.task2.TXTHandler;
import homework4.task2.XMLHandler;
import homework4.task3.Player;

public class Main {

    private static String getFileExtension(String fileName) {
        // если в имени файла есть точка и она не является первым символом в названии файла
        if (fileName.lastIndexOf(".") != -1 && fileName.lastIndexOf(".") != 0)
            // то вырезаем все знаки после последней точки в названии файла, то есть ХХХХХ.txt -> txt
            return fileName.substring(fileName.lastIndexOf(".") + 1);
            // в противном случае возвращаем заглушку, то есть расширение не найдено
        else return "";
    }

    public static void main(String[] args) {

        Main main = new Main();
        main.startTask2();
        main.startTask3();
    }

    void startTask2() {
        System.out.println("\n/*----------TASK 2---------*/");

        // создаем файл, например, txt
        String file = "Hello.txt";
        AbstractHandler abstractHandler;
        switch (getFileExtension(file)) {
            case "xml": {
                abstractHandler = new XMLHandler();
                break;
            }
            case "txt": {
                abstractHandler = new TXTHandler();
                break;
            }
            case "doc": {
                abstractHandler = new DOCHandler();
                break;
            }
            default: {
                abstractHandler = null;
            }
        }
        if (abstractHandler != null) {
            abstractHandler.open(file);
            abstractHandler.create(file);
            abstractHandler.change(file);
            abstractHandler.save(file);
        }
    }

    void startTask3() {
        System.out.println("\n/*----------TASK 3---------*/");
        Player player = new Player();
        player.play();
        player.record();
        player.pause();
        player.stop();
    }
}
