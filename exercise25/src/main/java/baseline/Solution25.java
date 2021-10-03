/*
 *  UCF COP3330 Fall 2021 Assignment 3 Solutions
 *  Copyright 2021 Brandon Sanders
 */
package baseline;

import java.util.Scanner;
import java.util.regex.Pattern;
import java.util.regex.Matcher;


/* Ask for user input and pass it into a string
* Create password validator function that reads the input
* Set up parameters to determine the strength of the input as a password
* Create a case where password does not meet any of the criteria
* Single output statement
*/

public class Solution25 {

    static void passwordValidator(String passwordInput, int strengthNum){

        Pattern specialChars = Pattern.compile("[!@#$%&*()'+,-./:;<=>?^_`{|}]");
        Pattern onlyNums = Pattern.compile("[0-9]");
        Pattern onlyLetters = Pattern.compile("[A-Za-z]");


        if ( onlyNums.matcher(passwordInput).find() && passwordInput.length() < 8 && !onlyLetters.matcher(passwordInput).find()){
            strengthNum = 1;

        }
        if( onlyLetters.matcher(passwordInput).find() && passwordInput.length() < 8 && !onlyNums.matcher(passwordInput).find()){
            strengthNum = 2;
        }
        if( onlyNums.matcher(passwordInput).find() && onlyLetters.matcher(passwordInput).find() && passwordInput.length() >= 8){
            strengthNum = 3;

        }

        if(onlyNums.matcher(passwordInput).find() && onlyLetters.matcher(passwordInput).find() &&
                specialChars.matcher(passwordInput).find() && passwordInput.length() >= 8){
            strengthNum =4;

        }
        int strengthAns = strengthNum;
        String passwordStr;
        switch (strengthAns){
            case 1: passwordStr = "very weak";
            break;
            case 2 : passwordStr = "weak";
            break;
            case 3 : passwordStr = "strong";
            break;
            case 4 : passwordStr = "very strong";
            break;
            default: passwordStr = "unknown strength";


        }

        System.out.println("The password '" + passwordInput + "' is a " + passwordStr + " password." );

    }

    public static void main(String[] args) {
        final Scanner in = new Scanner(System.in);
        int strengthNum=0;

        System.out.println("Please enter your password :");
        String passwordInput = in.nextLine();
        char [] passwordArray = passwordInput.toCharArray();

        passwordValidator(passwordInput, strengthNum);




    }



}
