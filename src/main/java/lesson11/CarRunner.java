package lesson11;

public class CarRunner {
    public static void main(String[] args) {
        Car varObj = new Car();
        varObj.setDistance(345.6_7__8);
        varObj.setMark("УВАЗ");
        varObj.setModel("Ведро");
        varObj.setDvizhok(varObj.new Engine(1.7)); // внутренний класс Engine НЕ static
        //varObj.setDvizhok(new Car.Engine(1.7)); // вложенный класс Engine static

        varObj.new Engine(1.8); // класс Engine привязан к содержащему его классу Car
        //new Car.Engine(1.8); // независимый вложенный класс Engine
    }
}
