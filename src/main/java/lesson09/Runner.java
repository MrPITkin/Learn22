package lesson09;

public class Runner {

    private static Runner ME = new Runner();

    public static void main(String[] args) {
        new Runner().print();
// обращение из STATIC к методу БЕЗ STATIC можификатора созданием объекта

        ME.print();
    }

    private void print() {
        System.out.println("Опыт № 1 " + ME);
    }
}
