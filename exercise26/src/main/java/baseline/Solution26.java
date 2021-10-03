/*
 *  UCF COP3330 Fall 2021 Assignment 3 Solutions
 *  Copyright 2021 Brandon Sanders
 */

package baseline;

import java.util.Scanner;
import java.lang.Math;

/* Get user input turn it into necessary data
*Create a decimal from the APR percentage
* Create a class Payment Calculator with a method calculateMonthsUntilPaidOff and find number of months
*Round up fractions to nearest cent
*Output necessary information
*/

public class Solution26 {
    class PaymentCalculator {
        static void calculateMonthsUntilPaidOff(){
            final Scanner in = new Scanner(System.in);
            System.out.println("What is your balance? :");
            float userBal = in.nextFloat();
            System.out.println("What is the APR on the card (as a percent) :");
            float userAPR = in.nextFloat();
            System.out.println("What is the monthly payment to make?");
            float userPayment = in.nextFloat();

            float decimalAPR = userAPR/100;
            float realAPR = decimalAPR/365;

            double numMonths = (-0.0333333333333333333333 * Math.log(1+(userBal/userPayment) * (1- Math.pow(1+realAPR,30))))
                    / Math.log(1+realAPR) + 1;
            String monthsAns = String.format("%.0f",numMonths);
            System.out.printf("It will take you "+ monthsAns + " months to pay off this card");


        }

    }

    public static void main(String[] args) {
    PaymentCalculator.calculateMonthsUntilPaidOff();

    }
}
