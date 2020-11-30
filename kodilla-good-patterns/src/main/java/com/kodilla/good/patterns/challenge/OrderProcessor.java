package com.kodilla.good.patterns.challenge;

public class OrderProcessor {

    public InformationService informationService;
    public ProductOrder productOrder;
    public OrderRepository orderRepository;

    public OrderProcessor(final InformationService informationService, final ProductOrder productOrder, final OrderRepository orderRepository) {
        this.informationService = informationService;
        this.orderRepository = orderRepository;
        this.productOrder = productOrder;
    }

    public OrderDto process(final ProductOrder productOrder) {
        boolean isOrdered = ProductOrderService.order(productOrder.getUser(), productOrder.getOrderDate(), productOrder.getProduct(), productOrder.getQuantity());
        if (isOrdered) {
            InformationService.informUser();
            OrderRepository.ordered(productOrder.getUser(), productOrder.getOrderDate(), productOrder.getProduct(), productOrder.getQuantity());

        }
        return new OrderDto(productOrder.getUser(), productOrder.getProduct());
    }

}
