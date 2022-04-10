package hw08.matrix;

import java.util.Random;

public class Matrix {

    /**
     * Верхняя граница(не включая) при генерации значений матрицы
     */
    private static final int MAXIMUM = 10;

    private int[][] dimArray;
    private final int m;
    private final int n;

    public Matrix(int strok, int stolb) {
// это конструктор
        this.m = strok;
        this.n = stolb;
        this.dimArray = new int[strok][stolb];
    }
    /*
    public Matrix(int[][] dimArray) {
        if (dimArray.length > 0) {
            this.dimArray = dimArray;
            this.m = dimArray.length;
            this.n = dimArray[0].length;
        }
    }
*/
    public Matrix(){
        this(2,2);
    }

    public Matrix sumo(Matrix anotherMatrix) {
        if (this.m != anotherMatrix.n || this.n != anotherMatrix.n) {
            return new Matrix();
        }
        Matrix rezult = new Matrix(this.m, this.n);
        for (int i = 0; i < this.dimArray.length; i++) {
            for (int j = 0; j < this.dimArray[i].length; j++) {
                rezult.dimArray[i][j] = this.dimArray[i][j] + anotherMatrix.dimArray[i][j];
            }
        }
        return rezult;
    }

    public Matrix minus(Matrix anotherMatrix) {
        if (this.m != anotherMatrix.n || this.n != anotherMatrix.n) {
            return new Matrix();
        }
        Matrix rezult = new Matrix(this.m, this.n);
        for (int i = 0; i < this.dimArray.length; i++) {
            for (int j = 0; j < this.dimArray[i].length; j++) {
                rezult.dimArray[i][j] = this.dimArray[i][j] - anotherMatrix.dimArray[i][j];
            }
        }
        return rezult;
    }

    public Matrix multiply(Matrix anotherMatrix) {
        if (this.m != anotherMatrix.n || this.n != anotherMatrix.n) {
            return new Matrix();
        }
        Matrix rezult = new Matrix(this.m, this.n);
        for (int i = 0; i < this.dimArray.length; i++) {
            for (int j = 0; j < this.dimArray[i].length; j++) {
                rezult.dimArray[i][j] = this.dimArray[i][j] * anotherMatrix.dimArray[i][j];
            }
        }
        return rezult;
    }

    public Matrix multiK(int factor) {
        Matrix rezult = new Matrix(this.m, this.n);
        for (int i = 0; i < this.dimArray.length; i++) {
            for (int j = 0; j < this.dimArray[i].length; j++) {
                rezult.dimArray[i][j] = this.dimArray[i][j] * factor;
            }
        }
        return rezult;
    }

    public Matrix oneZero() {
// метод РАЗ диагонали единицами
        if (this.m != this.n){
            return new Matrix().oneZero();
        }
        Matrix fillOne = new Matrix(this.m, this.n);
        for (int i = 0; i < this.dimArray.length; i++) {
            for (int j = 0; j < this.dimArray[i].length; j++) {
                    fillOne.dimArray[i][j] =  (i == j || j ==
                            this.dimArray[i].length - i -1) ? 1 : 0;
            }
        }
        return fillOne;
    }

    public static Matrix oneZero(int dim) {
// метод ДВАЗ диагонали единицами
        Matrix fillOne = new Matrix(dim, dim);
        for (int i = 0; i < dim; i++) {
            for (int j = 0; j < dim; j++) {
                    fillOne.dimArray[i][j] =  (i == j || j == dim - i -1) ? 1 : 0;
            }
        }
        return fillOne;
    }

    public static Matrix oneZero3(int dim){
// метод ТРИ диагонали единицами используя существующий метод
        return new Matrix(dim, dim).oneZero();
    }
/*
    public int getM() {
        return m;
    }
    public int getN() {
        return n;
    }
*/
    public int determinant() {
        if (this.m == 2 && this.n == 2) {
            return this.dimArray[0][0] * this.dimArray[1][1] - this.dimArray[0][1] * this.dimArray[1][0];
        } else {
            return Integer.MIN_VALUE;
        }
    }
    public static int determinant2(Matrix argument) {
// при модификаторе static потребуется АРГУМЕНТ - матрица для расчёта её детерминатнта
        return argument.determinant();
    }

    public Matrix transpon(){
// транспонирование матрицы
        Matrix reverse = new Matrix(this.m, this.n);
        for (int i = 0; i < this.dimArray.length; i++) {
            for (int j = 0; j < this.dimArray[i].length; j++) {
                reverse.dimArray[i][j] = this.dimArray[j][i];
            }
        }
        return reverse;
    }

    public Matrix invert() {
// обратная матрица 2 х 2
        int determinant = this.determinant();
        Matrix matInvert = new Matrix();
        if (!(this.m == 2 && this.n == 2)) {
            return matInvert;
        }
        matInvert.fill(new int[][] {
                {dimArray[1][1] / determinant, -dimArray[0][1] / determinant},
                {-dimArray[1][0] / determinant, dimArray[0][0] / determinant} });
        return matInvert;
    }

    public void fill(int[][] values) {
        if (values.length == this.m && this.n == values[0].length) {
            this.dimArray = values;
        }
    }

    public void fill(){
        for (int i = 0; i < dimArray.length; i++) {
            for (int j = 0; j < dimArray[i].length; j++) {
                //dimArray[i][j] = (int) (Math.round(Math.random() * 100));
                dimArray[i][j] = new Random().nextInt(MAXIMUM);
            }
        }
    }

    public void print(String info) {
        System.out.println(info);
        for (int i = 0; i < dimArray.length; i++) {
            System.out.println("----------------");
            for (int j = 0; j < dimArray[i].length; j++) {
                System.out.printf("| %s ", dimArray[i][j]);
            }
            System.out.printf( "|\n");
        }
        System.out.println("----------------");
    }
}
