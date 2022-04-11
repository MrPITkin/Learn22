package hw09;

public abstract class Automobile {

//    protected abstract PassengerCar carArray();

    public float getWay() {
        return this.way;
    }

    public String getName() {
        return name;
    }

    public boolean isPassenger() {
        return type;
    }

    public void setName(String name) {
        this.name = name;
    }

    protected abstract float move(float length);

    protected String name;
    protected float way;
    protected boolean type;

    public Automobile(String zvuk, float way, boolean ves) {
        this.way = way;
        this.name = zvuk;
        this.type = ves;
    }
}
