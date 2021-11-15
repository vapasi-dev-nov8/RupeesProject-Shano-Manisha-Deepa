package com.rupee.test;

import com.rupee.Rupee;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class RupeeTest {

    @Test
    void testForAddingRupeeValue(){
        Rupee fiveRupee=new Rupee(5);
        Rupee twoRupee=new Rupee(2);
        int actualResult=fiveRupee.addRupees(twoRupee);
        assertEquals(7, actualResult);
    }

    @Test
    void testForComparingRupeeValue(){
        Rupee sevenRupee=new Rupee(7);

        int actualResult=sevenRupee.compareRupees(sevenRupee);
        assertEquals(7, actualResult);
    }
}
