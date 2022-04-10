package lesson09.implementation;

// модификатор <abstract> запрещает создавать объект этого класса,
// но потомки этого класса могут создать объект. Либо для <abstract> класса
// создаётся объект анонимного класса
public abstract class BestPersonalAccount extends PersonalAccount {

    public BestPersonalAccount(String name) {
        super(name);
    }

    protected abstract void printBalance();
}
