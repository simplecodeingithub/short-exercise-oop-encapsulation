package com.techreturners.encapsulation.bankaccount.model;

public class SunnyWeather {

    public static String checkSunnyWeather(String location){
        if (location.equalsIgnoreCase("London") ) {

            return "🌦";

        } else if (location.equalsIgnoreCase("Califorina")) {

            return "🌅";

        } else if (location.equalsIgnoreCase("Cape Town")) {

            return "🌤";

        }
        return "🔆";
    }
}
