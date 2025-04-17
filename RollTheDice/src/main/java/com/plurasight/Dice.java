package com.plurasight;

public class Dice {                                 //object class to create a 6-sided die
    private int maxValue = 6;                       //max value of die

    private int minValue = 1;                       //min value of die

    public int roll(){                              //

        return (int)(Math.random()* maxValue) + minValue;
    }

}
