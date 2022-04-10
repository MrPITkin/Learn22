package lesson3;

public class StandartPrimitives {
    public static void main(String[] args) {
        byte digitErrors = (byte) 155 - 5; // -2^7 .. 2^7 - 1
        System.out.println(digitErrors);

        short anotherDigit = 356; // 2 Bytes -2^15 .. 2^15 -1
        int arg1 = Integer.MIN_VALUE; // 4 Byte -2^31 .. 2^31 -1
        System.out.println(arg1);
        long bigValue = 3456879235L; // 8 Byte -2^63 .. 2^63 -1
        System.out.println(bigValue);

        char symbol = 'W'; //  2 Bytes Unicode 0 .. 2^16 -1
        //char symbol = 'Ё'; //  с русской буквой ошибка
        System.out.println(symbol + 1);

        float lessWidth = 200.25F; // 4 байт
        double digitWithPoint = 3.14; // 8 байт
        System.out.println(digitWithPoint);

        boolean logic = true; // true или false
        //boolean compare = 345 == 345_123;
        boolean compare = 345 != 345_123_768; // не равно
        boolean oborot = !compare; // ! инверсия логического значения
        System.out.println(compare);
        System.out.println(oborot);

        boolean comlexAnd = (99 == 99) && (77 == 77); // true
        boolean comlexOr = (99 == 99) || (77 == 77); // операция "или"

        int a = 60;    /* 60 = 0011 1100 */
        int b = 13;    /* 13 = 0000 1101 */
        int c = 0;
        c = a ^ b;     /* 49 = 0011 0001 */
        // Бинарный оператор XOR копирует бит, если он установлен в одном операнде, но не в обоих.
        System.out.println("a ^ b = " + c);

        if (!compare) {
            System.out.println("Переменная compare истинна");
        } else
            System.out.println("Переменная compare ложна");

        double floatPointValue = 1.7;
        if (3.2 == floatPointValue)
            System.out.println("3.2 равно " + floatPointValue);
        else if (1 == 1) {
            System.out.println("3.2 не равно " + floatPointValue + " но 1 = 1");
        } else {
            System.out.println("3.2 не равно " + floatPointValue);
        }

        boolean bool1 = floatPointValue !=0 && (100 / floatPointValue == 10);
        // Проверка, что переменная отлична от нуля. Если переменная = 0, то справа от && не выполняется

    }
}
