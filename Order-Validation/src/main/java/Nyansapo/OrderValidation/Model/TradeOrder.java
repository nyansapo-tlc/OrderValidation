package Nyansapo.OrderValidation.Model;

public class TradeOrder {
    private String product;
    private int quantity;
    private String side;
    private double price;

    public TradeOrder(String product, int quantity, String side, double price) {
        this.product = product;
        this.quantity = quantity;
        this.side = side;
        this.price = price;
    }

    public TradeOrder() {

    }

    public String getProduct() {
        return product;
    }

    public void setProduct(String product) {
        this.product = product;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public String getSide() {
        return side;
    }

    public void setSide(String side) {
        this.side = side;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }
}

