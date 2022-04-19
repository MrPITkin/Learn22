package lesson10;

import lesson10.inter.Checkable;
import lesson10.inter.PrintAndCheckAble;
import lesson10.inter.Printable;

public class FilePrinter extends AbstractPrinter implements PrintAndCheckAble {

    public FilePrinter() {
        super("файл");
    }

    @Override
    public void print() {
        //todo реализауия метода печати в файл
        System.out.printf("Печать из класса %s в %2$s\n", this.getClass().getName(), this.getSource());
    }

    @Override
    public void print(int param) {
        PrintAndCheckAble.super.print(param);
        System.out.printf("переопределённый дефолтный метод interface" +
                " к параметру прибавим 100 int = %d\n", param + 100);
    }

    @Override
    public boolean check() {
        return false;
    }

    @Override
    public void otherPrint() {

    }
}
