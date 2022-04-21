package hw10ivanaff.impl;

import hw10ivanaff.Convertable;
import hw10ivanaff.TemperatureValue;

public class IdentityConverter implements Convertable {

    @Override
    public double convert(TemperatureValue value) {
        return value.getValue();
    }
}
