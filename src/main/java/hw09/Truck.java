package hw09;

import java.util.Random;

public final class Truck extends Automobile {

    public Truck(String vin, float km) {
        super(vin, km, false);
    }

    @Override
    protected float move(float probeg) {
        this.setName("HARD");
        return this.getWay();
    }

    @Override
    public String toString() {
        return "Грузы{" +
                "name='" + name + '\'' +
                ", запас хода=" + way +
                '}';
    }
}
