package com.pluralsight;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Vehicle[] vehicles = new Vehicle[20];
        int vehicleCounter = 0;

        Vehicle[] vehicleinventory = {
                new Vehicle(101121, "Ford Explorer", "Red", 45000, 13500),
                new Vehicle(101122, "Toyota Camry", "Blue", 60000, 11000),
                new Vehicle(101123, "Chevrolet Malibu", "Black", 50000, 9700),
                new Vehicle(101124, "Honda Civic", "White", 70000, 7500),
                new Vehicle(101125, "Subaru Outback", "Green", 55000, 14500),
                new Vehicle(101126, "Jeep Wrangler", "Yellow", 30000, 16000)
        };



        Scanner scanner = new Scanner(System.in);
        while(true){

            System.out.println("What do you want to do?");
            System.out.println("1 - List all vehicles");
            System.out.println("2 - Search by make/model");
            System.out.println("3 - Search by price range");
            System.out.println("4 - Search by color");
            System.out.println("Add a vehicle");
            System.out.println("6 - Quit");

            System.out.print("Enter your command: ");

            int command = scanner.nextInt();
            scanner.nextLine();
            switch(command) {
                case 1:

                    listAllVehicles(vehicleinventory);
                    break;
                case 2:
                    System.out.print("What Color? ");
                    String color = scanner.nextLine();

                    findVehicleColor(vehicleinventory, color);
                    break;
                case 3:
                    System.out.print("What is the price? ");
                    float price = scanner.nextInt();
                    findVehiclesByPrice(vehicleinventory, price);
                case 5:
                    addAVehicle();
                    break;
                case 6:
                    return;
            }


        }
    }

    private static void findVehiclesByPrice(Vehicle[] inventory, float price) {
        for(Vehicle vehicle : inventory)
            if(vehicle.getPrice() == price)
                System.out.println(vehicle);
    }

    private static void addAVehicle(Vehicle[] slot, long vehicleId, String makeModel, String color, int odometerReading, float price) {

    }

    private static void findVehicleColor(Vehicle[] inventory, String color) {
        for(Vehicle vehicle : inventory)
            if(vehicle.getColor().equalsIgnoreCase(color))
                System.out.println(vehicle);


    }

    public static void listAllVehicles(Vehicle[] inventory) {
        for(Vehicle vehicle : inventory)
            System.out.println(vehicle);



    }


}
