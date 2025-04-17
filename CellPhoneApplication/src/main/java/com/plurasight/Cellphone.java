package com.plurasight;

import java.util.Scanner;

public class Cellphone {

    private int serialNumber;                               //initialize variables
    private String model;
    private String carrier;
    private String phoneNumber;
    private String owner;

    Scanner scanner = new Scanner(System.in);               //global scanner object

    public Cellphone() {                                    //constructor
        this.serialNumber = 0;
        this.model = "";
        this.carrier = "";
        this.phoneNumber = "";
        this.owner = "";
    }

    public Cellphone(int serialNumber, String model, String carrier, String phoneNumber, String owner) {
        setSerialNumber(serialNumber);
        setModel(model);
        setCarrier(carrier);
        setPhoneNumber(phoneNumber);
        setOwner(owner);
    }

    public void turnOn(){                                   //main starter
        setUp();
        displayInfo();

    }
    public void setUp(){                                    //prompts user for input and uses setters
        System.out.print("\nWhat is the serial number? ");
        setSerialNumber(scanner.nextInt());
        scanner.nextLine();

        System.out.print("What model is the phone?" );
        setModel(scanner.nextLine());

        System.out.print("Who is the carrier? ");
        setCarrier(scanner.nextLine());

        System.out.print("What is the phone number? ");
        setPhoneNumber(scanner.nextLine());

        System.out.print("Who is the owner of the phone? ");
        setOwner(scanner.nextLine());

    }
    public void displayInfo(){                              //display the user's input
        System.out.println("\nHello, " + getOwner());
        System.out.println("This is your new " + getModel() + " with serial number " + getSerialNumber());
        System.out.println("Your carrier is " + getCarrier() + " and your phone number is " + getPhoneNumber());
        System.out.println("Enjoy your new phone!");
    }

    public void dial(String phoneNumber){                      //allows for interaction between 2 objects
        System.out.println();
        System.out.println(getOwner() + " 's phone is calling " + phoneNumber);

    }

    public void dial(Cellphone cellphone){                      //allows for interaction between 2 objects
        System.out.println();
        System.out.println(getOwner() + " 's phone is calling " + cellphone.getPhoneNumber());

    }

    public int getSerialNumber() {                          //getters and setters of each variable
        return serialNumber;
    }

    public void setSerialNumber(int serialNumber) {
        this.serialNumber = serialNumber;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getCarrier() {
        return carrier;
    }

    public void setCarrier(String carrier) {
        this.carrier = carrier;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getOwner() {
        return owner;
    }

    public void setOwner(String owner) {
        this.owner = owner;
    }
}
