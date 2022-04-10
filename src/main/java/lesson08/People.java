package lesson08;

public class People {

    public static void main(String[] args) {

        char testo = '®';
        System.out.printf("бреем русскую букову \"%s\".\n", testo);

        Male vitIvan = new Male("»ванов ¬италий јндреевич", 33,
                "русский");
        Human natasha = new Female("ѕетрова Ќаталь€ »вановна", 25,
                "нерусскј€ ?");
        vitIvan.beOlder();
        printHuman(vitIvan, natasha);
        natasha.changeNationality("новый русский");
        natasha.changeName("—идарќва Ќаташа »ванќвна");
        vitIvan.changeName("ивјнофффффф ¬итас јндре≈вич");
        natasha.setAge(17);
        Human[] people = new Human[] {vitIvan, natasha};
        for (Human index: people) {
            index.setAge(41);
        }

        printHuman(vitIvan, natasha);
        // vitIvan.getAge(); приватный метод вне недоступен
        vitIvan.drive();
        ((Female) natasha).cook(); // приведение Human к классу Female

         Female nina = new Female("—идорќва Ќина ѕетровна", 36, "нашенска€");
        ((Female) natasha).changeName(nina);
        System.out.println(natasha);
        System.out.println(nina);
    }

    private static void printHuman(Male vitIvan, Human natasha) {
        System.out.printf("%s\n", vitIvan);
        System.out.println(natasha);
        System.out.println("-------------------");
    }
}
