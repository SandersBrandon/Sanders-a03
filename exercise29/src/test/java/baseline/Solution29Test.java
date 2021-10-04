package baseline;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;
import java.util.regex.Pattern;
import java.util.regex.Matcher;

class Solution29Test {

    @Test
    void validInput() {
        Pattern onlyNums = Pattern.compile("[1-9]");
        Pattern onlyLetters = Pattern.compile("[A-Za-z]");
        String userInput = "seven";


        if (!onlyNums.matcher(userInput).find() ||  onlyLetters.matcher(userInput).find() ){
            System.out.println("Sorry. That's not a valid input"+"\r\n" +"What is the rate of return? :");

        }
    }

    @Test
    void rateOfReturnCalculation() {
        int yearsAns = 72 /4;
        System.out.println("It will take "+ yearsAns +" years to double your initial investment");
    }
}