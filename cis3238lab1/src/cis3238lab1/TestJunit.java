/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cis3238lab1;

import org.junit.Test;
import static org.junit.Assert.assertEquals;

/**
 *
 * @author tuf46632
 */
public class TestJunit {
    
    Date d1 = new Date(2001, 7, 15);
    Date d2 = new Date(1991, 1, 23);
    Date d3 = new Date(2009, 5, 9);
    Date d4 = new Date(2006, 9, 2);
    
    @Test    
    public void testPrintMessage1() {
        assertEquals(3838, d1.daysTo(d2));
    }
    
    @Test    
    public void testPrintMessage2() {
        assertEquals(1, d1.daysTo(d3));
    }
    
    @Test    
    public void testPrintMessage3() {
        assertEquals(6704, d2.daysTo(d3));
    }
    
    @Test    
    public void testPrintMessage4() {
        assertEquals(20, d4.daysTo(d1));
    }
    
    @Test    
    public void testPrintMessage5() {
        assertEquals(5736, d4.daysTo(d2));
    }
    
    @Test    
    public void testPrintMessage6() {
        assertEquals(20, d4.daysTo(d3));
    }
}
