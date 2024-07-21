package com.kodilla.good.patterns.challenges;

public class OrderDto {

    private final Customer customer;
    private final boolean isOrdered;

    public OrderDto(final Customer customer, final boolean isOrdered) {
        this.customer = customer;
        this.isOrdered = isOrdered;
    }

    public Customer getCustomer() {
        return customer;
    }

    public boolean isOrdered() {
        return isOrdered;
    }
}
