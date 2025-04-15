package com.plurasight;

public class FullNameParser extends FullNameGenerator {

    public void FullNameParse(){
        System.out.print("Hello user" +
                "\n Please write out your full name: ");

         setFullName(scanner.nextLine());

        String[] nameArray = getFullName().trim().split(" ");

        setFirstName(nameArray[0]);

        if(nameArray.length == 2){ //this means that there is only first and last name and it prints it out
            setLastName(nameArray[1]);
            System.out.println("\nFirst Name: " + getFirstName());
            System.out.println("Last Name: " + getLastName());
        }
        else if(nameArray.length >= 3) {                   //this means that there is first middle and last name and suffix
            setMiddleName(nameArray[1]);
            setLastName(nameArray[2]);
            if(nameArray.length == 4){                  //if statement just for suffix
                setSuffix(nameArray[3]);
            }

            System.out.println("\nFirst Name: " + getFirstName());      //wall of print statements
            System.out.println("Middle Name: " + getMiddleName());
            System.out.println("Last Name: " + getLastName());
            if(getSuffix() != null){                                    //will only trigger if 
                System.out.println("Suffix: " + getSuffix());
            }
        }
        else{
            System.out.println("you only have a first name? who are you Plato? " +
                    "\n First Name: " + getFirstName());
        }
    }//fullParse method



}
