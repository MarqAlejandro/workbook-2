package com.plurasight;

import java.util.Scanner;
import java.util.regex.Pattern;

public class ScoreChecker {

    static Scanner scanner = new Scanner(System.in);

    private String userInput;
    private String teamOneName;
    private String teamTwoName;
    private int teamOneScore;
    private int teamTwoScore;


    public void andTheWinnerIs(){
        //each comment is a method
        getUserInput();                                                     //get input from user
        dissectAndSet();                                                    //dissect the array into 2 string arrays and set ints and strings to labelled variables
        compareScores();                                                    //compare ints and print out the winner here

    }
    public void getUserInput(){
        System.out.println("Enter Team Names and Scores in one line" +
                "\nFormatted like this: Warriors:Clippers|119:124");
        userInput = scanner.nextLine();

    }

    public void dissectAndSet(){
        String[] tokens = userInput.split(Pattern.quote("|"));             //split into array

        String nameRawData = tokens[0];             //placeholders for 2nd arrays
        String scoreRawData = tokens[1];

        String[] nameTokens = nameRawData.split(Pattern.quote(":"));        //split again so each element is in its own space in an array
        String[] scoreTokens = scoreRawData.split(Pattern.quote(":"));

        teamOneName = nameTokens[0];                                           //set array elements into variables
        teamTwoName = nameTokens[1];

        teamOneScore = Integer.parseInt(scoreTokens[0].trim());                       //each score element should line up with the corresponding name
        teamTwoScore = Integer.parseInt(scoreTokens[1].trim());
    }
    public void compareScores(){
        if(teamOneScore > teamTwoScore){
            System.out.println("\nWinner: " + teamOneName);
        }
        else if(teamOneScore < teamTwoScore){
            System.out.println("\nWinner: " + teamTwoName);
        }
        else{
            System.out.println("\nTied.");
        }
    }




}
