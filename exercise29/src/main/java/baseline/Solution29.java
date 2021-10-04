/*
 *  UCF COP3330 Fall 2021 Assignment 3 Solutions
 *  Copyright 2021 Brandon Sanders
 */
package baseline;

import java.util.Scanner;
import java.util.regex.Pattern;
import java.util.regex.Matcher;


/* Ask for user input in a loop
*Create loop conditions where input is valid
* Throw out bad inputs
*Ask again for valid input
* Accept valid input calculate required information
* Output answer
*/

public class Solution29 {

    static void ValidInput(String userInput){
        final Scanner in = new Scanner(System.in);
        Pattern onlyNums = Pattern.compile("[1-9]");
        Pattern onlyLetters = Pattern.compile("[A-Za-z]");


         while (!onlyNums.matcher(userInput).find() ||  onlyLetters.matcher(userInput).find() ){
             System.out.println("Sorry. That's not a valid input"+"\r\n" +"What is the rate of return? :");
             userInput = in.nextLine();
         }

    }

    static void RateOfReturnCalculation(int returnRate){

        int yearsAns = 72 /returnRate;
        System.out.println("It will take "+ yearsAns +" years to double your initial investment");

    }

    public static void main(String[] args) {
        final Scanner in = new Scanner(System.in);

        System.out.println("What is the rate of return? :");
        String userInput = in.nextLine();

        ValidInput(userInput);

        int returnRate = Integer.parseInt(userInput);

        RateOfReturnCalculation(returnRate);
    }
}
