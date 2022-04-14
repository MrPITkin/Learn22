package lesson10.inheritance;

public class A {
    protected void print() {
    }

    public A() {
        System.out.println("Вызван контруктор класса A " + str);
        this.str = "снова меняется значение переинициализацией";
        System.out.println(this.str);
    }

    private static String GLOBAL_STR = "статичная переменная";
    private String str = "?";
    {
        str = "нестатичный блок";
    }
    static {
        GLOBAL_STR = "статичный блок";
    }
}
