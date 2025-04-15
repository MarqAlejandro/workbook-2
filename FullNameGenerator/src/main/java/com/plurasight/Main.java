package com.plurasight;

public class Main {
    public static void main(String[] args) {

        //FullNameGenerator generator = new FullNameGenerator(); //turned off so i can test the parser properly.

        //generator.generateName();

        FullNameParser parser = new FullNameParser();

        parser.FullNameParse();

    }
}