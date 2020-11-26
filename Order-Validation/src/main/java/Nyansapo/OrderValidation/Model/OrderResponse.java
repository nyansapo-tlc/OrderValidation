package Nyansapo.OrderValidation.Model;

public class OrderResponse {
    private String message;

    public OrderResponse(String message) {
        this.message = message;
    }
    public OrderResponse(){

    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }
}
