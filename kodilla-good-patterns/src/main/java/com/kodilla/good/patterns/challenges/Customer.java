package com.kodilla.good.patterns.challenges;

public class Customer {

    private final String username;
    private final String firstname;
    private final String lastname;
    private final String physicalAddress;
    private final String emailAddress;
    private final Long telephone;

    public Customer(
            final String username,
            final String firstname,
            final String lastname,
            final String physicalAddress,
            final String emailAddress,
            final Long telephone
    ) {
        this.username = username;
        this.firstname = firstname;
        this.lastname = lastname;
        this.physicalAddress = physicalAddress;
        this.emailAddress = emailAddress;
        this.telephone = telephone;
    }

    public String getUsername() {
        return username;
    }

    public String getFirstname() {
        return firstname;
    }

    public String getLastname() {
        return lastname;
    }

    public String getPhysicalAddress() {
        return physicalAddress;
    }

    public String getEmailAddress() {
        return emailAddress;
    }

    public Long getTelephone() {
        return telephone;
    }
}
