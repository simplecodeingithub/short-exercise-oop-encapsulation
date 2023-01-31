package com.techreturners.encapsulation.bankaccount.model;

public class HotOrColdTemperature {
    private static final double HOT_TEMPERATURE=30.0;
    private static final double COLD_TEMPERATURE=10.0;

    public static String HotColdTemperature(double temperature){
        if (temperature > HOT_TEMPERATURE) {

            return "It's too hot 🥵!";

        } else if (temperature < COLD_TEMPERATURE) {

            return "It's too cold 🥶!";

        }
        return "Ahhh...it's just right 😊!";
    }
}

