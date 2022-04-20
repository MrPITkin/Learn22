package lesson10.enumeration;

import java.util.Locale;

public enum Language {
    RUSSIAN(1), ENGLISH(2), GERMAN(3), FRENCH(4);

    private int index;

    Language(int index) {
        this.index = index;
    }

    public static Language obratka (int number) {
        for (Language val : values()) {
            if (val.index == number) {
                return val;
            }
        }
        return Language.RUSSIAN;
    }

    public String toStr() {
        return name().toLowerCase();
    }
}
