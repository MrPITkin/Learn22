package lesson08;

import java.util.Objects;

public class CatRunner {

    public static void main(String[] args) {

        char testo = 'Ё';
        System.out.printf("бреем русскую букову \"%s\".\n", testo);

        Cat barsik = new Cat();
        barsik.name = "Барсик";
        barsik.age = 1;
        barsik.breed = "персидский";
        barsik.boss = new Boss("Vitaliy") ;

        Cat persik = new Cat();
        persik.name = "Барсик";
        persik.age = 1;
        persik.breed = "персидский";
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
