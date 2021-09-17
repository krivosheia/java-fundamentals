package homework7.task3;

public enum Animals {
    antelope(10), ram(20), squirrel(3), bull(8), gorilla(12), goose(2), zebra(5),
    fox(12);

    int age;

    Animals(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "Animals{" +
                super.toString() +
                ", age=" + age + "}";
    }
}
