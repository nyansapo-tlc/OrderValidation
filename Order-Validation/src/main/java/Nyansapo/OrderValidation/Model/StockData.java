package Nyansapo.OrderValidation.Model;

public class StockData {
    private double last_traded_price;
    private double bid_price;
    private int sell_limit;
    private String product;
    private int max_price_shift;
    private  double ask_price;
    private  int buy_limit;



    public StockData( double last_traded_price, double bid_price, int sell_limit, String product, int max_price_shift, double ask_price, int buy_limit) {
        this.last_traded_price = last_traded_price;
        this.bid_price = bid_price;
        this.sell_limit = sell_limit;
        this.product = product;
        this.max_price_shift = max_price_shift;
        this.ask_price = ask_price;
        this.buy_limit = buy_limit;
    }

    public double getLast_traded_price() {
        return last_traded_price;
    }

    public void setLast_traded_price(double last_traded_price) {
        this.last_traded_price = last_traded_price;
    }

    public double getBid_price() {
        return bid_price;
    }

    public void setBid_price(double bid_price) {
        this.bid_price = bid_price;
    }

    public int getSell_limit() {
        return sell_limit;
    }

    public void setSell_limit(int sell_limit) {
        this.sell_limit = sell_limit;
    }

    public String getProduct() {
        return product;
    }

    public void setProduct(String product) {
        this.product = product;
    }

    public int getMax_price_shift() {
        return max_price_shift;
    }

    public void setMax_price_shift(int max_price_shift) {
        this.max_price_shift = max_price_shift;
    }

    public double getAsk_price() {
        return ask_price;
    }

    public void setAsk_price(double ask_price) {
        this.ask_price = ask_price;
    }

    public int getBuy_limit() {
        return buy_limit;
    }

    public void setBuy_limit(int buy_limit) {
        this.buy_limit = buy_limit;
    }


}
