package lesson09;

import lesson09.Account;
/*
import lesson09.implementation.PersonalAccount;
import lesson09.implementation.SettlementAccount;
можно заменить подстановкой '*'
*/
import lesson09.implementation.*;

import java.util.Random;

public class AccountLauncher {

    public static void main(String[] args) {
        Random rnd = new Random();

        Account menIvan = new PersonalAccount("Иванов Виталий");
        double summa = 10_000;
        boolean result = menIvan.replenish(summa); // пополнить счёт
        menIvan.activeClient(true);
        summa = 1_000;
        menIvan.withdraw(summa); // снять со счёта
        summa = 5_000;
        menIvan.replenish(summa); // пополнить счёт
        summa = 1_500;
        menIvan.withdraw(summa); // снять со счёта
        System.out.printf("Баланс счёта %s = %f\n", menIvan.getOwner(), menIvan.getBalance());

        Account clientAccount = new PersonalAccount("Арни Шварц");
        clientAccount.activeClient(true);
        clientAccount.setMaxLimit(1_234_567); // установлен верхний предел баланса
        clientAccount.replenish(1_000_000);
        clientAccount.replenish(543_210);

        Account entityAccount = new SettlementAccount("кантора \"Рога и копыта\"");
        entityAccount.activeClient(true);
        entityAccount.setMaxLimit(1_234_567_890); // установлен верхний предел баланса
        entityAccount.replenish(12_000_000);
        entityAccount.replenish(543_210);

        Account companyAccount = new SettlementAccount("аганизэйшэн 'Биру бир'");
        companyAccount.activeClient(true);
        companyAccount.replenish(10_000);

        System.out.printf("Кол-во созданных расчётных счетов = %d\n",
                SettlementAccount.COUNT);
// для модификатора STATIC у полей или методов класса можно обращаться
// к ним напрямую, без создания объектов этого класса

        System.out.printf("БИК = %s\n", PersonalAccount.getBic());

        System.out.printf("Баланс счёта убитыми енотами = %f\n",
                ((SettlementAccount) companyAccount).covertValuta());

        Account menInBlack = new Account();
        menInBlack.activeClient(true);
        menInBlack.withdraw(-99);
        menInBlack.replenish(-199);
        System.out.printf("Баланс счёта %s = %f\n", menInBlack.getOwner(),
                menInBlack.getBalance());

// анонимный класс, созаёт объект; т.к. <BestPersonalAccount> с модификатором <abstract>
        Account anonim = new BestPersonalAccount(""){
            @Override
            protected void printBalance() {}
        };

        Account huchiMen = new BestOfBestPersonalAccount("Тугр");
        huchiMen.activeClient(true);
        huchiMen.withdraw(-123);
        System.out.printf("Баланс счёта %s = %f\n", huchiMen.getOwner(),
                ((BestOfBestPersonalAccount) huchiMen).getBalance());
    }
}
