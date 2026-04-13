package Code;

public abstract class Vehicle {
    protected int speed;
    protected int fuelLevel;
    protected String brand;

    public Vehicle(int speed, int fuelLevel, String brand){
        this.speed = speed;
        this.fuelLevel = fuelLevel;
        this.brand = brand;
    }

    public abstract void accelerate();
    public abstract void stop();
    public abstract void gas();
}




