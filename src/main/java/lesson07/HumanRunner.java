package lesson07;

public class HumanRunner {

    public static void main(String[] args) {
        Human vitaly = new Human();
        vitaly.name = "Виталий";
        vitaly.surname = "Иванов";
        vitaly.age = 33;
        vitaly.weight = 82;
        vitaly.height = 190;
        vitaly.hasQrCode = false;

        Human nataliaIvanovna = new Human();
        nataliaIvanovna.name = "Natalia";
        nataliaIvanovna.surname = "Petrova";
        nataliaIvanovna.age = 27;
        nataliaIvanovna.weight = 55;
        nataliaIvanovna.height = 165;
        nataliaIvanovna.hasQrCode = true;

        Human incognito = new Human("Неизвестно", "unknown");

        Human vasyaPupkin = new Human("Vasiliy", "Попкин", 50,
                -1, -1, null);

        System.out.println(vitaly == vasyaPupkin);
        System.out.println(vitaly == vitaly);

        Human[] arrayHumans = new Human[] {vitaly, nataliaIvanovna, incognito, vasyaPupkin};
        for (Human gumanoid: arrayHumans) {
            // если бы элемент массива имел значение null, то избежать ошибки
            if (Integer.valueOf(50).equals(gumanoid.age)) {
                System.out.printf("Чебурек по имени %s и фамилии %s достиг 50 лет.\n",
                        gumanoid.name, gumanoid.surname);
            }
        }

        vitaly.beOlder();
        System.out.printf("ИвАнаффффу через год стукнет %d.\n", vitaly.age);
        vitaly.vaccinated();
        System.out.printf("Виталька ширнУлся ? %s.\n", vitaly.hasQrCode ? "Каэшна !" : "Ну да как ино !");
        System.out.printf("А что в поле вакцины ? %b.\n", vitaly.getHasQrCode());

        vitaly.setName("вита-Vitaliy");
        System.out.printf("Виталиус сменил имя на \"%s\".\n", vitaly.getName());

        char testo = 'Ё';
        System.out.printf("бреем русскую букову \"%s\".\n", testo);
    }
}
