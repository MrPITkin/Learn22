package lesson10;

import lesson10.inter.Printable;

public class PrinterLauncher {

    public static void main(String[] args) {
        Printable printable = new Printer();
        // приведение к максимально возможному старшему классу (абстакции) - Printable
        printable.print();
        printable = new FilePrinter();
        printable.print();
        System.out.printf("переменная-константа из interface = %d\n", Printable.INDEX);
        Printable.print("вот так статик метод в итерфейсе");
        printable.print(5*5);
        Printable objectPrint = new Printer();
        objectPrint.print(2*2);
    }
}
