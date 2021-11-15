package com.rupee.test;

import com.rupee.Rupee;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class RupeeTest {

    @Test
    void testForAddingRupeeValue(){
        Rupee rupeeValue1=new Rupee(5);
        Rupee rupeeValue2=new Rupee(2);
        int actualResult=rupeeValue1.addRupees(rupeeValue2);
        assertEquals(7, actualResult);
    }

    @Test
    void testForComparingRupeeValue(){
        Rupee rupeeValue1=new Rupee(7);
        Rupee rupeeValue2=new Rupee(7);
        boolean actualResult=rupeeValue1.compareRupees(rupeeValue2);
        assertTrue(actualResult);
    }
}
