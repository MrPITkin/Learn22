package lesson09;

public class Runner {

    private static Runner ME = new Runner();

    public static void main(String[] args) {
        new Runner().print();
// ��������� �� STATIC � ������ ��� STATIC ������������ ��������� �������

        ME.print();
    }

    private void print() {
        System.out.println("���� � 1 " + ME);
    }
}
