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
                case 3:
                    findVehiclesByPrice(listOfVehicles);
                    break;
                case 4:
                    findVehiclesByColor(listOfVehicles);
                    break;
                case 5:
                    addAVehicle(listOfVehicles, numberOfSlotsInList);
                    break;
                case 6:
                    System.out.println("Thank you for shopping with us. Please come again.");
                    return;
            }//switch case

        }//while loop
    }//main

    public static void listAllVehicles(Vehicle[] listOfVehicles) throws NullPointerException{               //list all vehicles via for-each loop and built-in display method
        System.out.println("Loading list...");

        for(Vehicle vehicle: listOfVehicles){                                                               //for-each loop that iterates through the object array and displays the car info as long as it exists
            try {
                vehicle.displayVehicleInfo();
            }
            catch (NullPointerException e){                                                                 //if there is no object then it will shoot out an error, this allows the loop to continue
                continue;
            }
        }

    }

    public static void findVehiclesByMakeModel(Vehicle[] listOfVehicles) throws NullPointerException{          //get input from user, and find cars that fit that make and model
        System.out.println("Finding a car by Make and Model.");
        System.out.print("Input a Make and Model," +
                "\n(example: Toyota Camry): ");
        String makeModel = scanner.nextLine();

        for(Vehicle vehicle: listOfVehicles) {                                                                  //for-each loop that iterates through the object array
            try {
                if (vehicle.getMakeModel().toLowerCase().compareTo(makeModel) == 0) {                           //if there is a match then print out the vehicle info
                    vehicle.displayVehicleInfo();
                }
            }
            catch (NullPointerException e){                                                                     //if there is no object then it will shoot out an error, this allows the loop to continue
                continue;
            }
        }
    }//end of method findVehicleByMakeModel

    public static void findVehiclesByPrice(Vehicle[] listOfVehicles) throws NullPointerException{       //get 2 floats that represent a price range, and find cars that fit within that price range
        System.out.println("Finding a car by Price.");
        System.out.print("Input a minimum price and maximum price," +
                "\nMinimum price: ");
        float minimumPrice = scanner.nextFloat();                                                       //getting min and max for the price range
        scanner.nextLine();

        System.out.print("Maximum price: ");
        float maximumPrice = scanner.nextFloat();
        scanner.nextLine();

        for(Vehicle vehicle: listOfVehicles) {                                                          //for-each loop that iterates through the object array
            try {
                float priceCheck = vehicle.getPrice();                                                  //instance variable so that getter isn't called 2 times per loop but instead just once
                if ((priceCheck >= minimumPrice) && (priceCheck <= maximumPrice)){                      //if statement that triggers if the vehicle price is within the price range
                    vehicle.displayVehicleInfo();
                }
            }
            catch (NullPointerException e){                                                              //if there is no object then it will shoot out an error, this allows the loop to continue
                continue;
            }
        }

    }

    public static void findVehiclesByColor(Vehicle[] listOfVehicles){                                   //get input from user, and find cars that fit that color
        System.out.println("Finding a car by Color.");
        System.out.print("Input a color: ");
        String color = scanner.nextLine();                                                              //get user's input

        for(Vehicle vehicle: listOfVehicles) {                                                          //for-each loop that iterates through the object array
            try {
                if (vehicle.getColor().toLowerCase().compareTo(color) == 0) {                           //if there is a match then print out the vehicle info
                    vehicle.displayVehicleInfo();
                }
            }
            catch (NullPointerException e){                                                             //if there is no object then it will shoot out an error, this allows the loop to continue
                continue;
            }
        }

    }


    public static void addAVehicle(Vehicle[] listOfVehicles, int numberOfSlotsInList){                  //loop through the array and find how many empty spots exists, get input from user on car info and use vehicle setters to store a new object in the next empty slot
        int counter = 0;                                                                                //instance variable initialized

        for(Vehicle vehicle: listOfVehicles) {                                                          //for-each loop to iterate through the array
            try {
                long throwAwayVariable = vehicle.getVehicleId();                                        //throw away call to force the null error

            } catch (NullPointerException e) {                                                          //this code will only trigger if there is no object in that slot, meaning there's no car, therefore a null error

                counter++;                                                                              //this will increment the counter by 1
               // System.out.println(counter);                                                         //this was mainly used for debugging purposes
                continue;                                                                              //continue through the for-each loop
            }
        }
        System.out.println("We have a total of " + numberOfSlotsInList + " spots. Empty spots: " + counter); //display number of empty slots

        int newSlot = numberOfSlotsInList - counter;                                                        //this will be the slot where we will be putting the new car

        listOfVehicles[newSlot] = new Vehicle();                                                            //initializing object with blank constructor

        System.out.print("To add a car please input the following information." +                           //the following is just prompting the user for input
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
        scanner.nextLine();                                                                                 //the end of the user prompts

        listOfVehicles[newSlot].displayVehicleInfo();                                                       //displays the added car at the slot

    }


}//class