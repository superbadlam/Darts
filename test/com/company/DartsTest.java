package com.company;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class DartsTest {
    private Darts darts;
    @BeforeEach
    public void init(){
        darts = new Darts();
    }
    @Test
    public void testZeroZero(){
        assertEquals(darts.calcBonuses(0,0),10);
    }
    @Test
    public void testInnerCircle(){
        assertEquals(darts.calcBonuses(0,1),10);
    }
    @Test
    public void testMiddleCircle(){
        assertEquals(darts.calcBonuses(1,4),5);
    }
    @Test
    public void testExternalCircle(){
        assertEquals(darts.calcBonuses(1,5),1);
    }
    @Test
    public void testOutOfBoard(){
        assertEquals(darts.calcBonuses(1,15),0);
    }
}