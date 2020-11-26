package Nyansapo.OrderValidation.Model;

public class OrderRequest {
    private int portfolio_id;
    private String product;
    private int quantity;
    private String side;
    private double price;

    public OrderRequest(int portfolio_id, String product, int quantity, String side, double price) {
        this.portfolio_id = portfolio_id;
        this.product = product;
        this.quantity = quantity;
        this.side = side;
        this.price = price;
    }

    public OrderRequest() {
    }

    public int getPortfolio_id() {
        return portfolio_id;
    }

    public void setPortfolio_id(int portfolio_id) {
        this.portfolio_id = portfolio_id;
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

