package lesson10.inter;

public interface PrintAndCheckAble extends Printable, Checkable {

    void otherPrint();

    @Override
    default void print(int param) {
        Printable.super.print(param);
        System.out.println("Так в интерфейсе PrintAndCheckAble объединили пару");
        Checkable.super.print(param);
    }
}
