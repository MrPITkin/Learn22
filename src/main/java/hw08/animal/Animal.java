package hw08.animal;

public abstract class Animal {

    private final String nikName;
    protected final String name;
    private int age;
    private String color;
    float weight; // ���
    float height; // ����

    public Animal(String nikName, String nameArg, int age, String color, float weight, float height) {
        this.nikName = nikName;
        this.name = nameArg;
        this.age = age;
        this.color = color;
        this.weight = weight;
        this.height = height;
    }

    public void voice() {
        System.out.printf("�������� ����� �������� ����:\n");
    }

    @Override
    public String toString() {
        return "������� { " + name +
                " �� ������ '" + nikName + '\'' +
                ", ������� = " + age +
                ", ���� '" + color + '\'' +
                ", ��� = " + weight +
                ", ���� = " + height +
                '}';
    }
}
