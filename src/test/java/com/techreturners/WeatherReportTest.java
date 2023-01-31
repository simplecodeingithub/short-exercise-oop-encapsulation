package com.techreturners;

import com.techreturners.encapsulation.bankaccount.model.WeatherReporter;
import org.junit.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class WeatherReportTest {
    @Test
    public void testWeatherforCity(){
        WeatherReporter report=new WeatherReporter("Isleworth",12.0);
        String expectedWeather="I am in Isleworth and it is 🔆. Ahhh...it's just right 😊!. The temperature in Fahrenheit is 53.6.";
        String actualWeather=report.printLocation();
        assertEquals(expectedWeather,actualWeather);
    }

    @Test
    public void testWeatherforCapeTown(){
        WeatherReporter report=new WeatherReporter("Cape Town",40);
        String expectedWeather="I am in Cape Town and it is 🌤. It's too hot 🥵!. The temperature in Fahrenheit is 104.";
        String actualWeather=report.printLocation();
        assertEquals(expectedWeather,actualWeather);

    }
}
