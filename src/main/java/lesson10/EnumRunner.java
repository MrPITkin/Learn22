package lesson10;

import lesson10.enumeration.Language;
import lesson10.inter.Printable;

public class EnumRunner {
    public static void main(String[] args) {
        Printable objectPR = new Printer();
        objectPR.printEnum(Language.FRENCH);
        objectPR.printEnum(Language.GERMAN);
        objectPR.printEnum(Language.RUSSIAN);
        objectPR.printEnum(Language.obratka(2));

        System.out.println(Language.obratka(3).toStr());
        System.out.println(Language.FRENCH.toStr());
        System.out.println(Language.ENGLISH.toString());
    }
}
