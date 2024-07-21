package com.kodilla.good.patterns.challenges;

public class OrderProcessor {

    private final NotificationService notificationService;
    private final OrderService orderService;
    private final OrderRepository orderRepository;

    public OrderProcessor(
            final NotificationService notificationService,
            final OrderService orderService,
            final OrderRepository orderRepository
    ) {
        this.notificationService = notificationService;
        this.orderService = orderService;
        this.orderRepository = orderRepository;
    }

    public OrderDto process(final OrderRequest orderRequest) {
        boolean isOrdered = orderService.order(
                orderRequest.getCustomer(),
                orderRequest.getProduct(),
                orderRequest.getDeliveryProvider()
        );
        if (isOrdered) {
            notificationService.sendNotification(orderRequest.getCustomer());
            orderRepository.createOrder(orderRequest.getCustomer(), orderRequest.getProduct(), orderRequest.getDeliveryProvider());
            return new OrderDto(orderRequest.getCustomer(), true);
        } else {
            return new OrderDto(orderRequest.getCustomer(), false);
        }
    }
}
