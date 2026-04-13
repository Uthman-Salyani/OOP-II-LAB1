package Code;

public class Bus extends Vehicle{
    public Bus(int speed, int fuelLevel, String brand){
        super(speed, fuelLevel, brand);
    }

    @Override
    public void accelerate(){
        System.out.println("Bus: " + brand + " accelerates by stepping on the acceleration pedal.");
    }
    @Override
    public void stop(){
        System.out.println("Bus: " + brand + " stops by using the hand brake and the foot pedal.");
    }
    @Override
    public void gas(){
        System.out.println("Bus: " + brand + " has its fuel level as: " + fuelLevel +"%");
    }
}
