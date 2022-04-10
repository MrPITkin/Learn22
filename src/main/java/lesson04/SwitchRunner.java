package lesson04;

public class SwitchRunner {
    public static void main(String[] args) {
        System.out.println(getSolutionOfSphetofore("жёлтый"));
        System.out.println(getSolutionOfSphetofore("зелёный"));
        System.out.println(getSolutionOfSphetofore("буров"));
        System.out.println(getSolutionOfSphetofore("красный"));
        getSolutionOfSphetofore("зелёный");
        getSolutionOfSphetofore("красный");
    }

    public static String getSolutionOfSphetofore(String color) {
        String rezult;
        switch (color){
//          case "красный":
//          case "жёлтый": {  - использование нескольких вариантов для одного выбора
            case "красный": {
                rezult = "Проход запрещён";
                break;
            }
            case "жёлтый": {
                rezult = "Будь внимателен";
                break;
            }
            case "зелёный": {
                rezult = "Проход разрешён";
                break;
            }
            default: {
                rezult = "нипаняяяяяяяяяяятна";
                break;
            }
        }
        return rezult;
    }
}
