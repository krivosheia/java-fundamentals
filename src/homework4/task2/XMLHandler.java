package homework4.task2;

public class XMLHandler extends AbstractHandler {
    @Override
    public void open(String file) {
        System.out.println("open XML " + file);
    }

    @Override
    public void create(String file) {
        System.out.println("create XML " + file);
    }

    @Override
    public void change(String file) {
        System.out.println("change XML " + file);
    }

    @Override
    public void save(String file) {
        System.out.println("save XML " + file);
    }
}
