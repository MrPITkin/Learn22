package hw03;

public class KvadratnoeUravnenie {

    public static void main(String[] args) {
        // a * x^2 + b * x + c = 0
        int a = 1;
        int b = -4;
        int c = 4;
        // D = b^2 - 4ac
        calculateEquatic(a, b, c);
        calculateEquatic(1, 6, 9);
        calculateEquatic(1, 8, 7);
        calculateEquatic(1, 8, 72);
    }

    private static void calculateEquatic(int a, int b, int c) {
        int discriminant = (int) (Math.pow(b,2) - 4 * a * c);
        if (discriminant < 0){
            System.out.println("Корней уравнения с коэффициентами a = " + a + " b = " + b
                    + " c = " + c + " нет, т.к. дискриминант < 0 и = " + discriminant);
            // return; оператор избыточен
        } else if (discriminant == 0) {
            int x = -b / (2 * a);
            System.out.println("Найден единственный корень уравнения с коэффициентами a = " + a + " b = " + b
                    + " c = " + c + " при дискриминанте = 0 x = " + x);
        } else{ //дискриминант discriminant > 0
            int x1 = (int) (-b + Math.sqrt(discriminant)) / (2 * a);
            int x2 = (int) (-b - Math.sqrt(discriminant)) / (2 * a);
            System.out.println("Найдены 2 корня уравнения с коэффициентами a = " + a + " b = " + b
                    + " c = " + c + " при дискриминанте > 0 D = " + discriminant);
            System.out.println("x1 = " + x1 + " и х2 = " + x2);
        }
    }
}
