package hw08.animal;

public class DogObj extends Animal {

    public static final String Kind_zveR = "����";

    public DogObj(String nikName, int age, String color, float weight, float height) {
        super(nikName, Kind_zveR, age, color, weight, height);
    }

    @Override
    public void voice() {
        super.voice();
        System.out.printf("���� %s _�������_.\n", this.name);
    }
}
