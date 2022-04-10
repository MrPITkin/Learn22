package lesson09;

import lesson09.Account;
/*
import lesson09.implementation.PersonalAccount;
import lesson09.implementation.SettlementAccount;
����� �������� ������������ '*'
*/
import lesson09.implementation.*;

import java.util.Random;

public class AccountLauncher {

    public static void main(String[] args) {
        Random rnd = new Random();

        Account menIvan = new PersonalAccount("������ �������");
        double summa = 10_000;
        boolean result = menIvan.replenish(summa); // ��������� ����
        menIvan.activeClient(true);
        summa = 1_000;
        menIvan.withdraw(summa); // ����� �� �����
        summa = 5_000;
        menIvan.replenish(summa); // ��������� ����
        summa = 1_500;
        menIvan.withdraw(summa); // ����� �� �����
        System.out.printf("������ ����� %s = %f\n", menIvan.getOwner(), menIvan.getBalance());

        Account clientAccount = new PersonalAccount("���� �����");
        clientAccount.activeClient(true);
        clientAccount.setMaxLimit(1_234_567); // ���������� ������� ������ �������
        clientAccount.replenish(1_000_000);
        clientAccount.replenish(543_210);

        Account entityAccount = new SettlementAccount("������� \"���� � ������\"");
        entityAccount.activeClient(true);
        entityAccount.setMaxLimit(1_234_567_890); // ���������� ������� ������ �������
        entityAccount.replenish(12_000_000);
        entityAccount.replenish(543_210);

        Account companyAccount = new SettlementAccount("����������� '���� ���'");
        companyAccount.activeClient(true);
        companyAccount.replenish(10_000);

        System.out.printf("���-�� ��������� ��������� ������ = %d\n",
                SettlementAccount.COUNT);
// ��� ������������ STATIC � ����� ��� ������� ������ ����� ����������
// � ��� ��������, ��� �������� �������� ����� ������

        System.out.printf("��� = %s\n", PersonalAccount.getBic());

        System.out.printf("������ ����� ������� ������� = %f\n",
                ((SettlementAccount) companyAccount).covertValuta());

        Account menInBlack = new Account();
        menInBlack.activeClient(true);
        menInBlack.withdraw(-99);
        menInBlack.replenish(-199);
        System.out.printf("������ ����� %s = %f\n", menInBlack.getOwner(),
                menInBlack.getBalance());

// ��������� �����, ����� ������; �.�. <BestPersonalAccount> � ������������� <abstract>
        Account anonim = new BestPersonalAccount(""){
            @Override
            protected void printBalance() {}
        };

        Account huchiMen = new BestOfBestPersonalAccount("����");
        huchiMen.activeClient(true);
        huchiMen.withdraw(-123);
        System.out.printf("������ ����� %s = %f\n", huchiMen.getOwner(),
                ((BestOfBestPersonalAccount) huchiMen).getBalance());
    }
}
