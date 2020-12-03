package com.kodilla.spring.testing.weather.mock;

import com.kodilla.spring.testing.weather.stub.Temperatures;
import com.kodilla.spring.testing.weather.stub.WeatherForecast;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.mockito.Mockito.mock;

class WeatherForecastTestSuite {

    @Test
    void testCalculateForecastWithMock() {
        //Given
        Temperatures temperaturesMock = mock(Temperatures.class);
        WeatherForecast weatherForecast = new WeatherForecast(temperaturesMock);

        //When
        int quantityOfSensors = weatherForecast.calculateForecast().size();

        //Then
        Assertions.assertEquals(5, quantityOfSensors);
    }
}