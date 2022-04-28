package lesson11.exception;

import java.io.FileNotFoundException;
import java.util.InputMismatchException;
import java.util.Scanner;

public class ArithmeticRunner {
    public static void main(String[] args) throws CloneNotSupportedException, FileNotFoundException {

        Scanner input = new Scanner(System.in);
        int num1, num2;
        try {
            System.out.printf("дай ка первое ЦЕЛОЕ число:\n");
            num1 = input.nextInt();
        } catch (Exception e) {
            num1 = -12;
            System.out.printf("это НЕ ЦЕЛОЕ число. замена на %1$d.\n", num1);
            input.next();
        }
/*
        while (!input.hasNextInt()) {
            input.next();
            System.out.printf("это НЕ ЦЕЛОЕ число.\n");
        }
        int num1 = input.nextInt();
*/

        //input = new Scanner(System.in);
        try {
            System.out.printf("дай ка второе ЦЕЛОЕ число:\n");
            num2 = input.nextInt();
            int rezult = divide(num1, num2);
            System.out.printf("деление первого числа на второе = %1$d\n", rezult);
/*
        } catch (ArithmeticException e) {
            System.out.printf("деление на 0 недопустимо.\n");
        } catch (InputMismatchException eee) {
            System.out.printf("Ошибочный ввод данных.\n");
            //num2 = 12;
            //System.out.printf("это НЕ ЦЕЛОЕ число. замена на %1$d.\n", num2);
            //input.next();
*/
        } catch (ArithmeticException | InputMismatchException e) {
            System.out.println("Ошибочный ввод данных\n" + e);
        } catch (RuntimeException err) {
            System.out.println("Ошибка при выполнении программы\n" + err);
        } catch (Exception errra) {
            System.out.println("Ошибка обобщённых исключений\n" + errra);
        } finally {

        }
/*
        while (!input.hasNextInt()) {
            input.next();
            System.out.printf("это НЕ ЦЕЛОЕ число.\n");
        }
        int num2 = input.nextInt();
*/
        System.out.println("Продолжаем разговор...");
    }
/*
    private static int divide(int a, int b) {
        try {
            return new Calculator().division(a, b);
        } catch (CloneNotSupportedException err) {
            return -123;
        }
    }
*/
    private static int divide(int a, int b) throws CloneNotSupportedException {
            //return new Calculator().division(a, b);
            return new Calculator().divide(a, b);
    }
}
