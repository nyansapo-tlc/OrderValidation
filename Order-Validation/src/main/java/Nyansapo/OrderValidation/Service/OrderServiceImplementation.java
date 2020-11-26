package Nyansapo.OrderValidation.Service;

import Nyansapo.OrderValidation.Model.*;
import org.springframework.stereotype.Service;

@Service
public class OrderServiceImplementation implements OrderService {

    @Override
    public boolean isOrderValid(OrderRequest orderRequest) {

        //WebClientService tradeEngineClientService = new WebClientService("http://localhost:8089");
        WebClientService webClientService = new WebClientService("https://exchange.matraining.com");
        WebClientService webClientService2 = new WebClientService("https://exchange2.matraining.com");
        StockData stockdata1 = webClientService.getData(orderRequest.getProduct()).block();
        StockData stockdata2 = webClientService2.getData(orderRequest.getProduct()).block();


        StockData AvData =
                new StockData(
                        Math.max(stockdata1.getLast_traded_price(), stockdata2.getLast_traded_price()),
                        (stockdata1.getBid_price()+stockdata2.getBid_price())/2,
                        stockdata1.getSell_limit(),
                        orderRequest.getProduct(),
                         Math.max(stockdata1.getMax_price_shift(), stockdata2.getMax_price_shift()),
                        ((stockdata1.getAsk_price()+stockdata2.getAsk_price())/2),
                        stockdata2.getBuy_limit()
                );
        boolean order = false;
        TradeOrder tradOrder = new TradeOrder();
        OrderResponse response = new OrderResponse();
        if(orderRequest.getPrice() < 0.0){
            order = false;
        }else {
            if(orderRequest.getSide().matches("BUY")){
                if(orderRequest.getQuantity() > AvData.getBuy_limit()){
                    order = false;
                }else{
                    tradOrder.setProduct(orderRequest.getProduct());
                    tradOrder.setQuantity(orderRequest.getQuantity());
                    tradOrder.setPrice(orderRequest.getPrice());
                    tradOrder.setSide(orderRequest.getSide());
                    //TradeResponse tradeResponse =  tradeEngineClientService.sendData(tradOrder, "/postValidatedOrder").block();
                    order = true;
                }

            }else if (orderRequest.getSide().matches("SELL")){
                if(orderRequest.getQuantity() > AvData.getSell_limit()){
                    order = false;
                }else{
                    order = true;
                }

            }
           order = true;
        }
        return order;
    }

}
