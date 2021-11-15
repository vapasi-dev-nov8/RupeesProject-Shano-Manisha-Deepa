package com.rupee.test;

import com.rupee.Rupee;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class RupeeTest {

    @Test
    void addingRupeeValue(){
        Rupee rupeeValue1=new Rupee(5);
        Rupee rupeeValue2=new Rupee(2);
        Rupee actualResult=rupeeValue1.add(rupeeValue2);
        assertEquals(new Rupee(7).getRupeeValue() ,actualResult.getRupeeValue());
    }

    @Test
    void comparingEqualRupeeValue(){
        Rupee rupeeValue1=new Rupee(7);
        Rupee rupeeValue2=new Rupee(7);
        boolean actualResult=rupeeValue1.equals(rupeeValue2);
        assertTrue(actualResult);
    }

    @Test
    void comparingNonEqualRupeeValue(){
        Rupee rupeeValue1=new Rupee(17);
        Rupee rupeeValue2=new Rupee(7);
        boolean actualResult=rupeeValue1.equals(rupeeValue2);
        assertFalse(actualResult);
    }
}
