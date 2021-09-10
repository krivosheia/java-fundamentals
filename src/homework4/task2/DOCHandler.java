package homework4.task2;

public class DOCHandler extends AbstractHandler {
    @Override
    public void open(String file) {
        System.out.println("open DOC " + file);
    }

    @Override
    public void create(String file) {
        System.out.println("create DOC " + file);
    }

    @Override
    public void change(String file) {
        System.out.println("change DOC " + file);
    }

    @Override
    public void save(String file) {
        System.out.println("save DOC " + file);
    }
}
