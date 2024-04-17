package com.kodilla.testing.weather.stub;

import java.util.*;

public class WeatherForecast {

    private Temperatures temperatures;

    public WeatherForecast(Temperatures temperatures) {
        this.temperatures = temperatures;
    }

    public Map<String, Double> calculateForecast() {
        Map<String, Double> resultMap = new HashMap<>();

        for (Map.Entry<String, Double> temperature : temperatures.getTemperatures().entrySet()) {
            resultMap.put(temperature.getKey(), temperature.getValue() + 1.0);
        }
        return resultMap;
    }

    public Double averageTemperature(Temperatures temperatures) {
        Double average = 0.0;
        for (Map.Entry<String, Double> temperature : temperatures.getTemperatures().entrySet()) {
            average += temperature.getValue();
        }
        return average / temperatures.getTemperatures().size();
    }

    public Double medianTemperature(Temperatures temperatures) {
        Double median;
        List<Double> temperaturesSortedList = new ArrayList<>(temperatures.getTemperatures().values());
        Collections.sort(temperaturesSortedList);
        if (temperaturesSortedList.size() % 2 == 0) {
            int left = (temperaturesSortedList.size() / 2) - 1;
            int right = temperaturesSortedList.size() / 2;
            median = (temperaturesSortedList.get(left) + temperaturesSortedList.get(right)) / 2;
        } else {
            int medianIndex = temperaturesSortedList.size() / 2;
            median = temperaturesSortedList.get(medianIndex);
        }
        return median;
    }
}
