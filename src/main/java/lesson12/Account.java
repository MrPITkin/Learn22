package lesson12;

import lesson12.exception.NotEnoughMoneyException;

public class Account {
    private double balance;

    public Account(double balance) {
        this.balance = balance;
    }

    public void deposit(double amount) {
        balance += amount;
    }

    public double withdraw(double amount) {
        if (balance < amount) {
/*
            throw new IllegalArgumentException("Произошла ошибка снятия денежных средств." +
                    "Текущий баланс меньше суммы снятия");
*/
            throw new NotEnoughMoneyException(this.balance, "Произошла ошибка снятия денежных средств." +
                    "Текущий баланс меньше суммы снятия");
        }
        this.balance -= amount;
        return this.balance;
    }

    public double getBalance() {
        return balance;
    }
}
