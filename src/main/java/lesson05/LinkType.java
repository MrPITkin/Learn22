package lesson05;

public class LinkType {

    public static void main(String[] args) {
        int i = 5;
        String str = "Hi !";
        String stroke = new String("Hello");
        Integer value = 5;
        int anatherValue = value;
        Integer nullValue = null;
//        System.out.println(nullValue + 10); абшибка
        Long bigValue = 23536565651L;
        Double dValue =2.5;
        Character symbol = 's';
        //Character symbol = 'й'; не бреет руских
        char anotherSymbol = symbol;
        Integer varInteger = Integer.valueOf("6548943");
        System.out.println("Корректное преобразование строкового значения к целому типу числа " + varInteger);
        System.out.println("-----------------------------------------");
        System.out.println(varInteger == 6548943);
        System.out.println(varInteger == Integer.valueOf(6548943));
        System.out.println(varInteger.equals(Integer.valueOf(6548943)));
        System.out.println("-----------------------------------------");
        System.out.println(Integer.valueOf(128) == Integer.valueOf(128));
        System.out.println(Integer.valueOf(127) == Integer.valueOf(127)); // кэш для целых -128..127
    }
}
