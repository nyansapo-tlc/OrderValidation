package Nyansapo.OrderValidation.Service;

import Nyansapo.OrderValidation.Model.StockData;
import Nyansapo.OrderValidation.Model.TradeOrder;
import Nyansapo.OrderValidation.Model.TradeResponse;
import org.springframework.http.MediaType;
import org.springframework.web.reactive.function.client.WebClient;
import reactor.core.publisher.Mono;

public class WebClientService {
    private WebClient webClient;

    public WebClientService(String url) {
        this.webClient = WebClient.create(url);
    }
    Mono<StockData> getData(String ticker){
        return webClient.get()
                .uri("/md/{ticker}", ticker)
                .retrieve()
                .bodyToMono(StockData.class);
    }

//    Mono<TradeResponse> sendData(TradeOrder tradeOrder, String uri){
//        return webClient.post()
//                .uri(uri)
//                .contentType(MediaType.APPLICATION_FORM_URLENCODED)
//                .accept(MediaType.APPLICATION_JSON )
//                .body(Mono.just(tradeOrder),TradeOrder.class)
//                .retrieve()
//                .bodyToMono(TradeResponse.class);
//    }
}
