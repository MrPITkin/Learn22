package lesson07;

import java.util.Arrays;
import java.util.Comparator;

public class ArraySortRunner {

    public static void main(String[] args) {
        Integer[] nums = {78, 65, 125, 11};
        System.out.printf("Получите массив:\n %s", Arrays.toString(nums));
        Arrays.sort(nums, Comparator.reverseOrder());
        System.out.printf("\n\nМассив с сортом по убиванию:\n %s", Arrays.toString(nums));
        System.out.printf("\nСложение числа %d с числом %d = %d", 3, nums[0], summa(3, nums[0]));
    }

    private static int summa(int arg1, int arg2){
        return arg1 + arg2;
    }
}