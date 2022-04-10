package lesson08;

public class FigureRunner {

    public static void main(String[] args) {

        char testo = 'Ё';
        System.out.printf("бреем русскую букову \"%s\".\n", testo);

        Figure figure = new Figure(); //null
        Figure figure2 = new Figure(); //null
        figure2.name = "квадрат";
        System.out.printf("%b\n--------------------------\n",figure.equals(figure2));
        if (figure == null) {
            boolean equals = figure.equals(null); // false
            System.out.println(equals = figure.equals(null));
        } else {
            System.out.println("не null");
        }
    }
}
