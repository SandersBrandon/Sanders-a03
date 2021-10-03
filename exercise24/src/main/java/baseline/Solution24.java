/*
 *  UCF COP3330 Fall 2021 Assignment 3 Solutions
 *  Copyright 2021 Brandon Sanders
 */

package baseline;

import java.util.Scanner;
import java.util.Arrays;

/* Firstly print then get user input */
/* Create a boolean function isAnagram */
/*Compare the two strings and return true or false if theyre anagrams*/
/*Print out the input and if they are anagrams*/


public class Solution24 {

    static void isInputAnagram(String firstInput, String secondInput){
       boolean  status = true;
       if (firstInput.length() != secondInput.length()){
           status= false;

       }
       else {
           char[] firstInputArray = firstInput.toCharArray();
           char[] secondInputArray = secondInput.toCharArray();
           Arrays.sort(firstInputArray);
           Arrays.sort(secondInputArray);
           status =  Arrays.equals(firstInputArray , secondInputArray);

       }
       if (status){
           System.out.println("'" + firstInput + "'" + " and " + "'" + secondInput + "'" + " are anagrams.");
       }
       else {
           System.out.println("'" + firstInput + "'" + " and " + "'" + secondInput + "'" + " are not anagrams.");
       }



    }


    public static void main(String[] args) {
        final Scanner in = new Scanner(System.in);

        System.out.println("Enter two strings and I'll tell you if they are anagrams:  \r\n  Enter the first string : ");
        String firstInput = in.nextLine();
        System.out.println("Enter the second string: ");
        String secondInput = in.nextLine();

        isInputAnagram(firstInput, secondInput);


    }
}
