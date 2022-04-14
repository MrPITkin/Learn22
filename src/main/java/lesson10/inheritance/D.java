package lesson10.inheritance;

public class D extends B {

    public D() {
        //super(f1);
        super(str());
        System.out.println("Вызван контруктор класса D " + getClass());
    }

    private static String str() {
        return "чере super подогнали параметр";
    }
    private static String f1 = "статика-сссссссссс";

}
