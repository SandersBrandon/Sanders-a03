/*
 *  UCF COP3330 Fall 2021 Assignment 3 Solutions
 *  Copyright 2021 Brandon Sanders
 */
package baseline;

import java.util.Scanner;

/*Create loop to ask for user input 5 times
*Store the inputs into an array
*Sum up the array
* Output the added sum of the array
*/


public class Solution28 {

    static void AddingNumbers() {
        final Scanner in = new Scanner(System.in);
        int numArray[] = new int[5];
        int userSum = 0;

        for (int x = 0; x < 5; x++) {
            System.out.printf("Enter a number : ");
            numArray[x] = in.nextInt();
            userSum = userSum + numArray[x];

            }

        System.out.println("The total is: " + userSum);

    }

    public static void main(String[] args) {

        AddingNumbers();
    }
}


