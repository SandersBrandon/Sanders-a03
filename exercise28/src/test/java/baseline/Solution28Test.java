package baseline;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.Scanner;

import static org.junit.jupiter.api.Assertions.*;


class Solution28Test {
    @Test

     void AddingNumbers() {
        int[] numArray = {1,2,3,4,5};
        int sum =0;
        for (int x=0; x <5; x++){

            sum = sum + numArray[x];


        }
        Assertions.assertEquals(sum, 15);


    }



}

