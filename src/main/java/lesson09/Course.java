package lesson09;

public final class Course {
// ����������� <final> �������� ������������ ������

    public static double CURRENT_VALUE = 75.43;

// � ��������� ������ ����������� ������������ THIS.
// � ��������� ������ ������ ���������� � ������������ �������
    public static void changeCourse(double newValue) {
        CURRENT_VALUE = newValue;
    }
}
