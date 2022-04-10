package lesson08;

public class Human {

    private String fio;
    private int age;
    private String nationality;
    //private boolean sex;

    public Human(String fioParam, int age, String nationality) {
        this(fioParam);
        this.age = age;
        this.nationality = nationality;
        //this.sex = sex;
    }

    private Human(String fioArg) {
        this.fio = fioArg;
    }

    public void changeName(String newName) {
        this.fio = newName;
    }

    public void beOlder() {
        ++this.age;
    }

    public String getFio() {
        return fio;
    }

    private Integer getAge() {
        return this.age;
    }

    private String getSex() {
        return this instanceof Male ? "мужжчщиииинка" : "вуимен";
    }

    public void changeNationality(String newNationality) {
        this.nationality = newNationality;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String toString() {
        return "Human{" +
                "fio='" + fio + '\'' +
                ", age=" + getAge() +
                ", nationality='" + nationality + '\'' +
                ", этот чел " + getSex() +
                '}';
    }
}
