package lesson09.implementation;

import lesson09.Account;

public class BestOfBestPersonalAccount extends BestPersonalAccount {

    public BestOfBestPersonalAccount(String name) {
        super(name);
    }

    @Override
    protected void printBalance() {
        System.out.printf("<���> ������� �������> = %s\n", BestOfBestPersonalAccount.getBic());
    }
}
