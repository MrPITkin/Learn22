package hw06;

import java.util.Arrays;
import java.util.Scanner;

public class ArrayMinMaxAvg {

    public static void main(String[] args) {
        System.out.println("Задайте длину одномерного масТива:");
        Scanner input = new Scanner(System.in);
        while (!input.hasNextInt()) {
            input.next();
            System.out.println("Ошибочный ввод. Укажите положительное целое число:");
        }
        int lengthArray = input.nextInt();
        if (lengthArray > 0) {
            int modify = 100; // коэффициент умножеия псевдослучайных чисел [0..1)
            Double[] calcArray = new Double[lengthArray];
            for (int i = 0; i < calcArray.length; i++) {
                calcArray[i] = Math.random() * modify;
            }

/*      чё-т с null эксэпшеном ошибка форИча из-за плавки ?
            for (double val : calcArray) {
                val = Math.random() * modify;
            }
 */
            System.out.println("Сгенерирован массив:\n" + Arrays.toString(calcArray));
            System.out.println("Минимальное значение среди элементов:" + minArray(calcArray));
            System.out.println("Максимальное значение среди элементов:" + maxArray(calcArray));
            System.out.println("Среднее арифметическое элементов:" + avgArray(calcArray));
        } else {
            System.out.println("Атличный масТив длиной " + lengthArray);
        }
    }

    private static double avgArray(Double[] list) {
        double result = 0;
        for (double every : list) {
                result += every;
        }
        return result/list.length;
    }

    private static double maxArray(Double[] list) {
        double result = list[0];
        for (double every : list) {
            if (every > result) {
                result = every;
            }
        }
        return result;
    }

    private static double minArray(Double[] list) {
        double result = list[0];
        for (double every : list) {
            if (every < result) {
                result = every;
            }
        }
        return result;
    }
}
