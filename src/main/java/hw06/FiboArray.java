package hw06;

import java.util.Scanner;

public class FiboArray {

    public static void main(String[] args) {
        int fiboIndex;
        Long[] listFibo = new Long[45];
        listFibo[0] = listFibo[1] = 1L;
        int lastValue = 2; // номер первого НЕВЫЧИСЛЕННОГО элемента
        do {
            System.out.println("Для завершения работы введите целое отрицательное число.\n" +
                    "Задайте положительное целое число для расчёта ряда Фибоначчи:");
            Scanner input = new Scanner(System.in);
            while (!input.hasNextInt()) {
                input.next();
                System.out.println("Ошибочный ввод. Укажите целое число:");
            }
            fiboIndex = input.nextInt();
            if (fiboIndex <= listFibo.length){
                System.out.println("Принято число: " + fiboIndex);
                if (fiboIndex > 0) {
                    if (listFibo[fiboIndex-1] == null) {
                        System.out.println("Опаньки ! ПОДСЧИТАЕМ.\n" + fiboIndex +
                                "-ый член последовательности Фибоначчи = " + fiboPrint(listFibo,
                                fiboIndex, lastValue));
                        lastValue = fiboIndex; // номер первого НЕВЫЧИСЛЕННОГО элемента
                    } else {
                        System.out.println("Эсть такая буква в этом слове. НАЙДЕНО.\n" +
                                fiboIndex +"-ый член последовательности Фибоначчи = "
                                + listFibo[fiboIndex-1]);
                    }
                } else {
                    if (fiboIndex == 0) {
                        System.out.println("Нулевой член последовательности Фибоначчи = 0");
                    }
                }
            } else {
                System.out.println("Ай! Улетели за границу массива!");
            }
        }
        while (fiboIndex >= 0);
        System.out.println("Have a nice day.");
    }

    private static long fiboPrint(Long[] sourceArray, int number, int startIndex) {
        if (number > 2) {
            return calcFibo(sourceArray, number, startIndex);
        } else {
            return 1;
        }
    }

    private static long calcFibo(Long[] destinationArray, int seqNumber, int begin) {
        // аргумент end содержит номер+1 последнего ВЫЧИСЛЯЕМОГО элемента
        // аргумент begin содержит номер первого НЕВЫЧИСЛЕННОГО элемента
        for (int i = begin; i < seqNumber ; i++) {
            destinationArray[i] = destinationArray[i-1] + destinationArray[i-2];
        }
        return destinationArray[seqNumber-1];
    }
}
