package lesson06;

import java.util.Arrays;
import java.util.Random;

public class ArrayRunner {

    public static void main(String[] args) {
        char[] symbol = new char[10];
//        symbol[0] = '\u0000'; // 0
        arrayPrint(symbol);
        arrayFill(symbol);
        System.out.println("\n������� ������.");
        arrayPrint(symbol);
        System.out.println("\n����� �������� � �������.");
        int number = indexOf(symbol, '�');
        System.out.println(number < 0 ? "�������� � ������� �����������." :
                "���������� ����� �������� �������� � �������: " + (int) (number + 1));
        number = indexOf(symbol, '�');
        System.out.println(number < 0 ? "�������� � ������� �����������." :
                "���������� ����� �������� �������� � �������: " + (int) (number + 1));
        System.out.println("������� ������� � ������:");
        System.out.println(String.valueOf(symbol));
        System.out.println("\n� ������ �� ������� �������:");
        arrayPrint(symbol);

        int[] intArray = new int[100]; // ����� ����������� ��� ������� ���������������� 0
        boolean[] logic = new boolean[5]; // ����������� 0 ������������ "false"
        System.out.println("\n\n" + logic[3]);
        String[] stroka = new String[3];
        System.out.println(stroka[2]); // ��������� ��� ���������������� null
        double[] array8byte = new double[]{2.7, -.3, 56};
        System.out.println(Arrays.toString(array8byte));
        String[] stringi = {"Hi !", "���� ���"};
        // String err = stringi[7]; ������ ��������� - �� ������� ������� �������
        System.out.println(Arrays.toString(stringi));

        String[] wikiDiki = weekDays();
        if (wikiDiki != null) {
            System.out.println("����� ������� = " + wikiDiki.length);
        } else {
            System.out.println("������ ���� �������� = null");
        }
        System.out.println("����� ������� = " + dikiWiki().length);
    }

    private static void arrayPrint(char[] symbols) {
        for (int i = 0; i < symbols.length; i++) {
            System.out.print(symbols[i] + ", ");
        }
        System.out.println("\n���������� � ������ ���� � ������ ����� foreach:");
        for (char element: symbols) {
            System.out.print((int) (element) + ", ");
        }
    }

    private static void arrayFill(char[] symbol) {
        //for (int i = 0; i < symbol.length; i++) {
        symbol[0] = '�';
        symbol[1] = '�';
        symbol[2] = '�';
        symbol[3] = '�';
        symbol[4] = '�';
        symbol[5] = '�';
        symbol[6] = '�';
        symbol[7] = '�';
        symbol[8] = '�';
        symbol[9] = '�';
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
        Math.random(); // ��� double [0..1) - ������� 0, �� ������� 1
        Random pseudo =new Random();
        return pseudo.nextBoolean() ? new String[] {"Mon", "Tue", "Wen"} : null;
    }

    private static String[] dikiWiki() {
        Math.random(); // ��� double [0..1) - ������� 0, �� ������� 1
        Random pseudo =new Random();
        return pseudo.nextBoolean() ? new String[] {"Mon", "Tue", "Wen", "�������"} : new String[]{};
    }
}
