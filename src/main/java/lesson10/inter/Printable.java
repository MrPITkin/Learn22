package lesson10.inter;

import lesson10.enumeration.Language;

public interface Printable {
    void print();

    int INDEX = 1;
// поля("переменные") в interface являются константами public static final
// потому лучше избегать в interface констант и юзать методы

    static void print(String str) {
        System.out.println(str);
    }

    default void print(int arg) {
        System.out.printf("переданный в дефолтный метод interface" +
                " параметр int = %d\n", arg);
        print("из дефолтного метода в interface вызван статический метод");
    }

    default void printEnum(Language lang) {
        switch (lang) {
            case FRENCH -> System.out.println("Bonjour le monde");
            case GERMAN -> System.out.println("Hallo Welt");
            case ENGLISH -> System.out.println("Hello World");
            case RUSSIAN -> System.out.println("Привет, мир");
        }
    }

}
