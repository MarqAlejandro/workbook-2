package com.plurasight;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class TheaterReservations {

    private String name;
    private LocalDate date;                        //formatted as MM/DD/YYYY
    private int numberOfTickets;

    static Scanner scanner = new Scanner(System.in);

    public TheaterReservations() {
        this.name = "default name";
        this.numberOfTickets = 0;
    }

    public void setName(String name) {
        String[] tempName = name.trim().split(" ");
        String firstNameLast = tempName[0];
        String lastNameFirst = tempName[1];

        lastNameFirst = lastNameFirst.concat(", ").concat(firstNameLast); //swaps the last and first names and adds a ", "

        this.name = lastNameFirst;
    }

    public String getName() {
        return name;
    }

    public void setDate(String date) {
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("MM/dd/yyyy");    //converts string into LocalDate object
        this.date = LocalDate.parse(date, formatter);
    }

    public LocalDate getDate() {
        return date;
    }

    public void setNumberOfTickets(int numberOfTickets) {
        this.numberOfTickets = numberOfTickets;
    }

    public int getNumberOfTickets() {
        return numberOfTickets;
    }

    public void getUserData() {                              //main input method that uses all setters
        String userInput;                                    //instance variables that are only used for temporary storage
        int tempvalue;                                      //used so to convert userInput into an int
        System.out.print("Welcome to TicketHoarder" +
                "\nPlease input your first and last name: ");
        setName(userInput = scanner.nextLine());
        System.out.println();

        System.out.print("Please input the date of your event." +
                "\nFormatted as MM/DD/YYYY: ");
        setDate(userInput = scanner.nextLine());
        System.out.println();

        System.out.print("Please input the number of tickets: ");
        setNumberOfTickets(tempvalue = Integer.parseInt(userInput = scanner.nextLine()));
        System.out.println();
    }

    public void ticketReserve() {                    //calls input method, and uses getters to print statements depending on number of tickets
        getUserData();

        int tempValue = getNumberOfTickets();           //instance variables that is used in if logic
        if (tempValue == 1) {
            System.out.println(tempValue + " ticket reserved for " + getDate() + " under " + getName());
        } else {
            System.out.println(tempValue + " tickets reserved for " + getDate() + " under " + getName());
        }
    }
}