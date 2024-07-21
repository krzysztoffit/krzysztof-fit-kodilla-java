package com.kodilla.good.patterns.food2door;

public class Application {

    public static void main(String[] args) {
        DistributionRequestRetriever distributionRequestRetriever = new DistributionRequestRetriever();
        DistributionRequest distributionRequest = distributionRequestRetriever.retriever();

        DistributionProcessor distributionProcessor = new DistributionProcessor(
                new ProductDistributionService()
        );

        distributionProcessor.distributionProcess(distributionRequest);
    }
}
