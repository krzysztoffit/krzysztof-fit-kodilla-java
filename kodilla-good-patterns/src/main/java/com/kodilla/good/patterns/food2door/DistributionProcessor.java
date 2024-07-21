package com.kodilla.good.patterns.food2door;

public class DistributionProcessor {

    private final DistributionService distributionService;

    public DistributionProcessor(DistributionService distributionService) {
        this.distributionService = distributionService;
    }

    public DistributionDto distributionProcess(final DistributionRequest distributionRequest) {
        boolean isDistributed = distributionService.distribution(
                distributionRequest.getDistributor(),
                distributionRequest.getClient(),
                distributionRequest.getQuantity(),
                distributionRequest.getProduct()
        );
        if (isDistributed) {
            return new DistributionDto(distributionRequest.getClient(), true);
        } else {
            return new DistributionDto(distributionRequest.getClient(), false);
        }
    }


}
