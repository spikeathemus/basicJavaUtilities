package extendingSamples.Entities;

public class Car extends Vehicle{
    public Car(int maxTank, int speed, Integer numberOfPassangers, int fuelUsage, colorEnum color, boolean seatbeltsOn) {
        super(maxTank, speed, numberOfPassangers, fuelUsage, color);
    }
}
