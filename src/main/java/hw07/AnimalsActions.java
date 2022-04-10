package hw07;

public class AnimalsActions {
    public static void main(String[] args) {
        char testo = 'Й';
        System.out.printf("бреем русскую букову \"%s\".\n", testo);

        DogObject saba = new DogObject();
        saba.nikName = "Шарикофф";
        saba.animal = "пёс";
        saba.age = 3;
        saba.abilitySwim = 33.5f;
        saba.abilityRun = 752;
        saba.abilityJump = 0.37F;
        saba.sex = true; // кобель

        DogObject dog = new DogObject("саба", 24.7f,
                "Свистулька", 5, 512, 27.3f);

        zveriMale(saba, dog);

        CatObject kate = new CatObject();
        kate.nikName = "Пушинский";
        kate.animal = "катяра";
        kate.age = 2;
        kate.abilityClimb = 6.58f;
        kate.abilityRun = 74;
        kate.abilityJump = 0.43F;
        kate.sex = true; // кот

        CatObject kosha = new CatObject("кошка", 0.57f,
                "Сима", 4, 51, 7.3f);

        TigerObject bigCat = new TigerObject();
        bigCat.nikName = "Полосатый";
        bigCat.animal = "тигер";
        bigCat.age = 17;
        bigCat.weight = 246f;
        bigCat.abilityRun = 74;
        bigCat.abilityJump = 1.43F;
        bigCat.sex = true; // кот

        TigerObject tigra = new TigerObject("тигрина", 0.57f,
                "Когтяра", 11, 1518, 177.0f);

        int run = 567; // сколь бегу
        float jump = 1.26f; // сколь прыгну
        float swim = 14.87f; // сколь плыву
        float climb = 7.14f; // сколь карабкаюсь

        //саба бежит
        dogRun(saba, run);
        dogRun(dog, run);

        //катэ карабкается
        catClimb(kate, climb);
        catClimb(kosha, climb);

        // тигра скачет
        taigaJump(tigra, jump);
        taigaJump(bigCat, jump);
    }

    private static void dogRun(DogObject saba, int run) {
        if (saba.abilityRun > run) {
            System.out.printf("Зверь %s по кличке %s пробежал %d. Может %d \n",
                    saba.getAnimal(), saba.getNikName(), run, saba.getAbilityRun());
        }else {
            System.out.printf("Зверь %s по кличке %s не шмагла пробежать %d. Предел %d\n",
                    saba.getAnimal(), saba.getNikName(), run, saba.getAbilityRun());
        }
    }

    private static void catClimb(CatObject zver, float run) {
        if (zver.abilityClimb > run) {
            System.out.printf("Зверь %s по кличке %s залез на высоту %f. Может %f \n",
                    zver.getAnimal(), zver.getNikName(), run, zver.getAbilityClimb());
        }else {
            System.out.printf("Зверь %s по кличке %s не смог залезть на высоту %f. Предел %f\n",
                    zver.getAnimal(), zver.getNikName(), run, zver.getAbilityClimb());
        }
    }

    private static void taigaJump(TigerObject zver, float run) {
        if (zver.abilityJump > run) {
            System.out.printf("Зверь %s по кличке %s прыгнул на %f. Может %f \n",
                    zver.getAnimal(), zver.getNikName(), run, zver.getAbilityJump());
        }else {
            System.out.printf("Зверь %s по кличке %s не осилил прыжок на %f. Предел %f\n",
                    zver.getAnimal(), zver.getNikName(), run, zver.getAbilityJump());
        }
    }

    private static void zveriMale(DogObject saba, DogObject dog) {
        DogObject[] animals = new DogObject[] {saba, dog};
        for (DogObject head: animals) {
            if (head.sex){
                System.out.printf("Наша псина по кличке \"%s\" кобель.\n", head.nikName);
            }else {
                System.out.printf("Наша псина по кличке \"%s\" ссука.\n", head.nikName);
            }
        }
    }

}
