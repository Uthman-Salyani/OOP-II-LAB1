package Code;

public class Sedan extends Vehicle implements Automobile {
    public Sedan(int speed, int fuelLevel, String brand){
        super(speed, fuelLevel, brand);
    }

    @Override
    public void accelerate(){
        System.out.println("Sedan: " + brand + " accelerates by stepping on the acceleration pedal");
    }
    //Overloading
    public void accelerate(int speed){
        System.out.println("Sedan: " + brand + " accelerates to: " + speed +"km/h");
    }
    @Override
    public void stop(){
        System.out.println("Sedan: " + brand + " stops by using the hand brake and the brake pedal");
    }
    @Override
    public void gas(){
        System.out.println("Sedan: " + brand + " has its fuel level as: " + fuelLevel +"%");
    }

    @Override
    public void turning(){
        System.out.println("A sedan may turn by two front wheels or all four wheels");
    }
    @Override
    public void gearType(){
        System.out.println("A sedan may have an automatic gear type or a manual gear type");
    }
}
