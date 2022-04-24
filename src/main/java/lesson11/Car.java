package lesson11;

public class Car {

    private Engine dvizhok;
    private double distance;
    private String mark, model;

    public void setDvizhok(Engine param) {
        this.dvizhok = param;
    }

    public void setDistance(double distance) {
        this.distance = distance;
    }

    public void setMark(String mark) {
        this.mark = mark;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public class Engine { // внутренний класс Engine привязан к содержащему его классу Car
    //public static class Engine { // независимый вложенный класс Engine
        private double volume;

        public Engine(double volume) {
            this.volume = volume;
        }
    }
}
