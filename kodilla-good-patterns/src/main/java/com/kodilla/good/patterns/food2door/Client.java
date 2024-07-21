package com.kodilla.good.patterns.food2door;

public class Client {

    private final String username;
    private final String firstname;
    private final String lastname;
    private final String email;
    private final String address;
    private final Long telephone;

    public Client(
            String username,
            String firstname,
            String lastname,
            String email,
            String address,
            Long telephone
    ) {
        this.username = username;
        this.firstname = firstname;
        this.lastname = lastname;
        this.email = email;
        this.address = address;
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

    public String getEmail() {
        return email;
    }

    public String getAddress() {
        return address;
    }

    public Long getTelephone() {
        return telephone;
    }
}
