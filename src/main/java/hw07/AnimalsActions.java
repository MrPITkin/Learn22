package hw07;

public class AnimalsActions {
    public static void main(String[] args) {
        char testo = '�';
        System.out.printf("����� ������� ������ \"%s\".\n", testo);

        DogObject saba = new DogObject();
        saba.nikName = "��������";
        saba.animal = "��";
        saba.age = 3;
        saba.abilitySwim = 33.5f;
        saba.abilityRun = 752;
        saba.abilityJump = 0.37F;
        saba.sex = true; // ������

        DogObject dog = new DogObject("����", 24.7f,
                "����������", 5, 512, 27.3f);

        zveriMale(saba, dog);

        CatObject kate = new CatObject();
        kate.nikName = "���������";
        kate.animal = "������";
        kate.age = 2;
        kate.abilityClimb = 6.58f;
        kate.abilityRun = 74;
        kate.abilityJump = 0.43F;
        kate.sex = true; // ���

        CatObject kosha = new CatObject("�����", 0.57f,
                "����", 4, 51, 7.3f);

        TigerObject bigCat = new TigerObject();
        bigCat.nikName = "���������";
        bigCat.animal = "�����";
        bigCat.age = 17;
        bigCat.weight = 246f;
        bigCat.abilityRun = 74;
        bigCat.abilityJump = 1.43F;
        bigCat.sex = true; // ���

        TigerObject tigra = new TigerObject("�������", 0.57f,
                "�������", 11, 1518, 177.0f);

        int run = 567; // ����� ����
        float jump = 1.26f; // ����� ������
        float swim = 14.87f; // ����� �����
        float climb = 7.14f; // ����� ����������

        //���� �����
        dogRun(saba, run);
        dogRun(dog, run);

        //���� �����������
        catClimb(kate, climb);
        catClimb(kosha, climb);

        // ����� ������
        taigaJump(tigra, jump);
        taigaJump(bigCat, jump);
    }

    private static void dogRun(DogObject saba, int run) {
        if (saba.abilityRun > run) {
            System.out.printf("����� %s �� ������ %s �������� %d. ����� %d \n",
                    saba.getAnimal(), saba.getNikName(), run, saba.getAbilityRun());
        }else {
            System.out.printf("����� %s �� ������ %s �� ������ ��������� %d. ������ %d\n",
                    saba.getAnimal(), saba.getNikName(), run, saba.getAbilityRun());
        }
    }

    private static void catClimb(CatObject zver, float run) {
        if (zver.abilityClimb > run) {
            System.out.printf("����� %s �� ������ %s ����� �� ������ %f. ����� %f \n",
                    zver.getAnimal(), zver.getNikName(), run, zver.getAbilityClimb());
        }else {
            System.out.printf("����� %s �� ������ %s �� ���� ������� �� ������ %f. ������ %f\n",
                    zver.getAnimal(), zver.getNikName(), run, zver.getAbilityClimb());
        }
    }

    private static void taigaJump(TigerObject zver, float run) {
        if (zver.abilityJump > run) {
            System.out.printf("����� %s �� ������ %s ������� �� %f. ����� %f \n",
                    zver.getAnimal(), zver.getNikName(), run, zver.getAbilityJump());
        }else {
            System.out.printf("����� %s �� ������ %s �� ������ ������ �� %f. ������ %f\n",
                    zver.getAnimal(), zver.getNikName(), run, zver.getAbilityJump());
        }
    }

    private static void zveriMale(DogObject saba, DogObject dog) {
        DogObject[] animals = new DogObject[] {saba, dog};
        for (DogObject head: animals) {
            if (head.sex){
                System.out.printf("���� ����� �� ������ \"%s\" ������.\n", head.nikName);
            }else {
                System.out.printf("���� ����� �� ������ \"%s\" �����.\n", head.nikName);
            }
        }
    }

}
