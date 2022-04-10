package lesson06;

import java.util.Arrays;
import java.util.Random;

public class ArrayRunner {

    public static void main(String[] args) {
        char[] symbol = new char[10];
//        symbol[0] = '\u0000'; // 0
        arrayPrint(symbol);
        arrayFill(symbol);
        System.out.println("\nЗаполню массив.");
        arrayPrint(symbol);
        System.out.println("\nПоиск значенмя в массиве.");
        int number = indexOf(symbol, 'ё');
        System.out.println(number < 0 ? "Значение в массиве отсутствует." :
                "Порядковый номер искомого элемента в массиве: " + (int) (number + 1));
        number = indexOf(symbol, 'ю');
        System.out.println(number < 0 ? "Значение в массиве отсутствует." :
                "Порядковый номер искомого элемента в массиве: " + (int) (number + 1));
        System.out.println("Перегон массива в строку:");
        System.out.println(String.valueOf(symbol));
        System.out.println("\nА массив то прежний остался:");
        arrayPrint(symbol);

        int[] intArray = new int[100]; // кроме логического все массивы инициализируются 0
        boolean[] logic = new boolean[5]; // логическому 0 соответсвует "false"
        System.out.println("\n\n" + logic[3]);
        String[] stroka = new String[3];
        System.out.println(stroka[2]); // ссылочный тип инициализируются null
        double[] array8byte = new double[]{2.7, -.3, 56};
        System.out.println(Arrays.toString(array8byte));
        String[] stringi = {"Hi !", "миру мир"};
        // String err = stringi[7]; ошибка выполненя - за пределы границы массива
        System.out.println(Arrays.toString(stringi));

        String[] wikiDiki = weekDays();
        if (wikiDiki != null) {
            System.out.println("ГлинА мастита = " + wikiDiki.length);
        } else {
            System.out.println("Мастит стал пустошью = null");
        }
        System.out.println("ГлинА мастита = " + dikiWiki().length);
    }

    private static void arrayPrint(char[] symbols) {
        for (int i = 0; i < symbols.length; i++) {
            System.out.print(symbols[i] + ", ");
        }
        System.out.println("\nПреобразую к целому типу и вывожу через foreach:");
        for (char element: symbols) {
            System.out.print((int) (element) + ", ");
        }
    }

    private static void arrayFill(char[] symbol) {
        //for (int i = 0; i < symbol.length; i++) {
        symbol[0] = 'а';
        symbol[1] = 'б';
        symbol[2] = 'в';
        symbol[3] = 'г';
        symbol[4] = 'д';
        symbol[5] = 'е';
        symbol[6] = 'ё';
        symbol[7] = 'ж';
        symbol[8] = 'з';
        symbol[9] = 'и';
    }

    private static int indexOf(char[] symbols, char searchEemet) {
        for (int i = 0; i < symbols.length; i++) {
            if (symbols[i] == searchEemet) {
                return i;
            }
        }
        return -123;
    }

    private static String[] weekDays() {
        Math.random(); // тип double [0..1) - включая 0, но искючая 1
        Random pseudo =new Random();
        return pseudo.nextBoolean() ? new String[] {"Mon", "Tue", "Wen"} : null;
    }

    private static String[] dikiWiki() {
        Math.random(); // тип double [0..1) - включая 0, но искючая 1
        Random pseudo =new Random();
        return pseudo.nextBoolean() ? new String[] {"Mon", "Tue", "Wen", "Четверг"} : new String[]{};
    }
}
