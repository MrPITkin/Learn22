package lesson12.collection;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;

public class ListRunner {

    public static void main(String[] args) {
        int[] ints = {1, 2, 3, 4, 5};
        List<Integer> integers = List.of(1, 2, 3, 4, 5, 6);
        List raw = List.of(1, "Test", false, new String());
        for (Integer value : integers) {
//            int index = (int) value;
            System.out.print(value + " ");
        }
        System.out.println();
        System.out.println("-*-*-*-*-*-*-");
        for (Iterator<Integer> iterator = integers.iterator(); iterator.hasNext(); ) {
            Integer value = iterator.next();
            System.out.print(value + " ");
        }
        System.out.println();
        System.out.println("-*-*-*-*-*-*-");
        List<String> names = new ArrayList<>();
        names.add("Виталий");
        names.add("Анатолий");
        names.add("Сергей");
        names.add("Наталья");
        names.add("Ольга");
        names.add("Эдуард");
        System.out.println(names);
        String name = "Виталий";
        System.out.println("В списке имен " + name + " " + (names.contains(name) ? "найден" : "не найден"));
        name = "Пётр";
        System.out.println("В списке имен " + name + " " + (names.contains(name) ? "найден" : "не найден"));
        names.remove("Сергей");
        names.remove("Сергей-эй");
        System.out.println(names);
        names.sort(Comparator.naturalOrder());
        System.out.println(names);
        System.out.println("Теперь на 1м месте стоит " + names.get(0));
        System.out.println("Теперь на 1м месте стоит " + names.get(names.size() - 1));
        names.addAll(List.of("Виталий", "Николай", "Марина"));
        System.out.println(names);
        System.out.println("В списке имен " + name + " " + (names.contains(name) ? "найден" : "не найден"));
        System.out.println(names.indexOf("Виталий"));
        System.out.println(names.lastIndexOf("Виталий"));

    }
}
