package lesson06;

import java.util.Arrays;

public class ModifyArrayRunner {

    public static void main(String[] args) {
        int[] digitts = {10, 9, 8, 7, 6, 5, 4, 3, 2, 1};
        int[] number = digitts; // ссылка на один массив
        for (int i = 0; i < number.length ; i++) {
            number[i] += 100;
        }
        System.out.println(Arrays.toString(digitts));
        System.out.println(Arrays.toString(number));
        int[] anotherDigits = new int[digitts.length+1];
        for (int i = 0; i < anotherDigits.length ; i++) {
            anotherDigits[i] += 123;
        }
        System.out.println(Arrays.toString(anotherDigits));
    }
}
