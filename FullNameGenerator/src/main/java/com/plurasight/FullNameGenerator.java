package com.plurasight;

import java.util.Scanner;

public class FullNameGenerator {

    static Scanner scanner = new Scanner(System.in);

    private String firstName;
    private String middleName;
    private String lastName;
    private String suffix;
    private String fullName = "";


    public void generateName(){

        System.out.print("Welcome, User." +
                "\n Please input your first name: ");
        firstName = scanner.nextLine();
        firstName = firstName.trim();

        System.out.print("\n If applicable, please input your middle name: ");
        middleName = scanner.nextLine();
        middleName = middleName.trim();

        System.out.print("\n Please input your last name: ");
        lastName = scanner.nextLine();
        lastName = lastName.trim();

        System.out.print("\n If applicable, please input your suffix: ");
        suffix = scanner.nextLine();
        suffix = suffix.trim();

        Combine();

        System.out.println("Your full name is: " + fullName);

    }

    public void Combine(){
        fullName = firstName.concat(" ");

        if(!middleName.isEmpty()){
            fullName = fullName.concat(middleName).concat(" ");
        }
        fullName = fullName.concat(lastName);

        if(!suffix.isEmpty()){
            fullName = fullName.concat(", ").concat(suffix);
        }


    }
    public String getFullName(){
        return fullName;
    }
    public void setFullName(String fullName){
        this.fullName = fullName;
    }

    public String getFirstName(){
        return firstName;
    }
    public void setFirstName(String firstName){
        this.firstName = firstName;
    }

    public String getMiddleName(){
        return middleName;
    }
    public void setMiddleName(String middleName){
        this.middleName = middleName;
    }

    public String getLastName(){
        return lastName;
    }
    public void setLastName(String lastName){
        this.lastName = lastName;
    }

    public String getSuffix(){
        return suffix;
    }
    public void setSuffix(String suffix){
        this.suffix = suffix;
    }




}
