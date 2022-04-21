package hw10me.interfaceses;

import hw10me.enumeration.Thermometer;

public interface ConvertTemperature {
/*
    default void conversia() {
        System.out.println("Вызов метода interface ConvertTemperature");
    }
*/

    default int enumTemp(int number, Thermometer tempSource, Thermometer tempGoal) {
        switch (tempSource) {
            case FAHRENHEIT -> {
                switch (tempGoal) {
                    case FAHRENHEIT -> {
                        //System.out.println("фара -> фара возврат тот же");
                        return number;
                    }
                    case CELSIUS -> {
                        //System.out.println("расчёт фара -> целься и возврат");
                        return (int) Math.round((number - 32) / 1.8);
                    }
                    case KELVIN -> {
                        //System.out.println("расчёт фара -> кельва и возврат");
                        return (int) Math.round((number - 32) / 1.8 + 273.15);
                    }
                }
            }
            case CELSIUS -> {
                switch (tempGoal) {
                    case FAHRENHEIT -> {
                        //System.out.println("расчёт целься -> фара и возврат");
                        return (int) Math.round(number * 1.8 + 32);
                    }
                    case CELSIUS -> {
                        //System.out.println("целься -> целься возврат тот же");
                        return number;
                    }
                    case KELVIN -> {
                        //System.out.println("расчёт целься -> кельва и возврат");
                        return (int) Math.round(number + 273.15);
                    }
                }
            }
            case KELVIN -> {
                switch (tempGoal) {
                    case FAHRENHEIT -> {
                        //System.out.println("расчёт кельва -> фара и возврат");
                        return (int) Math.round((number - 273.15) * 1.8 + 32);
                    }
                    case CELSIUS -> {
                        //System.out.println("кельва -> целься и возврат");
                        return (int) Math.round(number - 273.15);
                    }
                    case KELVIN -> {
                        //System.out.println("кельва -> кельва возврат тот же");
                        return number;
                    }
                }
            }
        }
        return Integer.MIN_VALUE;
    }

}
