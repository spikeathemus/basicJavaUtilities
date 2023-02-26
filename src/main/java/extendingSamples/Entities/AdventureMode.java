package extendingSamples.Entities;

import java.util.Scanner;

public class AdventureMode {
    Car car = new Car(300,0,Integer.valueOf(5),6, Vehicle.colorEnum.Black, true);

    void userController(Vehicle actualVehicle){
        Scanner scanner = new Scanner(System.in);
        String userschoice = scanner.nextLine();
        System.out.println("1 - stop engine");
        System.out.println("2 - keep driving");
        System.out.println("3 - turn the vehicle");

        switch (userschoice){
            case "1": actualVehicle.stopTheVehicle();
            break;
            case "2": actualVehicle.drive();
            break;
            case "3": actualVehicle.turn();
            break;

            }
        }
    }

