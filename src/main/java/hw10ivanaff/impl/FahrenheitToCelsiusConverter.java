package hw10ivanaff.impl;

import hw10ivanaff.Convertable;
import hw10ivanaff.TemperatureValue;

public class FahrenheitToCelsiusConverter implements Convertable {

    public static final int DELTA = 32;

    public static final double KOEFFICIENT = 1.8; // 9 / 5

    @Override
    public double convert(TemperatureValue value) {
        return (value.getValue() - DELTA) / KOEFFICIENT;
    }
}
