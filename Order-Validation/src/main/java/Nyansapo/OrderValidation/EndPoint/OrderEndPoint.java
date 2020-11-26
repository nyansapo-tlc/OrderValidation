package Nyansapo.OrderValidation.EndPoint;

import Nyansapo.OrderValidation.Model.OrderRequest;
import Nyansapo.OrderValidation.Model.OrderResponse;
import Nyansapo.OrderValidation.Service.OrderServiceImplementation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.ws.server.endpoint.annotation.Endpoint;
@RestController
public class OrderEndPoint {
 @Autowired
    private final OrderServiceImplementation orderServiceImplementation;

    public OrderEndPoint(OrderServiceImplementation orderServiceImplementation) {
        this.orderServiceImplementation = orderServiceImplementation;
    }

    @PostMapping("/api/order")
    OrderResponse validateOrder(@RequestBody OrderRequest request){
        OrderResponse orderResponse = new OrderResponse();
        boolean check_order =  orderServiceImplementation.isOrderValid(request);
        if(check_order){
            orderResponse.setMessage("order valid");

        } else{
            orderResponse.setMessage("invalid order");
        }
        return orderResponse;
    }
}
