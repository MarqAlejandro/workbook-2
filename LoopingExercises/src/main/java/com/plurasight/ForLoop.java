package com.plurasight;

public class ForLoop {

    public void main() throws InterruptedException {

        for(int i = 10; i > 0; i--){
            System.out.println("countdown: " + i);          //countdown from 10 - 0
            Thread.sleep(1000);                       //pauses print out by 1000 millisec or 1 sec
        }
        System.out.println("Launch!");                      //once out of loop print "Launch!"
    }
}
