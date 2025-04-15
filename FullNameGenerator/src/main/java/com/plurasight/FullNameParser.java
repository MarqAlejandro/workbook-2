package com.plurasight;

public class FullNameParser extends FullNameGenerator {

    public void FullNameParse(){
        System.out.print("Hello user" +
                "\n Please write out your full name: ");

         setFullName(scanner.nextLine());

        String fullName = getFullName();

        System.out.println(fullName.split(" "));
       // String firstName = setFirstName(fullName.);

    }


}
