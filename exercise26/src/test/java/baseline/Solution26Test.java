package baseline;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

 class Solution26Test {
@Test
        void PaymentCalculator(){
    float userBal = 5000;
    float userPayment = 100;
    float userAPR = 12;
    float decimalAPR = userAPR/100;
    float realAPR = decimalAPR/365;

    double numMonths = (-0.0333333333333333333333 * Math.log(1+(userBal/userPayment) * (1- Math.pow(1+realAPR,30))))
            / Math.log(1+realAPR) + 1;
    String monthsFormat = String.format("%.0f",numMonths);
    int monthsAns = Integer.parseInt(monthsFormat);
    Assertions.assertEquals(monthsAns,70);
}
        }


