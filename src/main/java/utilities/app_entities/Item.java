package utilities.app_entities;

public class Item {
    private String id;
    private String name;
    private String price;
    private int quantity;

    public Item(String id, String name, String price) {
        this.id = id;
        this.name = name;
        this.price = price;
        quantity = 1;
    }


    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPrice() {
        return price;
    }

    public void setPrice(String price) {
        this.price = price;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

}
