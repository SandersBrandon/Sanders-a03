/*
 *  UCF COP3330 Fall 2021 Assignment 3 Solutions
 *  Copyright 2021 Brandon Sanders
 */
package baseline;

import java.util.Scanner;

/*Creating multiplication table of fixed size
* Create nested loop to keep track of the number we are multiplying and where we are
* Start at multiples of 1, then multiples of 2 ... multiples of 12
* Format output so it looks good
* Print the whole multiplication table
*/

public class Solution30 {

    static void MultiplicationTable(int multiSize) {

        for(int baseNum = 1; baseNum <= multiSize; baseNum++) {

            for(int multiNum = 1; multiNum <= multiSize; multiNum++) {

                System.out.format("%5d", baseNum * multiNum);
            }

            System.out.println();
        }
    }

    public static void main(String[] args) {

        final Scanner in = new Scanner(System.in);

        int multiSize = 12;

        MultiplicationTable(multiSize);
    }

}
