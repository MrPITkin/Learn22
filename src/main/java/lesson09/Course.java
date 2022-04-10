package lesson09;

public final class Course {
// модификатор <final> запрщает наследование класса

    public static double CURRENT_VALUE = 75.43;

// в статичном методе Ќ≈ ќ––≈ “Ќќ использовать THIS.
// в статичном методе Ќ≈Ћ№«я обращатьс€ к нестатичноым методам
    public static void changeCourse(double newValue) {
        CURRENT_VALUE = newValue;
    }
}
