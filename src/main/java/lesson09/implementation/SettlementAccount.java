package lesson09.implementation;

import lesson09.Account;
//import lesson09.Course;
// ������ ���������� STATIC ����������
import static lesson09.Course.CURRENT_VALUE;

public class SettlementAccount extends Account {

    public static int COUNT = 0;
// ��� ������������ STATIC � ����� ��� ������� ������ ����� ����������
// � ��� ��������, ��� �������� �������� ����� ������

    public SettlementAccount(String name) {
        super(name);
        ++COUNT;
    }

    //private static final double KURS = 81.23; // $1 = 81.23 ���.

    public double covertValuta() {
        if (isBlocked()) {
//������ � PROTECTED ������ ������������� ������ � ��� �� ������
            return 0;
        }
        //return this.getBalance() / Course.CURRENT_VALUE;
        // ������������� STATIC ����������, ���� ��������� � IMPORT
        return this.getBalance() / CURRENT_VALUE;
    }
}
