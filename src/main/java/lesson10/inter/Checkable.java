package lesson10.inter;

public interface Checkable {
    boolean check();

    default void print(int arg) {
        System.out.println("Печать из интерфеса Checkable");
    }
}