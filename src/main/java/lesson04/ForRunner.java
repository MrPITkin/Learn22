package lesson04;

public class ForRunner {

    public static void main(String[] args) {
        int publicCounter;
        for (int counter = publicCounter = 1, value = -23; counter <= 12 && value < -21; counter+=3, value++) {
            System.out.println("Текучее значение счётчика: " + counter);
            System.out.println("Текучее значение value: " + value);
        }

        for (;;) {
            System.out.println(publicCounter*=8);
            System.out.println(--publicCounter);
            break;
        }
    }
}
