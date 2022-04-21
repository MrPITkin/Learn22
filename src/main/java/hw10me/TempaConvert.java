package hw10me;

import hw10me.enumeration.Thermometer;
import hw10me.interfaceses.ConvertTemperature;

public class TempaConvert implements ConvertTemperature {

    @Override
    public int enumTemp(int number, Thermometer tempSource, Thermometer tempGoal) {

        //System.out.printf("%1$s -> %2$s\n", tempSource, tempGoal);
        System.out.printf("Перевод %1$s -> в %2$s\n", Thermometer.printRus(String.
                valueOf(tempSource)), Thermometer.printRus(String.valueOf(tempGoal)));
        System.out.printf("%1$d -> %2$d\n", number,
                ConvertTemperature.super.enumTemp(number, tempSource, tempGoal));
        return 0;
    }

}
