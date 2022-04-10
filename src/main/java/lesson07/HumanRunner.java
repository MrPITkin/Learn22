package lesson07;

public class HumanRunner {

    public static void main(String[] args) {
        Human vitaly = new Human();
        vitaly.name = "�������";
        vitaly.surname = "������";
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

        Human incognito = new Human("����������", "unknown");

        Human vasyaPupkin = new Human("Vasiliy", "������", 50,
                -1, -1, null);

        System.out.println(vitaly == vasyaPupkin);
        System.out.println(vitaly == vitaly);

        Human[] arrayHumans = new Human[] {vitaly, nataliaIvanovna, incognito, vasyaPupkin};
        for (Human gumanoid: arrayHumans) {
            // ���� �� ������� ������� ���� �������� null, �� �������� ������
            if (Integer.valueOf(50).equals(gumanoid.age)) {
                System.out.printf("������� �� ����� %s � ������� %s ������ 50 ���.\n",
                        gumanoid.name, gumanoid.surname);
            }
        }

        vitaly.beOlder();
        System.out.printf("���������� ����� ��� ������� %d.\n", vitaly.age);
        vitaly.vaccinated();
        System.out.printf("�������� �������� ? %s.\n", vitaly.hasQrCode ? "������ !" : "�� �� ��� ��� !");
        System.out.printf("� ��� � ���� ������� ? %b.\n", vitaly.getHasQrCode());

        vitaly.setName("����-Vitaliy");
        System.out.printf("�������� ������ ��� �� \"%s\".\n", vitaly.getName());

        char testo = '�';
        System.out.printf("����� ������� ������ \"%s\".\n", testo);
    }
}
