package hw09;

public abstract class Automobile {

    public float getWay() {
        return this.way;
    }

    protected abstract void move(float length);

    protected float way;

    public Automobile() {
    }
}
