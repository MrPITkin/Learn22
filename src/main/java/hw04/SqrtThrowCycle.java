package hw04;

public class SqrtThrowCycle {

    public static void main(String[] args) {
        int source = 4096;
        if (source < 0) {
            System.out.println("Квадратый корень отрицательного числа " + source + " не существует.");
            System.out.println("Квадратый корень отрицательного числа " + source + " не существует.");
        } else {
            int result1 = sqrt(source);
            int result2 = sqrtThrowFor(source);
            System.out.println("Квадратый корень числа " + source + " равен " + result1);
            System.out.println("Целая часть квадратного корня числа " + source + " равна " + result2);
            System.out.println("Проверка\nЧисло " + result1 + "^2 равно " + checkingRoot(result2));
        }
    }

    private static int sqrt(int arg1) {
        int odd = 1, rezult = 0;
//  узнать целую часть квадратного корня числа можно, вычитая из него все нечётные числа по порядку,
//  пока остаток не станет меньше следующего вычитаемого числа или равен нулю, и посчитав количество
//  выполненных действий
        while (arg1 >= odd){
            arg1 = arg1 - odd;
            odd+=2;
            rezult++;
        }
        return rezult;
    }

    private static int sqrtThrowFor(int arg1) {
        int odd = 1, rezult = 0;
//  узнать целую часть квадратного корня числа можно, вычитая из него все нечётные числа по порядку,
//  пока остаток не станет меньше следующего вычитаемого числа или равен нулю, и посчитав количество
//  выполненных действий
        for ( int counter = arg1; arg1 >= odd; arg1 = arg1 - odd, odd+=2, rezult++);
        return rezult;
    }

    private static int checkingRoot(int arg1) {
        return arg1 * arg1;
    }
}
