package lesson08;

public class People {

    public static void main(String[] args) {

        char testo = '�';
        System.out.printf("����� ������� ������ \"%s\".\n", testo);

        Male vitIvan = new Male("������ ������� ���������", 33,
                "�������");
        Human natasha = new Female("������� ������� ��������", 25,
                "��������� ?");
        vitIvan.beOlder();
        printHuman(vitIvan, natasha);
        natasha.changeNationality("����� �������");
        natasha.changeName("�������� ������ ��������");
        vitIvan.changeName("����������� ����� ���������");
        natasha.setAge(17);
        Human[] people = new Human[] {vitIvan, natasha};
        for (Human index: people) {
            index.setAge(41);
        }

        printHuman(vitIvan, natasha);
        // vitIvan.getAge(); ��������� ����� ��� ����������
        vitIvan.drive();
        ((Female) natasha).cook(); // ���������� Human � ������ Female

         Female nina = new Female("�������� ���� ��������", 36, "���������");
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
