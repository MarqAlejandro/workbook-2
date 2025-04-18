package com.plurasight;

public class Main {


  static Dice dice1 = new Dice();                       //initialized static variables
  static Dice dice2 = new Dice();                       //so that static methods can use it

   static int roll1;                                    //used to store the roll generated by the Dice objects
   static int roll2;

   static int twoCounter = 0;                              //updates when sum of 2 rolls is 2
   static int fourCounter = 0;                             //                               4
   static int sixCounter = 0;                              //                               6
   static int sevenCounter = 0;                            //                               7

    public static void main(String[] args) {

        int rollCounter = 0;                                //initialize do-while loop counter

        System.out.println("rolling dice...");
        do{                                                  //start of loop
            if(rollCounter >= 1) {
                System.out.println("again...");
            }
            roll1 = dice1.roll();                           //call roll method of Dice object
            roll2 = dice2.roll();

            int sum = roll2 + roll1;                        //sum initialized and value stores the sum value of 2 rolls

            System.out.print("Roll: " + rollCounter + "   " + roll1 + " - " + roll2 + "  ");
            System.out.println("Sum: " + sum);

            if(sum == 2){                                    //branch of if statements to update counters if it occurs
                twoCounter++;
            }
            else if (sum == 4) {
                fourCounter++;
            }
            else if (sum == 6) {
                sixCounter++;
            }
            else if (sum == 7) {
                sevenCounter++;
            }



            rollCounter++;                                  //update counter
        }while(rollCounter < 100);
        System.out.println();
        display();                                          //display method

    }

    public static void display(){                           //will print out the results
        System.out.println("Display 2s rolled, 4s rolled, 6s rolled, and 7s rolled");
        System.out.println("2's: " + twoCounter
                        +"\n4's: " + fourCounter
                        +"\n6's: " + sixCounter
                        +"\n7's: " + sevenCounter);
    }
}