package lesson10.inter;

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
}
