package homework7.add_task;

public enum Vehicles {
    bmw(10000), ford(20000), audi(30000), toyota(8200);

    int price;
    String color;

    Vehicles(int price) {
        this.price = price;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    @Override
    public String toString() {
        return super.toString() +
                "{price=" + price +
                ", color='" + color + '\'' + "}";
    }
}
