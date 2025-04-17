package com.plurasight;

public class Main {
    public static void main(String[] args) throws InterruptedException{


        System.out.println("Hello, User!");

        WhileLoop whileLoop = new WhileLoop();
        DoWhileLoop doWhileLoop = new DoWhileLoop();
        ForLoop forLoop = new ForLoop();

        whileLoop.main();
        doWhileLoop.main();
        forLoop.main();

    }
}