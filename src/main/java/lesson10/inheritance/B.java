package lesson10.inheritance;

public class B extends A{
    public void method1(){}

    public B(String str) {
        System.out.println("Вызван контруктор класса B " + str);
    }
}
