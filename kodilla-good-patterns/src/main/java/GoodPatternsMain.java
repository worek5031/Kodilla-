import com.kodilla.spring.good.patterns.challenge.*;

public class GoodPatternsMain {

    public static void main(String[] args) {

        ProductOrderRetriever orderRetriever = new ProductOrderRetriever();
        ProductOrder productOrder = orderRetriever.retrieve();

        OrderProcessor orderProcessor = new OrderProcessor(new InformationTraditional(), new AGDOrderService(), new AGDOrderRepository());

        orderProcessor.process(productOrder);

    }

}
