import com.kodilla.good.patterns.challenge.*;

public class GoodPatternsMain {

    public static void main(String[] args) {

        ProductOrderRetriever orderRetriever = new ProductOrderRetriever();
        ProductOrder productOrder = orderRetriever.retrieve();

        OrderProcessor orderProcessor = new OrderProcessor(new InformationService(), new ProductOrder(productOrder.getUser(), productOrder.getOrderDate(), productOrder.getProduct(), productOrder.getQuantity()), new OrderRepository());

        orderProcessor.process(productOrder);
    }

}
