package hw08.animal;

public class DogObj extends Animal {

    public static final String Kind_zveR = "сАба";

    public DogObj(String nikName, int age, String color, float weight, float height) {
        super(nikName, Kind_zveR, age, color, weight, height);
    }

    @Override
    public void voice() {
        super.voice();
        System.out.printf("САБА %s _тяфкаит_.\n", this.name);
    }
}
