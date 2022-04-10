package lesson09;

public class Account {

    private double balance = 1_000_000; // гнусный лям
    private double maxLimit = Double.MAX_VALUE; // потолок
    private double minLimit = 0; // нижний предел
    // private String owner = "ты хто такой ?";
    private final String owner;
// поле класса (переменная) с модификатором <final> может быть проинициализировано ОДИН раз
    private boolean blocked;

    public Account(String name) {
        this.owner = name;
        this.balance = 0;
        this.blocked = true;
    }

    public  Account() {
        //this.owner = "хто же ты ?";
        this( "`хто же ты ?`");
// в конструкторе без параметра для поля класса с модификатором <final>
// должно быть определено значение
    }

    public boolean replenish(double amount) {
// пополнение счёта
        if (blocked || balance + amount > maxLimit) {
            System.out.printf("Счёт клиента %s пополнить на %f не удалось.\n"
                    , this.owner, amount);
            return false;
        }
        balance += amount;
        System.out.printf("Счёт клиента %s пополнился на %f\n",
                this.owner, amount);
        return true;
    }

    public boolean withdraw(double amount) {
// снятие со счёта
        if (this.balance - amount >= this.minLimit && !this.blocked) {
            balance -= amount;
            System.out.printf("Счёт клиента %s уменьшился на %f\n",
                    this.owner, amount);
            return true;
        }
        System.out.printf("Операция уменьшения счёта %s на %f не удалась.\n"
                , this.owner, amount);
        return false;
    }

    protected boolean isBlocked() {
// protected аналогичен private + доступ потомкам этого класса в том же пакете
        return this.blocked;
    }

    void activeClient(boolean status) {
        this.blocked = !status;
    }

    public final double getBalance() {
        return balance;
    }
// модификатор <final> запрещает переопределение метода в порождаемых классах

    public String getOwner() {
        return owner;
    }

    public void setMaxLimit(double maxLimit) {
        this.maxLimit = maxLimit;
    }
}
