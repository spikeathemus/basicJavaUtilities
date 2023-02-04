package extendingSamples.Entities;

public class Vehicle implements VehicleController{

    public enum colorEnum{Black, White, Blue, Red, Green};
    private boolean isTurnedOn;

    private int fuel;
    private int maxTank;
    private int speed;
    private Integer numberOfPassangers;
    private int fuelUsage;
    private colorEnum color;

    public Vehicle(int maxTank, int speed, Integer numberOfPassangers, int fuelUsage, colorEnum color) {
        this.fuel = maxTank;

        this.color = color;
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
        if(this.speed<=0){
            stopTheVehicle();
            System.out.println("The end");
        }
    }

    public boolean isTurnedOn() {
        return isTurnedOn;
    }

    public void setTurnedOn(boolean turnedOn) {
        isTurnedOn = turnedOn;
    }

    public int getFuel() {
        return fuel;
    }

    public void setFuel(int fuel) {
        this.fuel = fuel;
    }

    public int getMaxTank() {
        return maxTank;
    }

    public void setMaxTank(int maxTank) {
        this.maxTank = maxTank;
    }

    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public Integer getNumberOfPassangers() {
        return numberOfPassangers;
    }

    public void setNumberOfPassangers(Integer numberOfPassangers) {
        this.numberOfPassangers = numberOfPassangers;
    }

    public int getFuelUsage() {
        return fuelUsage;
    }

    public void setFuelUsage(int fuelUsage) {
        this.fuelUsage = fuelUsage;
    }

    public colorEnum getColor() {
        return color;
    }

    public void setColor(colorEnum color) {
        this.color = color;
    }
}