package hw09;

import java.util.Random;

public final class PassengerCar extends Automobile {

    public PassengerCar(String vin, float km) {
        super(vin, km, true);
    }

    @Override
    protected float move(float probeg) {
        this.setName("EASY");
        return this.getWay();
    }

    @Override
    public String toString() {
        return "Пассажирка{" +
                "name='" + name + '\'' +
                ", ходка=" + way +
                '}';
    }
}
