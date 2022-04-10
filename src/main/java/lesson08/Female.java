package lesson08;

public class Female extends Human{

//    public Female(String fio, int age, String nationality, boolean sex){
    public Female(String fio, int age, String nationality){
        super(fio, age, nationality);
    }

    public void cook() {
        System.out.println("женщина умеет готовить");
    }

    @Override
    public void changeName(String newName) {
        super.changeName(newName);
        System.out.printf("Женщина сменила ФИО.\n");
    }

    public void changeName(Female women) {
        // странная логика этого метода
        //women.changeName(this.getFio());
        this.changeName(women.getFio());
        //this.changeName(getFio());
    }

}
