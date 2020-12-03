package com.kodilla.spring.good.patterns.challenge;

public class OrderProcessor {

    public InfoGeneral infoGeneral;
    public RepoGeneral repoGeneral;
    public OrderServiceGeneral orderServiceGeneral;

    public OrderProcessor(InfoGeneral infoGeneral, OrderServiceGeneral orderServiceGeneral, RepoGeneral repoGeneral) {
        this.infoGeneral = infoGeneral;
        this.orderServiceGeneral = orderServiceGeneral;
        this.repoGeneral = repoGeneral;

    }

    public OrderDto process(final ProductOrder productOrder) {
        boolean isOrdered = orderServiceGeneral.order(productOrder.getUser(), productOrder.getOrderDate(), productOrder.getProduct(), productOrder.getQuantity());
        if (isOrdered) {
            infoGeneral.informUser();
            repoGeneral.ordered(productOrder.getUser(), productOrder.getOrderDate(), productOrder.getProduct(), productOrder.getQuantity());
            return new OrderDto(productOrder.getUser(), true);
        } else {
            return new OrderDto(productOrder.getUser(), false);
        }

        }

    }
