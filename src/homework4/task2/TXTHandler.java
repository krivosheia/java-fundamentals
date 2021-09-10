package homework4.task2;

public class TXTHandler extends AbstractHandler {
    @Override
    public void open(String file) {
        System.out.println("open TXT " + file);
    }

    @Override
    public void create(String file) {
        System.out.println("create TXT " + file);
    }

    @Override
    public void change(String file) {
        System.out.println("change TXT " + file);
    }

    @Override
    public void save(String file) {
        System.out.println("save TXT " + file);
    }
}
