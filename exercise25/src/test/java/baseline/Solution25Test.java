package baseline;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.regex.Pattern;

import static org.junit.jupiter.api.Assertions.*;
import java.util.regex.Pattern;
import java.util.regex.Matcher;

class Solution25Test {

    @Test
    void passwordValidator() {
        int strCheck = 1;
        int strNum = 1;
        String passwordInput = "abc123xyz";
        Pattern specialChars = Pattern.compile("[!@#$%&*()'+,-./:;<=>?^_`{|}]");
        Pattern onlyNums = Pattern.compile("[0-9]");
        Pattern onlyLetters = Pattern.compile("[A-Za-z]");

        if( onlyNums.matcher(passwordInput).find() && onlyLetters.matcher(passwordInput).find() && passwordInput.length() >= 8){
            strNum = 1;

        }else{
            strNum=0;

        }
        Assertions.assertEquals(1,strNum);

    }
}