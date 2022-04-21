package hw10ivanaff.impl;

import hw10ivanaff.Convertable;
import hw10ivanaff.TemperatureValue;

public class FahrenheitToKelvinConverter implements Convertable {
    @Override
    public double convert(TemperatureValue value) {
        return (value.getValue() - FahrenheitToCelsiusConverter.DELTA) / FahrenheitToCelsiusConverter.KOEFFICIENT + CelsiusToKelvinConverter.DELTA;
    }
}
