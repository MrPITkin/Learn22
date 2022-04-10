package lesson09.implementation;

import lesson09.Account;
//import lesson09.Course;
// импорт конкретной STATIC переменной
import static lesson09.Course.CURRENT_VALUE;

public class SettlementAccount extends Account {

    public static int COUNT = 0;
// дл€ модификатора STATIC у полей или методов класса можно обращатьс€
// к ним напр€мую, без создани€ объектов этого класса

    public SettlementAccount(String name) {
        super(name);
        ++COUNT;
    }

    //private static final double KURS = 81.23; // $1 = 81.23 руб.

    public double covertValuta() {
        if (isBlocked()) {
//доступ к PROTECTED методу родительского класса в том же пакете
            return 0;
        }
        //return this.getBalance() / Course.CURRENT_VALUE;
        // использование STATIC переменной, я¬Ќќ указанной в IMPORT
        return this.getBalance() / CURRENT_VALUE;
    }
}
