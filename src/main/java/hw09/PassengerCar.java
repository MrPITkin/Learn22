package hw09;

public final class PassengerCar extends Automobile {

    public PassengerCar() {
        super();
    }

    @Override
    protected void move(float probeg) {
        this.way = probeg;
    }

}
