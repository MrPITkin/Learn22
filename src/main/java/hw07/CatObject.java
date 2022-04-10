package hw07;

public class CatObject {
    String animal; // класс животины
    String nikName; // кликуха
    int age; // полных лет
    float weight; // вес
    float height; // рост
    boolean sex; // пол
    int abilityRun; // могу бегать
    float abilityJump; // могу прыгать
    float abilitySwim; // могу плавать
    float abilityClimb; // могу лазить

    public CatObject(String animal, float jump, String nikName, int age, int run, float climb) {
        this.animal = animal;
        this.nikName = nikName;
        this.age = age;
        this.abilityJump = jump;
        this.abilityRun = run;
        this.abilityClimb = climb;
    }

    public CatObject(){}

    public String getAnimal() {
        return animal;
    }

    public void setAnimal(String animal) {
        this.animal = animal;
    }

    public String getNikName() {
        return nikName;
    }

    public void setNikName(String nikName) {
        this.nikName = nikName;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public float getWeight() {
        return weight;
    }

    public void setWeight(float weight) {
        this.weight = weight;
    }

    public float getHeight() {
        return height;
    }

    public void setHeight(float height) {
        this.height = height;
    }

    public boolean isSex() {
        return sex;
    }

    public void setSex(boolean sex) {
        this.sex = sex;
    }

    public int getAbilityRun() {
        return abilityRun;
    }

    public void setAbilityRun(int abilityRun) {
        this.abilityRun = abilityRun;
    }

    public float getAbilityJump() {
        return abilityJump;
    }

    public void setAbilityJump(float abilityJump) {
        this.abilityJump = abilityJump;
    }

    public float getAbilitySwim() {
        return abilitySwim;
    }

    public void setAbilitySwim(float abilitySwim) {
        this.abilitySwim = abilitySwim;
    }

    public float getAbilityClimb() {
        return abilityClimb;
    }

    public void setAbilityClimb(float abilityClimb) {
        this.abilityClimb = abilityClimb;
    }
}