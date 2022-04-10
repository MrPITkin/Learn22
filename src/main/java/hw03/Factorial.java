package hw03;

public class Factorial {

    public static void main(String[] args) {
        int variableN = 15;
        //Факториал n! = 1 * 2 * 3 * 4 .. * n
        long find = calculateFactorial(variableN);
        double findRecursion = factorialByRecursion(variableN);
        if (find > 0 )
            System.out.println("Факториал числа через цикл " + variableN + " равен " + find);
        else
            System.out.println("Факториал отрицательного числа цикл " + variableN + " не вычисляется ");
        if (findRecursion > 0 )
            System.out.println("Факториал числа через рекурсию " + variableN + " равен " + findRecursion);
        else
            System.out.println("Факториал отрицательного числа рекурсия " + variableN + " не вычисляется ");
    }

    private static long calculateFactorial(int arg1) {
        long result = 1;
        if (arg1 < 0) {
            // факториал не вычисляется для отрицательных числел ?
            return -1;
        } else if (arg1 != 0) {
            for (int i = 2; i <= arg1; i++) {
                result *= i;
            }
        }
        return result;
    }

    private static double factorialByRecursion(int arg1) {
        if (arg1 == 0)
            return 1;
        else if (arg1 < 0) {
            return -321;
        } else {
            return arg1 * factorialByRecursion(arg1 - 1);
        }
    }
}
