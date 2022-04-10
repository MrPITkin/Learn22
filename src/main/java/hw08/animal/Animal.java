package hw08.animal;

public abstract class Animal {

    private final String nikName;
    protected final String name;
    private int age;
    private String color;
    float weight; // вес
    float height; // рост

    public Animal(String nikName, String nameArg, int age, String color, float weight, float height) {
        this.nikName = nikName;
        this.name = nameArg;
        this.age = age;
        this.color = color;
        this.weight = weight;
        this.height = height;
    }

    public void voice() {
        System.out.printf("Животное может издавать звук:\n");
    }

    @Override
    public String toString() {
        return "Зверюга { " + name +
                " по кличке '" + nikName + '\'' +
                ", возраст = " + age +
                ", цвет '" + color + '\'' +
                ", вес = " + weight +
                ", рост = " + height +
                '}';
    }
}
