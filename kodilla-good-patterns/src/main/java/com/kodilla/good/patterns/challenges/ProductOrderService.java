package com.kodilla.good.patterns.challenges;

public class ProductOrderService implements OrderService {

    public boolean order(final Customer customer, final Product product, final DeliveryProvider deliveryProvider) {
        System.out.println(
                "Customer data: "
                + customer.getUsername() + "\n"
                + customer.getFirstname() + " " + customer.getLastname() + "\n"
                + customer.getPhysicalAddress() + "\n"
                + customer.getEmailAddress() + "\n"
                + customer.getTelephone() + "\n"
        );

        System.out.println("Ordered product: " + product.getName() + " at price: " + product.getPrice() + "\n");

        System.out.println("Selected delivery: " + deliveryProvider.getName());

        NotificationService notificationService = new AppNotification();
        notificationService.sendNotification(customer);

        OrderRepository orderRepository = new ProductOrderRepository();
        orderRepository.createOrder(customer, product, deliveryProvider);

        return true;
    }

}
