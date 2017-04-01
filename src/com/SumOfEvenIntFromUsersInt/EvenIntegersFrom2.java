package com.SumOfEvenIntFromUsersInt;

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
    private int intMaxValue = 100; //lower this for slower machines


    //get info from user and reset all of teh gobal variable's values
    public int GetUserInt() {
        Scanner objInput = new Scanner(System.in);
        System.out.println();
        System.out.println("Type in any number from 2 to " + intMaxValue + ".");
        System.out.println("The program will get the even numbers, and the sum of those numbers.");
        intInput = objInput.nextInt();
        intSum = 0;
        CheckIntInput();
        return intInput;
    }

    //check to make sure the value of the user's input is 2 or more.
    private void CheckIntInput() {
        if (intInput < 2) {
            LowValue();
        } else if (intInput > intMaxValue) {
            MaxValue();
        } else {
            HighValue();
        }
    }

    // if the user's input is less than 2, output an error message, and tell the user that number needs to be higher.
    private void LowValue() {
        System.err.println("Wrong Number!!");
        System.out.println("Your number must be higher than 2 and can not be negative.");
        System.out.println("");
        GetUserInt();
    }

    //if user's input is higher than max value, the system will stop and ask the user to try a lower number. This is
    //to stop the program from continously looping if the numbers is really high.
    private void MaxValue(){
        System.err.print("Max value reached!!! ");
        System.out.println("The system stopped because you reached the max value of " + intMaxValue + ".");
        System.out.println("");
        GetUserInt();
    }

    //if user's number is 2 or higher, find all the EVEN numbers between 2 and user's int and adds them up
    private void HighValue() {
        System.out.println("Your even numbers are: ");
        for (int intValue = 2; intValue <= intInput; intValue++) {
            //get all the even numbers from 2 or above
            switch (intValue % 2) {
                case 0:
                    //add up the EVEN numbers between 2 and user's int
                    System.out.print(intValue + ", ");
                    intSum = intSum + intValue;
            }
        }
        System.out.print("and...");
        System.out.println();
        System.out.println("The sum of those even numbers are: " + intSum + ".");
    }



}

