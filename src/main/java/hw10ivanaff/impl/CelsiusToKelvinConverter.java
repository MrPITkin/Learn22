package hw10ivanaff.impl;

import hw10ivanaff.Convertable;
import hw10ivanaff.TemperatureValue;

public class CelsiusToKelvinConverter implements Convertable {

    public static final double DELTA = 273.15;

    @Override
    public double convert(TemperatureValue value) {
        return value.getValue() + DELTA;
    }
}
