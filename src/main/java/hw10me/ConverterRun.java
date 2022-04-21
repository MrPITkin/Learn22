package hw10me;

import hw10me.enumeration.Thermometer;
import hw10me.interfaceses.ConvertTemperature;

public class ConverterRun {
    public static void main(String[] args) {
        // ковертируемая величина
        int inputTempa = -0;

        ConvertTemperature objectCT = new TempaConvert();
        //objectCT.conversia();
        //objectCT.enumTemp(inputTempa, Thermometer.KELVIN, Thermometer.KELVIN);
        //objectCT.enumTemp(inputTempa, Thermometer.CELSIUS, Thermometer.CELSIUS);
        //objectCT.enumTemp(inputTempa, Thermometer.FAHRENHEIT, Thermometer.FAHRENHEIT);
        inputTempa = -123_456_789;
        objectCT.enumTemp(inputTempa, Thermometer.CELSIUS, Thermometer.FAHRENHEIT);
        objectCT.enumTemp(inputTempa, Thermometer.FAHRENHEIT, Thermometer.CELSIUS);
        objectCT.enumTemp(inputTempa, Thermometer.KELVIN, Thermometer.CELSIUS);
        objectCT.enumTemp(inputTempa, Thermometer.CELSIUS, Thermometer.KELVIN);
        objectCT.enumTemp(inputTempa, Thermometer.FAHRENHEIT, Thermometer.KELVIN);
        objectCT.enumTemp(inputTempa, Thermometer.KELVIN, Thermometer.FAHRENHEIT);
    }

}
