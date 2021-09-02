package homework1.task3;

public class Book {
    private Author author;
    private Content content;
    private Title title;

    Book() {
        this.author = new Author("");
        this.content = new Content("");
        this.title = new Title("");
    }

    Book(String author, String content, String title) {
        this.author = new Author(author);
        this.content = new Content(content);
        this.title = new Title(title);
    }

    public void show() {
        this.title.show();
        this.author.show();
        this.content.show();
    }

    public void setAuthor(String author) {
        if (this.author == null) {
            this.author = new Author(author);
        } else {
            this.author.setAuthor(author);
        }
    }

    public void setContent(String content) {
        if (this.content == null) {
            this.content = new Content(content);
        } else {
            this.content.setContent(content);
        }
    }

    public void setTitle(String title) {
        if (this.title == null) {
            this.title = new Title(title);
        } else {
            this.title.setTitle(title);
        }
    }

    public static void main(String[] args) {

        Book myBook1 = new Book("Лев Толстой", "Содержание...", "Война и мир");
        myBook1.setContent("Том первый\n" +
                "\t»\n" +
                "Часть первая\n" +
                "\t»\n" +
                "I...");
        myBook1.show();

        Book myBook2 = new Book();
        myBook2.setTitle("Анна Каренина");
        myBook2.setAuthor("Лев Толстой");
        myBook2.show();
    }
}
