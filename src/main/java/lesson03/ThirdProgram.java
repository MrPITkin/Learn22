package lesson03;

public class ThirdProgram {
    public static void main(String[] args) {
        int operand1 = 11;
        int operand2 = 4;
        System.out.println("Остаток от деления " + operand1 + " на " + operand2 + " равен " + mod(operand1, operand2));
        operand1 = 2;
        operand2 = 16;
        System.out.println("возведение " + operand1 + " в степень " + operand2 + " равно " + pow(operand1, operand2));
        operand1 = 41;
        operand2 = 7;
        System.out.println("деление с остатком " + operand1 + " на " + operand2 + " равно " + (float) operand1 / operand2);
    }

    private static long mod(int param1, int param2) {
        return param1 % param2;
    }

    private static long pow(int arg1, int arg2) {
        return (int) Math.pow(arg1, arg2);
    }

}
