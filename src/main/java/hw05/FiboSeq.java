package hw05;

// Числа Фибоначчи — линейная рекуррентная последовательность натуральных чисел,
// где первое и второе равно единице, а каждое последующее — сумме двух предыдущих:
// 1, 1, 2, 3, 5, 8, 13, 21, 34, 55, 89, 144, 233, 377, 610, 987, 1597, 2584, 4181, …
//    F_{0}=0, F_{1}=1,F_{n}=F_{n-1}+F_{n-2}},
//    где   n ⩾ 2 ,   n ∈ Z

import java.util.Scanner;

public class FiboSeq {

    public static void main(String[] args) {
        System.out.println("Задайте положительное целое число для определения позиции в ряду Фибоначчи:");
        Scanner input = new Scanner(System.in);
        while (!input.hasNextInt()) {
            input.next();
            System.out.println("Ошибочный ввод. Укажите положительное целое число:");
        }
        int nFibo = input.nextInt();

        if (nFibo > 0) {
             fiboPrint(nFibo);
        } else if (nFibo == 0) {
            System.out.println("Нулевой член последовательности Фибоначчи = 0");
        } else {
            System.out.println("Для числа " + nFibo + " нет последовательности Фибоначчи.");
        }
    }

    private static void fiboPrint(int number) {
        if (number > 2) {
            System.out.println(number + "-ый член последовательности Фибоначчи = " + calcFibo(number));
            } else {
            System.out.println(number + "-ый член последовательности Фибоначчи = 1");
        }
    }

    private static int calcFibo(int seqNumber) {
        int numberFibo1 = 1 , numberFibo2 = 1;
        for (int i = 3; i <= seqNumber ; i++) {
            numberFibo2 = numberFibo1 + numberFibo2;
            numberFibo1 = numberFibo2 - numberFibo1;
        }
        return numberFibo2;
    }
}
