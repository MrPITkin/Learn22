package lesson06;

import java.lang.reflect.Array;
import java.util.Arrays;

public class MatrixRunner {

    public static void main(String[] args) {
        int size = 7;
        int[][] matrix = new int[size][size];
        fillFigure(matrix);
        // System.out.println(Arrays.deepToString(matrix));
        PrintFigure(matrix);
    }

    private static void fillFigure (int[][] array) {
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                if (i == j || j == array[i].length - i -1) {
                    array[i][j] = 1;
                }

            }
        }
    }

    private static void PrintFigure(int[][] array) {
        for (int i = 0; i < array.length; i++) {
            System.out.println(Arrays.toString(array[i]));
        }
    }
}
