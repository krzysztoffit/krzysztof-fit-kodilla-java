package com.kodilla.good.patterns.food2door;

public class DistributionDto {

    private final Client client;
    private final boolean isDistributed;

    public DistributionDto(Client client, boolean isDistributed) {
        this.client = client;
        this.isDistributed = isDistributed;
    }

    public Client getClient() {
        return client;
    }

    public boolean isDistributed() {
        return isDistributed;
    }
}
