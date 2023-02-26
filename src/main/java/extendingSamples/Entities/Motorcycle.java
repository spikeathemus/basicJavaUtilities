package extendingSamples.Entities;

public class Motorcycle extends Vehicle{
    public Motorcycle(int maxTank, int speed, Integer numberOfPassangers, int fuelUsage, colorEnum color) {
        super(maxTank, speed, numberOfPassangers, fuelUsage, color);
        setMaxTank(50);
        setNumberOfPassangers(2);
    }
}
