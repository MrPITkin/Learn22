package lesson04;

public class StringRunner {
    public static void main(String[] args) {
        String text = "Война и мир. Начало и конец";
        text += ". Новая фраза\n\t";
        String str = "Халлоу, Вэлд\t \\\n point\r";
        System.out.println(str);

        // short digit = 120 + 54565;
        short value =120;
        value += 54565; // переполнение
        System.out.println("Значение переменной value = " + value);
    }
}
