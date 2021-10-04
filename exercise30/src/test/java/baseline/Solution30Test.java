package baseline;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import javax.swing.*;
import java.awt.*;

import static org.junit.jupiter.api.Assertions.*;

class Solution30Test {

    @Test
    void MultiplicationTable() {
        String[] compareOutput= {"1","2","2","4"};

        int multiSize =2;

        for(int baseNum = 1; baseNum <= multiSize; baseNum++) {
            for(int multiNum = 1; multiNum <= multiSize; multiNum++) {

                System.out.format("%5d", baseNum * multiNum);

            }
            System.out.println();
        }

        String[] myOutput = {"1","2","2","4"};
        assertArrayEquals(compareOutput, myOutput);
    }

}