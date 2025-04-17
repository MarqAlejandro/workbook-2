package com.plurasight;

import java.util.Scanner;

public class AddressBuilder {

    private String name;                                            //initialization of private variables
    private String billingAddress = "Billing Address:\n";
    private String shippingAddress = "Shipping Address:\n";

    private Scanner scanner = new Scanner(System.in);

    public void AddressBuild() {
        System.out.print("Please provide the following information:" +
                "\nFull name:");
        this.name = scanner.nextLine();

        BillingBuilding();                                          //ask for user input and set it to variables
        ShippingBuilding();
        System.out.println();
        DisplayShippingInfo();                                      //print out
    }

    public void BillingBuilding(){                                  //prompts user to give input
        StringBuilder appendTool = new StringBuilder();             //all user's inputs will be appended here

        System.out.print("\nBilling Street and Unit number: ");
        appendTool.append(scanner.nextLine() + "\n");

        System.out.print("\nBilling City: ");
        appendTool.append(scanner.nextLine() + ", ");

        System.out.print("\nBilling State: ");
        appendTool.append(scanner.nextLine() + " ");

        System.out.print("\nBilling Zip: ");
        appendTool.append(scanner.nextLine());

        billingAddress = billingAddress.concat(appendTool.toString());  //adds new info to the template
    }

    public void ShippingBuilding(){                                //clone of BillingBuilding()
        StringBuilder appendTool = new StringBuilder();

        System.out.print("\nShipping Street and Unit number: ");
        appendTool.append(scanner.nextLine() + "\n");

        System.out.print("\nShipping City: ");
        appendTool.append(scanner.nextLine() + ", ");

        System.out.print("\nShipping State: ");
        appendTool.append(scanner.nextLine() + " ");

        System.out.print("\nShipping Zip: ");
        appendTool.append(scanner.nextLine());

        shippingAddress = shippingAddress.concat(appendTool.toString());
    }

    public void DisplayShippingInfo(){                          //displays all variables
        System.out.println(name + "\n");
        System.out.println(billingAddress + "\n");
        System.out.println(shippingAddress);
    }


}
