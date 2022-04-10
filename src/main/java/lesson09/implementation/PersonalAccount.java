package lesson09.implementation;

import lesson09.Account;

public class PersonalAccount extends Account {

    public PersonalAccount(String name) {
        super(name);
    }

/* модификатор <final> в родительсом классе запрещает переопределение метода
    public double getBalance() {
        return -123;
    }
*/

    public static String getBic() {
        // double balance = this.getBalance();  ошибочно
        return "123456789";
    }
}
