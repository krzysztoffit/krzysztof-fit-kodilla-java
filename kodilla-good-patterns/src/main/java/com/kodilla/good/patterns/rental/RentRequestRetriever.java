package com.kodilla.good.patterns.rental;

import java.time.LocalDateTime;

public class RentRequestRetriever {

    public RentRequest retrieve() {
        User user = new User("John", "Wekl");

        LocalDateTime rentFrom = LocalDateTime.of(2024, 5, 10, 8, 0, 0);
        LocalDateTime rentTo = LocalDateTime.of(2024, 5, 20, 16, 0, 0);

        return new RentRequest(user, rentFrom, rentTo);
    }
}
