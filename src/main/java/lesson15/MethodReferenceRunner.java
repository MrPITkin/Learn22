package lesson15;

import lesson15.dto.Account;

import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Supplier;

public class MethodReferenceRunner {
    public static void main(String[] args) {
//        Function<String, Integer> str2Int = str -> Integer.decode(str);
        Function<String, Integer> str2Int = Integer::decode;
        System.out.printf("Преобразована строка в число: %1$d\n", str2Int.apply("-45"));

//        Function<Long, Long> self2self = val -> val;
        Function<Long, Long> self2self = Function.identity();
        System.out.printf("число как есть: %1$d\n", self2self.apply(-8_941L));

//        Supplier<Account> accountGenerator = () -> new Account();
        Supplier<Account> accountGenerator = Account::new;
        System.out.println(accountGenerator.get());

        Consumer<String> printStr = System.out::println;
        printStr.accept("потребитель печатает");

        System.out.printf("Строка в число: %1$d\n", str2Int.apply("+1"));
        Function<Character, Integer> char2Int = ch -> (int) ch;
        System.out.printf("Код символа: %1$d\n", char2Int.apply(' '));
    }
}
