package lesson05;

import java.util.Scanner;

public class PrimeNumberRunner {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Укажите предел для вывода ряда простых чисел:");
        while (!input.hasNextInt()) {
            input.next();
            System.out.println("Ожидается ввод целого числа");
        }
        int maxLimit = input.nextInt();
        printPrimeNumbers(maxLimit);
    }

    public static void printPrimeNumbers(int threshold) {
        if (threshold < 3) {
            System.out.println("Ожидается ввод числа > 2");
        } else {
            System.out.print("Ряд простых чисел до " + threshold + "\n2");
        }

        for (int i = 3; i <= threshold; i+=2) {
            if (isPrime(i)) {
                System.out.print(", " + i);
            }
        }
    }

    public static boolean isPrime(int value){
        for (int i = 4; i < value; i++) { // деление числа на себя не проверяется
            if (value % i == 0 ) {
                //return ( i == value ? true : false);
                return false;
            }
        }
        return true;
    }
}
