package Code;
public class Motorcycle extends Vehicle{
    public Motorcycle(int speed, int fuelLevel, String brand){
        super(speed, fuelLevel, brand);
    }

    @Override
    public void accelerate(){
        System.out.println("Motorcycle: " + brand + " accelerates by twisting the throttle.");
    }
    @Override
    public void stop(){
        System.out.println("Motorcycle: " + brand + " stops by usiing hand and foot brakes");
    }
    @Override
    public void gas(){
        System.out.println("Motorcycle: " + brand + " has its fuel level as: " + fuelLevel +"%");
    }
}
