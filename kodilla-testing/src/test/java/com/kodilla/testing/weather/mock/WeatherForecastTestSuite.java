package com.kodilla.testing.weather.mock;

import com.kodilla.testing.weather.stub.Temperatures;
import com.kodilla.testing.weather.stub.WeatherForecast;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import java.util.HashMap;
import java.util.Map;

import static org.mockito.Mockito.when;

@ExtendWith(MockitoExtension.class)
public class WeatherForecastTestSuite {

    @Mock
    Temperatures temperaturesMock;
    Map<String, Double> temperaturesMap = Map.of(
            "Rzeszow", 25.5,
            "Krakow", 26.2,
            "Wroclaw", 24.8,
            "Warszawa", 26.2,
            "Gdansk", 26.1
    );

    @BeforeEach
    void temperaturesMapCreating() {
        Map<String, Double> temperaturesMap = new HashMap<>();
        temperaturesMap.put("Rzeszow", 25.5);
        temperaturesMap.put("Krakow", 26.2);
        temperaturesMap.put("Wroclaw", 24.8);
        temperaturesMap.put("Warszawa", 26.2);
        temperaturesMap.put("Gdansk", 26.1);
    }

    @Test
    void testCalculateForecastWithMock() {
        // given
        when(temperaturesMock.getTemperatures()).thenReturn(temperaturesMap);
        WeatherForecast weatherForecast = new WeatherForecast(temperaturesMock);

        // when
        int quantityOfSensors = weatherForecast.calculateForecast().size();

        // then
        Assertions.assertEquals(5, quantityOfSensors);

    }

    @Test
    void testAverageTemperature() {
        // given
        when(temperaturesMock.getTemperatures()).thenReturn(temperaturesMap);
        WeatherForecast weatherForecast = new WeatherForecast(temperaturesMock);

        // when
        Double averageTemperature = weatherForecast.averageTemperature(temperaturesMock);

        // then
        Double average = (25.5 + 26.2 + 24.8 + 26.2 + 26.1) / 5;
        Assertions.assertEquals(average, averageTemperature);

    }

    @Test
    void testMedianTemperature() {
        // given
        when(temperaturesMock.getTemperatures()).thenReturn(temperaturesMap);
        WeatherForecast weatherForecast = new WeatherForecast(temperaturesMock);

        // when
        Double medianTemperature = weatherForecast.medianTemperature(temperaturesMock);

        // then
        Double median = 26.1;
        Assertions.assertEquals(median, medianTemperature);
    }
}
