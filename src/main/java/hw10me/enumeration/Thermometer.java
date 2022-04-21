package hw10me.enumeration;

public enum Thermometer {
    CELSIUS(0), FAHRENHEIT(32), KELVIN(273);

    private int gradus;

    Thermometer(int param) {
        this.gradus = param;
        //System.out.println("Вызван конструтор enum Thermometer с параметром " + param);
    }

    public static String printRus (String number) {
        switch (number) {
            case "CELSIUS" -> {
                return "градусы Цельсия";
            }
            case "FAHRENHEIT" -> {
                return "градусы Фаренгейта";
            }
            case "KELVIN" -> {
                return "градусы Кельвина";
            }
            default -> {
                return "градусы алкАголя";
            }
        }
    }

}
