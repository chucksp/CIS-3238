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
    
    @Test    
    public void testPrintMessage() {
        assertEquals(3838, d1.daysTo(d2));
        assertEquals(2986, d1.daysTo(d3));
        assertEquals(6704, d2.daysTo(d3));
    }
}
