package homework8.task3;

public class Price {
    private String product;
    private String shop;
    private int price;

    public Price(String product, String shop, int price) {
        this.product = product;
        this.shop = shop;
        this.price = price;
    }

    public String getProduct() {
        return product;
    }

    public String getShop() {
        return shop;
    }

    public int getPrice() {
        return price;
    }

    @Override
    public String toString() {
        return "Price{" +
                "product='" + product + '\'' +
                ", shop='" + shop + '\'' +
                ", price=" + price +
                '}';
    }
}
