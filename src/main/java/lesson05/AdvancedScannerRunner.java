package lesson05;

import java.util.Scanner;

public class AdvancedScannerRunner {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Введите целое число:");
        while (!input.hasNextInt()) {
            System.out.println("Неверный ввод. Укажите целое число:");
            input.next();
        }
            int index = input.nextInt();
            System.out.println("Принято целое число " + index);
    }
}