package lesson04;

public class TernarnOperatotRunner {

    public static void main(String[] args) {
        System.out.println(abs( 25));
        System.out.println(abs( -12));
    }

    public static int abs (int value) {
        return value >= 0 ? value : -value;
    }
}
