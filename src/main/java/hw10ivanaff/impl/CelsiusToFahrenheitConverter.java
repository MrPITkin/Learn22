package hw10ivanaff.impl;

import hw10ivanaff.Convertable;
import hw10ivanaff.TemperatureValue;

import static hw10ivanaff.impl.FahrenheitToCelsiusConverter.DELTA;
import static hw10ivanaff.impl.FahrenheitToCelsiusConverter.KOEFFICIENT;

public class CelsiusToFahrenheitConverter implements Convertable {

    @Override
    public double convert(TemperatureValue value) {
        return value.getValue() * KOEFFICIENT + DELTA;
    }
}
