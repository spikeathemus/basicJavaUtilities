package extendingSamples.Entities;

public class Vehicle implements VehicleController{

    public enum Color{Black, White, Blue, Red, Green};
    private boolean isTurnedOn;

    private int fuel;
    private int maxTank;
    private int speed;
    private Integer numberOfPassangers;
    private int fuelUsage;
    //dodaj kolor do konsturktora

    public Vehicle(int maxTank, int speed, Integer numberOfPassangers, int fuelUsage) {
        this.fuel = maxTank;


        this.maxTank = maxTank;
        this.speed = speed;
        this.numberOfPassangers = numberOfPassangers;
        this.fuelUsage = fuelUsage;
        this.isTurnedOn = false;
    }

    @Override
    public void turnOnTheEngine() {
        if(this.fuel>0){
            isTurnedOn = true;
            System.out.println("wrooom");
        } else {
            System.out.println("fuel up needed");
        }
    }

    @Override
    public void turnOffTheEngine() {
    this.speed=0;
    }

    @Override
    public void tankUp() {
// dodaj przy dziedziczeniu max do baku
    }

    @Override
    public void speedUp() {
        //while fuel powyzej 0 predkosc +10 , spalanie *1.1
    }

    @Override
    public void turn() {
        this.fuel -= fuelUsage;
        System.out.println("You just turned the vehicle");
    }

    @Override
    public void drive() {
        //paliwo - actual spalanie
    }

    @Override
    public void stopTheVehicle() {
        //jeśli speed 0 to już był, else redukuj speed o 0
    }

    @Override
    public void slowDownTheVehicle() {
        this.speed = 0;
        System.out.println("the vehicle stopped");
        //jeśli prędkość jest duża to motor się wywróci
    }

    @Override
    public void rocketMode() {
        while (this.fuel>0){
            this.speed += 10;
            this.fuel -= 20;
            System.out.printf("You actual speed is: $1 ,you are keeping up with the Rocket mode", this.speed);
        }
    }
}