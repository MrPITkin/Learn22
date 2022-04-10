package lesson08;

import java.util.Objects;

public class CatRunner {

    public static void main(String[] args) {

        char testo = '�';
        System.out.printf("����� ������� ������ \"%s\".\n", testo);

        Cat barsik = new Cat();
        barsik.name = "������";
        barsik.age = 1;
        barsik.breed = "����������";
        barsik.boss = new Boss("Vitaliy") ;

        Cat persik = new Cat();
        persik.name = "������";
        persik.age = 1;
        persik.breed = "����������";
        persik.boss = new Boss("Vitaliy");

        Cat bobik = new Cat();
        Cat malysh = new Cat();
        System.out.println(barsik == persik);
        System.out.println(barsik == bobik);
        System.out.println(barsik == malysh);
        System.out.println("-----------------");
        System.out.println(barsik.equals(persik));
        System.out.println(Objects.equals(barsik, persik));
    }
}
