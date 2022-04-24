package lesson11;

public class Car implements Cloneable {

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

    @Override
    protected Object clone() throws CloneNotSupportedException {
        Car varClone = (Car) super.clone();
        varClone.setDvizhok(this.dvizhok.clone());
        return varClone;
    }

    @Override
    public String toString() {
        return "Car{" +
                "dvizhok = " + dvizhok +
                ", пробег = " + distance +
                ", mark = '" + mark + '\'' +
                ", model = '" + model + '\'' +
                '}';
    }

    public class Engine implements Cloneable { // внутренний класс Engine привязан к содержащему его классу Car
    //public static class Engine { // независимый вложенный класс Engine
        private double volume;

        public Engine(double volume) {
            this.volume = volume;
        }

        @Override
        protected Engine clone() throws CloneNotSupportedException {
            return (Engine) super.clone();
        }

        @Override
        public String toString() {
            return "Engine{" +
                    "объём движка = " + volume +
                    '}' + this.hashCode();
        }
    }
}
