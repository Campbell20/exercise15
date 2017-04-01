package com.SumOfEvenIntFromUsersInt;

import com.sun.org.glassfish.external.statistics.annotations.Reset;

import java.util.Scanner;

/**   
 * Name: John Campbell
 * Section: COSC/ITSE Intro to Programing
 * Exercise 15
 * Description: This program:
 * 1. gets the user's integers
 * 2. finds the even numbers from 2 to the user's integer (by dividing by 2 and making sure the remainder is 0).
 * 3. gets the sum of those even numbers
 * 4. outputs an error if the user types in anything less than 2 including negative numbers.
 **/


public class EvenIntegersFrom2 {
    private int intInput;
    private int intSum;
    private int intMinInt = 2;
    private int intMaxUserInt = 100; //lower this for slower machines

    public EvenIntegersFrom2(){
        GetUserInt();
    }

    //reset all of the counter variables
    private int CounterReset(){
        intSum = 0;
        return intSum;
    }
    //get info from user and reset all of the global variable's values
    private int GetUserInt() {
        Scanner objInput = new Scanner(System.in);
        System.out.println();
        System.out.println("Type in any number from " + intMinInt + " to " + intMaxUserInt + ".");
        System.out.println("The program will get the even numbers, and the sum of those numbers.");
        intInput = objInput.nextInt();
        CounterReset();
        CheckIntInput();
        return intInput;
    }

    //check to make sure the value of the user's input is 2 or more.
    private void CheckIntInput() {
        if (intInput < intMinInt) {
            //output an error and tell user to try again
            ToLowInt();
        } else if (intInput > intMaxUserInt) {
            //output an error and stop counter. Ask user to try again
            MaxUserInt();
        } else {
            //output the even numbers, add them, and print everything for the user
            HighEnoughIntToProcess();
        }
    }

    // if the user's input is less than 2, output an error message, and tell the user that number needs to be higher.
    private void ToLowInt() {
        System.err.println("MINIMUM VALUE REACHED!!!");
        System.out.println();
        System.out.println("The system stopped because you typed in a number lower than " + intMinInt + ".");
        System.out.println("Your number must be higher than " + intMinInt + " and can not be negative.");
        GetUserInt();
    }

    //if user's input is higher than max input allowed, the system will stop and ask the user to try a lower number.
    //This is to stop the program from continuously looping if the number too high for the computer to process.
    private void MaxUserInt(){
        System.err.println("MAX VALUE REACHED!!! ");
        System.out.println();
        System.out.println("The system stopped because you typed in a number higher than " + intMaxUserInt + ".");
        System.out.println("Your number must be lower than " + intMaxUserInt + ".");
        GetUserInt();
    }

    //if user's number is 2 or higher, find all the EVEN numbers between 2 and user's int, prints them, and adds them up
    private void HighEnoughIntToProcess() {
        System.out.println("Your even numbers are: ");
        for (int intValue = intMinInt; intValue <= intInput; intValue++) {
            //get all the even numbers from 2 or above
            switch (intValue % 2) {
                case 0:
                    //add up the EVEN numbers between 2 and user's int
                    System.out.print(intValue + ", ");
                    intSum = intSum + intValue;
            }
        }
       PrintValue();
    }

    //print the sum of the even numbers to the console
    private void PrintValue() {
        System.out.print("and...");
        System.out.println();
        System.out.println("The sum of those even numbers are: " + intSum + ".");
        GetUserInt();
    }
}

