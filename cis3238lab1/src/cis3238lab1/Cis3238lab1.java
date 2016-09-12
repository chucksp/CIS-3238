/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cis3238lab1;

import org.junit.runner.JUnitCore;
import org.junit.runner.Result;
import org.junit.runner.notification.Failure;

/**
 *
 * @author tuf46632
 */

public class Cis3238lab1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.println("Hello World");
        
        Result result = JUnitCore.runClasses(cis3238lab1.TestJunit.class);
        
        for (Failure failure : result.getFailures()) {
            System.out.println(failure.toString());
        }
    }
    
}
