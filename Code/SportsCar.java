package Code;

// SportsCar.java
public class SportsCar extends Vehicle implements Automobile {
    public SportsCar(int speed, int fuelLevel, String brand){
        super(speed, fuelLevel, brand);
    }


    @Override
    public void accelerate() {
        System.out.println("Sports Car " + brand + " accelerates by twisting the stepping on the acceleration pedal");
    }
    @Override
    public void stop(){
        System.out.println("Sports Car: " + brand + " stops by using the hand brake and the brake pedal");
    }
    @Override
    public void gas(){
        System.out.println("Sedan: " + brand + " has its fuel level as: " + fuelLevel +"%");
    }

    @Override
    public void turning(){
        System.out.println("A Sports Car may turn by two front wheels or all four wheels");
    }
    @Override
    public void gearType(){
        System.out.println("A Sports Car may have an automatic gear type or a manual gear type");
    }
}
