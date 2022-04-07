package businessObjects;

public class Item {

    public Item(float price, String name, String image, int quantity) {
        this.price = price;
        this.name = name;
        this.image = image;
        this.quantity = quantity;
    }

    public float getPrice() {
        return price;
    }

    public float getQuantity() {
        return quantity;
    }

    public String getName() {
        return name;
    }

    private float price;
    private String name;
    private String image;
    private int quantity;
}
