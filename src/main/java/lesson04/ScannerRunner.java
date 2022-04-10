package lesson04;

import java.util.Scanner;

public class ScannerRunner {
    public static void main(String[] args) {
        Scanner vvod = new Scanner(System.in);
        System.out.println("Представьтесь:");
        String userName = vvod.nextLine();
        System.out.println("Хай, " + userName + ". Введите число для расчёта:");
        int value = vvod.nextInt(); // без проверки корректности ввода целого числа
        System.out.println("Подтверждаю. что указано число " + value);
    }
}
