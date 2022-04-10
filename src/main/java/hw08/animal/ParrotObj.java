package hw08.animal;

public class ParrotObj extends Animal {

    private static final String Kind_zveR = "попугай";

    public ParrotObj(String nikName, int age, String color, float weight, float height) {
        super(nikName, Kind_zveR, age, color, weight, height);
    }

    @Override
    public void voice() {
        super.voice();
        System.out.printf("Домашний ЯГУПОП %s _молвит человечьим голосом_.\n", this.name);
    }
}
