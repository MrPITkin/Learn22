package hw10ivanaff.impl;

import hw10ivanaff.Convertable;
import hw10ivanaff.TemperatureValue;

public class KelvinToFahrenheitConverter implements Convertable {

    @Override
    public double convert(TemperatureValue value) {
        return (value.getValue() - CelsiusToKelvinConverter.DELTA) * FahrenheitToCelsiusConverter.KOEFFICIENT
                + FahrenheitToCelsiusConverter.DELTA;
    }
}
