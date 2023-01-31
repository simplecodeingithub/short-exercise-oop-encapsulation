package com.techreturners.encapsulation.bankaccount.model;

import java.text.MessageFormat;

public class WeatherReporter {

    public String location;
    public double temperature;


    private final double TEMP_CONVERT_DIVIDER=(9.0/5.0);
    private final int TEMP_CONVERT_ADD=32;

    public WeatherReporter(String location, double temperature) {
        this.location = location;
        this.temperature = temperature;
    }

    public String printLocation() {

        double newTemp = TEMP_CONVERT_DIVIDER * temperature + TEMP_CONVERT_ADD;
        return MessageFormat.format("I am in {0} and it is {1}. {2}. The temperature in Fahrenheit is {3}.", location, SunnyWeather.checkSunnyWeather(location), HotOrColdTemperature.HotColdTemperature(temperature), newTemp);

    }
}
