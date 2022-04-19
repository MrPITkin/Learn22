package lesson10;

import lesson10.inter.PrintAndCheckAble;

public class Printer extends AbstractPrinter implements PrintAndCheckAble {

    public Printer() {
        super("консоль");
    }

    @Override
    public void print() {
        System.out.printf("Печать из класса %2$s в %s\n", getSource(), this.getClass().getName());
    }

    @Override
    public boolean check() {
        return false;
    }

    @Override
    public void otherPrint() {

    }
}
