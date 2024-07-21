package com.kodilla.good.patterns.rental;

import java.time.LocalDateTime;

public class CarRentalService implements RentalService {

    public boolean rent(final User user, final LocalDateTime carRentFrom, final LocalDateTime carRentTo) {
        System.out.println("Renting Car for: " + user.getName() + user.getSurname()
        + " from: " + carRentFrom.toString() + " to: " + carRentTo.toString());

        MailService mailService = new MailService();
        mailService.inform(user);

        CarRentalRepository carRentalRepository = new CarRentalRepository();
        carRentalRepository.createRental(user, carRentFrom, carRentTo);

        return true;
    }
}
