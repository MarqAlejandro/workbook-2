package com.plurasight;

import java.util.Scanner;

public class Main {

    static Scanner scanner = new Scanner(System.in);                                                                //made static so other static methods can use it

    public static void main(String[] args) throws NullPointerException {

        System.out.println("Hello, User!");


        Vehicle[] listOfVehicles = new Vehicle[20];                                                                 //object array set to 20 spaces
        int numberOfSlotsInList = listOfVehicles.length;                                                            //used later in the code

        listOfVehicles[0] = new Vehicle(101121,"Ford Explorer","Red",45000,13500 );         //presets
        listOfVehicles[1] = new Vehicle(101122,"Toyota Camry","Blue",60000,11000 );
        listOfVehicles[2] = new Vehicle(101123,"Toyota Camry","Black",50000,9700);
        listOfVehicles[3] = new Vehicle(101124,"Honda Civic","White",70000,7500 );
        listOfVehicles[4] = new Vehicle(101125,"Subaru Outback","Green",55000,14500);
        listOfVehicles[5] = new Vehicle(101126,"Jeep Wrangler","Yellow",30000,16000 );


        int command = 0;                                                                                        //user command
        while(command != 6){
            System.out.println("What do you want to do?");
            System.out.println("  1 - List all vehicles");
            System.out.println("  2 - Search by make/model");
            System.out.println("  3 - Search by price range");
            System.out.println("  4 - Search by color");
            System.out.println("  5 - Add a vehicle");
            System.out.println("  6 - Quit");
            System.out.print("Enter your command: ");

            command = scanner.nextInt();                                                                    //scanner awaits int number, presumably a number from 1-6
            scanner.nextLine();                                                                             //eats line
            switch(command) {                                                                               //switch to control which method gets used or to exit the while loop menu
                case 1:
                    listAllVehicles(listOfVehicles);
                    break;
                case 2:
                    findVehiclesByMakeModel(listOfVehicles);
                    break;
                case 5:
                    addAVehicle(listOfVehicles, numberOfSlotsInList);
                    break;
                case 3:
                case 4:
                    System.out.println("features are not working yet. Please try again.");
                    break;
                case 6:
                    System.out.println("Thank you for shopping with us. Please come again.");
                    return;
            }//switch case

        }//while loop
    }//main

    public static void listAllVehicles(Vehicle[] listOfVehicles) throws NullPointerException{
        System.out.println("Loading list...");

        for(Vehicle vehicle: listOfVehicles){
            try {
                vehicle.displayVehicleInfo();
            }
            catch (NullPointerException e){
                continue;
            }
        }

    }

    public static void findVehiclesByMakeModel(Vehicle[] listOfVehicles) throws NullPointerException{
        System.out.println("Finding a car by Make and Model.");
        System.out.print("Input a Make and Model," +
                "\n(example: Toyota Camry): ");
        String makeModel = scanner.nextLine();

        for(Vehicle vehicle: listOfVehicles) {
            try {
                if (vehicle.getMakeModel().compareTo(makeModel) == 0) {
                    vehicle.displayVehicleInfo();
                }
            }
            catch (NullPointerException e){
                continue;
            }
        }
    }//end of method findVehicleByMakeModel

    public static void addAVehicle(Vehicle[] listOfVehicles, int numberOfSlotsInList){
        int counter = 0;

        for(Vehicle vehicle: listOfVehicles) {
            try {
                vehicle.getVehicleId();

            } catch (NullPointerException e) {

                counter++;
                System.out.println(counter);
                continue;
            }
        }
        System.out.println("We have a total of " + numberOfSlotsInList + " spots. Empty spots: " + counter);

        int newSlot = numberOfSlotsInList - counter;

        listOfVehicles[newSlot] = new Vehicle();

        System.out.print("To add a car please input the following information." +
                "\nVehicle ID Number: ");
        listOfVehicles[newSlot].setVehicleId(scanner.nextLong());

        scanner.nextLine();

        System.out.print("Make[space]Model: ");
        listOfVehicles[newSlot].setMakeModel(scanner.nextLine());

        System.out.print("Color: ");
        listOfVehicles[newSlot].setColor(scanner.nextLine());

        System.out.print("Odometer: ");
        listOfVehicles[newSlot].setOdometerReading(scanner.nextInt());

        scanner.nextLine();

        System.out.print("Blue Book Pricing: ");
        listOfVehicles[newSlot].setPrice(scanner.nextFloat());

        scanner.nextLine();

        listOfVehicles[newSlot].displayVehicleInfo();

    }


}//class