package lesson12;

import lesson12.exception.NotEnoughMoneyException;

public class AccountRunner {
    public static void main(String[] args) {
        Account account = new Account(1_000);
        System.out.println("Текущий баланс " + account.getBalance());
        try {
            int amount = 500;
            account.withdraw(amount);
//        } catch (IllegalArgumentException err) {
//            System.out.println("Снятия не произошло!");
        } catch (NotEnoughMoneyException e) {
            System.out.println("Снятия не произошло! Состояние баланса " + e.getBalance());
        }
        System.out.println("Текущий баланс " + account.getBalance());
    }
}
