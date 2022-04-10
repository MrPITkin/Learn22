package hw08.animal;

public class CatObj extends Animal {

    public static final String Kind_zveR = "кОша";

    public CatObj(String nikName, int age, String color, float weight, float height) {
        super(nikName, Kind_zveR, age, color, weight, height);
    }

    @Override
    public void voice() {
        super.voice();
        System.out.printf("Мартовский КАТЭ %s _мявчит_.\n", this.name);
    }
}
