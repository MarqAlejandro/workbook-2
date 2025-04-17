package com.plurasight;

public class Main {
    public static void main(String[] args) {


        Cellphone cellphone1 = new Cellphone();

        Cellphone cellphone2 = new Cellphone();

        cellphone1.turnOn();

        cellphone2.turnOn();

        display(cellphone1);
        display(cellphone2);

        cellphone1.dial(cellphone2.getPhoneNumber());
        cellphone2.dial(cellphone1.getPhoneNumber());
        System.out.println();




    }

    public static void display(Cellphone cellphone){
        System.out.println();
        System.out.println("Owner: " + cellphone.getOwner());
        System.out.println("Model: " + cellphone.getModel());
        System.out.println("Serial Number: " + cellphone.getSerialNumber());
        System.out.println("Carrier: " + cellphone.getCarrier());
        System.out.println("Phone Number: " + cellphone.getPhoneNumber());


    }
}