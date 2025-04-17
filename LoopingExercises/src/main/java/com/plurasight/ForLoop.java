package com.plurasight;

public class ForLoop {

    public void main() throws InterruptedException {

        for(int i = 10; i > 0; i--){
            System.out.println("countdown: " + i);
            Thread.sleep(1000);
        }
        System.out.println("Launch!");
    }
}
