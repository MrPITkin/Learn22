package lesson09.implementation;

import lesson09.Account;

public class PersonalAccount extends Account {

    public PersonalAccount(String name) {
        super(name);
    }

/* ����������� <final> � ����������� ������ ��������� ��������������� ������
    public double getBalance() {
        return -123;
    }
*/

    public static String getBic() {
        // double balance = this.getBalance();  ��������
        return "123456789";
    }
}
