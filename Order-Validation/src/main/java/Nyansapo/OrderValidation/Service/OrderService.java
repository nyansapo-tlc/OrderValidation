package Nyansapo.OrderValidation.Service;

import Nyansapo.OrderValidation.Model.OrderRequest;

public interface OrderService {
    public boolean isOrderValid(OrderRequest orderRequest);
}
