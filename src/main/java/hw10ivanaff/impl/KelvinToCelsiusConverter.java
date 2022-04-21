package hw10ivanaff.impl;

import hw10ivanaff.Convertable;
import hw10ivanaff.TemperatureValue;

import static hw10ivanaff.impl.CelsiusToKelvinConverter.DELTA;

public class KelvinToCelsiusConverter implements Convertable {

    @Override
    public double convert(TemperatureValue value) {
        return value.getValue() - DELTA;
    }
}
