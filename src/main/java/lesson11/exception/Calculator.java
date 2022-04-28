package lesson11.exception;

import lesson11.Car;

public class Calculator {

    private Car tacha;

    public int division(int m, int n) throws CloneNotSupportedException {
        tacha = (Car) new Car().clone(); // это умышленная АБшибка для вызова исключения
        return Math.round(m / n);
    }

    /*protected*/ /*public*/ int divide(int a, int b) {
        try {
            return Math.round(a / b);
        } catch (ArithmeticException rrr) {
            rrr.printStackTrace();
            //  return -100;
        } finally {
            System.out.printf("a = %1$d *** b = %2$d\n", a, b);
//            return -345; // в блоке finally оператор return ПРОТИВОПОКАЗАН
        }
        return -100;
    }

}
