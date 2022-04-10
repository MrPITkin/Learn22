package hw08.matrix;

import java.util.Arrays;
import java.util.Random;

public class MatrixRunner {

    public static void main(String[] args) {
        Matrix matA = new Matrix();
        matA.fill();
        matA.print("������� �");
        Matrix matB = new Matrix();
        matB.fill();
        matB.print("������� B");

        Matrix matC = matA.sumo(matB);
        matC.print("������� � = A + B");

        Matrix matD = matB.minus(matA);
        matD.print("������� D = B - A");

        Matrix matM = matC.multiply(matD);
        matM.print("������� M = C * D");

        Matrix matF = matM.multiK(-10);
        matF.print("������� F = M * (-10)");

        Matrix matY = new Matrix();
        matY.oneZero().print("������� '1' �� ����������");
        // ����� ��� ��������� ��������� (����� oneZero ��� ������������ static)

        Matrix matZ = new Matrix(6,6);
        matZ.oneZero().print("������� '1' �� ����������");
        // ����� ��� ��������� ��������� (����� oneZero ��� ������������ static)

        Matrix.oneZero(4).print("������� '1' �� ����������");
        // ����� ���� ��������� ��������� (����� oneZero ����������� static)

        Matrix.oneZero3(5).print("������� '1' �� ����������");
        // ����� ��� ��������� ��������� (����� oneZero3 ����������� static)

        System.out.printf("������������ ������� A �������� 2x2 = %d\n",
                matA.determinant());
        System.out.printf("������������ ������� B �������� 2x2 = %d\n",
                Matrix.determinant2(matB));

        Matrix transposition = matC.transpon();
        transposition.print("����������������� ������� C");

        Matrix invert = matA.invert();
        invert.print("�������� ������� A � ������������� �������." +
                " �� ����� ��������� ����� ����� � ������� ����� ���������");
/* PIT ���������
        float[][] invertFloat = new float[2][2];
        for (int i = 0; i < invertFloat.length; i++) {
            for (int j = 0; j < invertFloat[i].length; j++) {
                invertFloat[i][j] = new Random().nextFloat(10);
                System.out.printf("| %f ", invertFloat[i][j]);
            }
            System.out.printf( "\n----------------\n");
        }
        float determ = invertFloat[0][0] * invertFloat[1][1] - invertFloat[0][1] * invertFloat[1][0];
        System.out.printf("����������� = %f\n", determ);
        float[][] invert2 = new float[2][2];
        System.out.println("�������� ������� � ������������� �������.");
        invert2[0][0] = invertFloat[1][1] / determ;
        invert2[0][1] = -invertFloat[0][1] / determ;
        invert2[1][0] = -invertFloat[1][0] / determ;
        invert2[1][1] = invertFloat[0][0] / determ;
        for (int i = 0; i < invert2.length; i++) {
            for (int j = 0; j < invert2[i].length; j++) {
                System.out.printf("| %f ", invert2[i][j]);
            }
            System.out.printf( "\n----------------\n");
        }
*/
    }
}
