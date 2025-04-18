package com.plurasight;

public class TestStatistic {

    private double[] testScores = { 76, 77, 78, 80, 68, 66, 90, 99, 100, 60};   //initialized array with values

    private double average;                                                     //initialized available variables
    private double highScore;
    private double lowScore;

    public void doAThing(){                                                     //main starter method
        calculateAndSetAverage();                                               //calls other methods
        findAndSetHighestScore();
        findAndSetLowestScore();
        displayInfo();
    }

    public void displayInfo(){                                                  //prints out the variables
        System.out.println("Average: " + average);
        System.out.println("Highest: " + highScore);
        System.out.println("Lowest: " + lowScore);
    }

    public void calculateAndSetAverage(){                                       //accumulator and divide by array.length
        double sum = 0;                                                         //instance variables to hold values
        int numberOfScores = testScores.length;

        for (double testScore : testScores){                                    //for-each loop to iterate through array
            sum += testScore;                                                   //accumulator algorithm
        }

        this.average = sum / numberOfScores;                                    //update the real variable by average formula
    }

    public void findAndSetHighestScore(){                                       //loop through array and find the highest value
        double compareValue = 0;                                                //instance variable is initialized to 0 the lowest possible score

        for (double testScore : testScores){                                    //for-each loop to iterate through array
            if(testScore > compareValue){                                       //if logic that determines max value
                compareValue = testScore;
            }
        }
        this.highScore = compareValue;                                          //update the real variable
    }

    public void findAndSetLowestScore(){                                        //effectively the same as findAndSetHighestScore() method
        double compareValue = 100;                                              //finds the lowest score using the highest possible score, 100

        for (double testScore : testScores){                                    //for-each loop to iterate through array
            if(testScore < compareValue){                                       //if logic that determines min value
                compareValue = testScore;
            }
        }
        this.lowScore = compareValue;                                           //update the real variable
    }

}

