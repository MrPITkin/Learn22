package lesson04;

public class WhileRunner {

    public static void main(String[] args) {
        int counter = 1;
        while (counter <= 12) {
            System.out.println(counter++);
            // System.out.println(++counter); сперва +1, затем вывод
            // System.out.println(counter++); сперва вывод, затем +1
        }
        System.out.println("---------------------------");
        do {
            System.out.println(counter++);
        } while (counter <=23);
    }
}
