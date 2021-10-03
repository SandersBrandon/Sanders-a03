package baseline;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Solution24Test {

    @Test
    void isAnagram() {
        String firstInput = "tone";
        String secondInput = "note";

        char[] firstArray =firstInput.toCharArray();
        char[] secondArray = secondInput.toCharArray();

        assertEquals(firstArray.length, secondArray.length);

    }
}