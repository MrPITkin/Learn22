package hw06;

import java.util.Random;

public class Print3dArray {
    public static void main(String[] args) {
        int[][][] rezult = new int[][][]{{{111, 222, 113}, {333, 444, 123}, {555, 666, 133}},
                {{111, 222, 222, 222, 222, 216}, {333, 444, 222, 222, 225}},
                {{111, 312}, {333, 444, 323}, {555, 222, 666, 334}, {555, 222, 222, 666, 345}}};

        //int[][][] rezult = new int[2][3][4];
        System.out.println(" *** 3D массив ***");
        for (int i = 0; i < rezult.length; i++) {
            for (int j = 0; j < rezult[i].length; j++) {
                int z = rezult[i][j].length-1;
                for (int k = 0; k < z; k++) {
                    rezult[i][j][k] = new Random().nextInt(10);
                    System.out.printf("| X%d Y%d Z%d = %s ", i+1, j+1, k+1, rezult[i][j][k]);
                }
                System.out.printf("| X%d Y%d Z%d = %s |\n", i+1, j+1, z+1, rezult[i][j][z]);
            }
            System.out.println("----------------");
        }
    }
}
